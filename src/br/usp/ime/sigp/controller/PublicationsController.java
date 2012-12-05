package br.usp.ime.sigp.controller;

import java.util.List;


import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.usp.ime.sigp.dao.GenericDAOString;
import br.usp.ime.sigp.jpa.BaseEntityString;

@Resource
public class PublicationsController {
    private final GenericDAOString dao;
    private final Result result;

    public PublicationsController(GenericDAOString dao, Result result) {
         this.result   = result;
         this.dao      = dao;
    }

    @Path({"/publications/", "/publications"})
    public void index() {
    	List<BaseEntityString> publications = dao.selectByNamedQuery("selectPublications");
        result.include("publications", publications);
    }
}
