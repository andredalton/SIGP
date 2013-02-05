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
public class TopicsController {
	private final GenericDAOTopicoPk dao;
	private final Result result;

	public TopicsController(GenericDAOTopicoPk dao, Result result) {
		this.result = result;
		this.dao = dao;
	}

	@Path({"/topics","/topics/"})
	public void list() {
		List<Topico> topicos = dao
				.selectByNamedQuery("selectTopicos");
		result.include("topicos", topicos);
	}

	@Path("/topic/list/{marcador.id}")
	public void list(String marcadorpai) {
		List<Topico> topicos = dao
				.selectByNamedQuery("selectTopicosdomarcadorpai", marcadorpai);
		result.include("topicos", topicos);
	}
	
	@Path("/topic/form")
	public void form() {

	}

	@Path("/topic/edit/{nome}/{marcadorpai}")
	public void edit(String nome, String marcadorpai) {
		TopicoPk topicopk = new TopicoPk();
		topicopk.setNome(nome);
		topicopk.setMarcadorpai(marcadorpai);
		Topico topico = new Topico();
		topico.setId(topicopk);
		topico = dao.selectById(topico);
		if (topico != null) {
			result.include("topico", topico);
		}
		result.redirectTo(this.getClass()).form();
	}

	@Post
	@Path("/topic/save")
	public void save(Topico topico) {
		if (topico != null) {
			if (topico.getId() == null) {
				dao.insert(topico);
			} else {
				dao.update(topico);
			}
		}
		list();
		result.redirectTo(this.getClass()).list();
	}

	@Path("/topic/delete/{nome}/{marcadorpai}")
	public void delete(String nome, String marcadorpai) {
		TopicoPk topicopk = new TopicoPk();
		topicopk.setNome(nome);
		topicopk.setMarcadorpai(marcadorpai);
		Topico topico = new Topico();
		topico.setId(topicopk);
		topico = dao.selectById(topico);
		if (topico != null && topico.getId() != null) {
			dao.remove(topico);
		}
		list();
		result.redirectTo(this.getClass()).list();
	}
}
