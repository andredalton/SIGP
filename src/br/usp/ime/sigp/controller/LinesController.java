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
public class LinesController {
    private final GenericDAOString dao;
    private final Result result;

    public LinesController(GenericDAOString dao, Result result) {
         this.result   = result;
         this.dao      = dao;
    }

    @Path({"/lines/", "/lines"})
    public void index() {
    }
    
    @Path("/lines/previous")
    public void previous_lines() {
    }
}
