package br.usp.ime.sigp.controller;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.usp.ime.sigp.dao.GenericDAOString;
import br.usp.ime.sigp.jpa.BaseEntityString;
import br.usp.ime.sigp.modelo.Marcador;

@Resource
public class TagsController {
	private final GenericDAOString dao;
	private final Result result;

	public TagsController(GenericDAOString dao, Result result) {
		this.result = result;
		this.dao = dao;
	}

	@Path({ "/tags", "/tags/" })
	public void list() {
		List<BaseEntityString> marcadors = dao
				.selectByNamedQuery("selectMarcadors");
		result.include("marcadors", marcadors);
	}

	@Path({ "/tag/new", "/tag/new/" })
	public void form() {
	}

	@Path({ "/tag/edit/{marcador.id}", "/tag/edit/{marcador.id}/" })
	public void edit(Marcador marcador) {
		marcador = (Marcador) dao.selectById(marcador);
		if (marcador != null) {
			result.include("marcador", marcador);
		}
		result.redirectTo(this.getClass()).form();
	}

	@Post
    @Path({"/tag/save", "/tag/save/"})
    public void save(Marcador marcador) {
         if(marcador != null) {
              if(marcador.getId() == null) {
                   dao.insert(marcador);
              } else {
            	   dao.update(marcador);
              }
         }
         list();
         result.redirectTo(this.getClass()).list();
    }

	@Path({ "/tag/delete/{marcador.id}", "/tag/delete/{marcador.id}/" })
	public void delete(Marcador marcador) {
		if (marcador != null && marcador.getId() != null) {
			dao.remove(marcador);
		}
		list();
		result.redirectTo(this.getClass()).list();
	}

	@Path({ "/tag/topic/{marcador.id}", "/tag/topic/{marcador.id}/" })
	public void topic(Marcador marcador) {
		result.redirectTo(TopicsController.class).list(marcador.getId());
	}
}
