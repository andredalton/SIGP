package br.usp.ime.sigp.controller;

import java.util.List;


import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.usp.ime.sigp.dao.GenericDAOString;
import br.usp.ime.sigp.jpa.BaseEntityString;
import br.usp.ime.sigp.modelo.Marcador;
import br.usp.ime.sigp.modelo.Publicacao;

@Resource
public class ProjectsController {
    private final GenericDAOString dao;
    private final Result result;

    public ProjectsController(GenericDAOString dao, Result result) {
         this.result   = result;
         this.dao      = dao;
    }

    @Path({"/projects/", "/projects"})
    public void index() {
    	List<BaseEntityString> projects = dao.selectByNamedQuery("selectProjects");
        result.include("projects", projects);
    }
    
    @Path("/project/{project.id}")
    public void project(Publicacao project) {
         project = (Publicacao) dao.selectById(project);
         if(project != null) {
              result.include("project", project);
         }
    }
}