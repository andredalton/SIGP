package br.usp.ime.sigp.controller;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.usp.ime.sigp.dao.GenericDAOString;
import br.usp.ime.sigp.jpa.BaseEntityString;
import br.usp.ime.sigp.modelo.Colaborador;

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
    	List<BaseEntityString> researchers = dao.selectByNamedQuery("selectCollaborators", "Pesquisador%");
        result.include("researchers", researchers);
        
        List<BaseEntityString> phds = dao.selectByNamedQuery("selectCollaborators", "Doutorand%");
        result.include("phds", phds);

        List<BaseEntityString> masters = dao.selectByNamedQuery("selectCollaborators", "Mestrand%");
        result.include("masters", masters);

        List<BaseEntityString> undergraduates = dao.selectByNamedQuery("selectCollaborators", "Graduand%");
        result.include("undergraduates", undergraduates);
        
        List<BaseEntityString> others = dao.selectByNamedQuery("selectCollaboratorsOthers", "Egress%");
        result.include("others", others);

        List<BaseEntityString> coordinators = dao.selectByNamedQuery("selectCollaboratorsCoordinators");
        result.include("coordinators", coordinators);
        
        List<BaseEntityString> collaborators = dao.selectByNamedQuery("selectCollaborators", "Colaborador%");
        result.include("collaborators", collaborators);
    }
    
    @Path("/people/{person.id}")
    public void person(Colaborador person) {
         person = (Colaborador) dao.selectById(person);
         if(person != null) {
              result.include("person", person);
         }
    }
}