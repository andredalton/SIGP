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
public class PeopleController {
    private final GenericDAOString dao;
    private final Result result;

    public PeopleController(GenericDAOString dao, Result result) {
         this.result   = result;
         this.dao      = dao;
    }

    @Path({"/people/", "/people"})
    public void index() {
        List<BaseEntityString> people = dao.selectByNamedQuery("selectPeople");
        result.include("people", people);
    }
}