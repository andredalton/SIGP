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
public class MarcadorsController {
    private final GenericDAOString dao;
    private final Result result;

    public MarcadorsController(GenericDAOString dao, Result result) {
         this.result   = result;
         this.dao      = dao;
    }

    @Path("/marcador/lista")
    public void lista() {
         List<BaseEntityString> marcadors = dao.selectByNamedQuery("selectMarcadors");
         result.include("marcadors", marcadors);
    }

    @Path("/marcador/formulario")
    public void formulario() {

    }

    @Path("/marcador/editar/{marcador.id}")
    public void editar(Marcador marcador) {
         marcador = (Marcador) dao.selectById(marcador);
         if(marcador != null) {
              result.include("marcador", marcador);
         }
         result.redirectTo(this.getClass()).formulario();
    }

    @Post
    @Path("/marcador/salvar")
    public void salvar(Marcador marcador) {
         if(marcador != null) {
              if(marcador.getId() == null) {
                   dao.insert(marcador);
              } else {
                   dao.update(marcador);
              }
         }
         lista();
         result.redirectTo(this.getClass()).lista();
    }

    @Path("/marcador/excluir/{marcador.id}")
    public void excluir(Marcador marcador) {
         if(marcador != null && marcador.getId() != null) {
              dao.remove(marcador);
         }
         lista();
         result.redirectTo(this.getClass()).lista();
    }

    @Path("/marcador/editartopico/{marcador.id}")
    public void editartopico(Marcador marcador) {
         result.redirectTo(TopicosController.class).lista(marcador.getId());
    }

}
