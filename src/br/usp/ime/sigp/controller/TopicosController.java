package br.usp.ime.sigp.controller;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.usp.ime.sigp.dao.GenericDAOTopicoPk;
import br.usp.ime.sigp.modelo.Topico;
import br.usp.ime.sigp.modelo.TopicoPk;

@Resource
public class TopicosController {
	private final GenericDAOTopicoPk dao;
	private final Result result;

	public TopicosController(GenericDAOTopicoPk dao, Result result) {
		this.result = result;
		this.dao = dao;
	}

	@Path("/topico/lista")
	public void lista() {
		List<Topico> topicos = dao
				.selectByNamedQuery("selectTopicos");
		result.include("topicos", topicos);
	}

	@Path("/topico/lista/{marcador.id}")
	public void lista(String marcadorpai) {
		List<Topico> topicos = dao
				.selectByNamedQuery("selectTopicosdomarcadorpai", marcadorpai);
		result.include("topicos", topicos);
	}
	
	@Path("/topico/formulario")
	public void formulario() {

	}

	@Path("/topico/editar/{nome}/{marcadorpai}")
	public void editar(String nome, String marcadorpai) {
		TopicoPk topicopk = new TopicoPk();
		topicopk.setNome(nome);
		topicopk.setMarcadorpai(marcadorpai);
		Topico topico = new Topico();
		topico.setId(topicopk);
		topico = dao.selectById(topico);
		if (topico != null) {
			result.include("topico", topico);
		}
		result.redirectTo(this.getClass()).formulario();
	}

	@Post
	@Path("/topico/salvar")
	public void salvar(Topico topico) {
		if (topico != null) {
			if (topico.getId() == null) {
				dao.insert(topico);
			} else {
				dao.update(topico);
			}
		}
		lista();
		result.redirectTo(this.getClass()).lista();
	}

	@Path("/topico/excluir/{nome}/{marcadorpai}")
	public void excluir(String nome, String marcadorpai) {
		TopicoPk topicopk = new TopicoPk();
		topicopk.setNome(nome);
		topicopk.setMarcadorpai(marcadorpai);
		Topico topico = new Topico();
		topico.setId(topicopk);
		topico = dao.selectById(topico);
		if (topico != null && topico.getId() != null) {
			dao.remove(topico);
		}
		lista();
		result.redirectTo(this.getClass()).lista();
	}
}
