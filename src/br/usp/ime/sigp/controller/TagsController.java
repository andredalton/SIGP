package br.usp.ime.sigp.controller;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.usp.ime.sigp.dao.GenericDAOString;
import br.usp.ime.sigp.jpa.BaseEntityString;
import br.usp.ime.sigp.modelo.Tag;

@Resource
public class TagsController {
    private final GenericDAOString dao;
    private final Result result;

    public TagsController(GenericDAOString dao, Result result) {
         this.result   = result;
         this.dao      = dao;
    }
    
    @Path({"/tags/", "/tags"})
    public void list() {
         List<BaseEntityString> tags = dao.selectByNamedQuery("selectTags");
         result.include("tags", tags);
    }

    @Path("/tag/form")
    public void form() {

    }

    @Path("/tag/edit/{tag.id}")
    public void edit(Tag tag) {
         tag = (Tag) dao.selectById(tag);
         if(tag != null) {
              result.include("tag", tag);
         }
         result.redirectTo(this.getClass()).form();
    }

    @Post
    @Path("/tag/save")
    public void salve(Tag tag) {
         if(tag != null) {
              if(tag.getId() == null) {
                   dao.insert(tag);
              } else {
                   dao.update(tag);
              }
         }
         list();
         result.redirectTo(this.getClass()).list();
    }

    @Path("/tag/delete/{tag.id}")
    public void delete(Tag tag) {
         if(tag != null && tag.getId() != null) {
              dao.remove(tag);
         }
         list();
         result.redirectTo(this.getClass()).list();
    }

    @Path("/tag/edittopic/{tag.id}")
    public void edittopic(Tag tag) {
         result.redirectTo(TopicosController.class).lista(tag.getId());
    }

}
