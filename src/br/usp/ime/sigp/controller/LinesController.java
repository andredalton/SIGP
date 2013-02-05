package br.usp.ime.sigp.controller;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.usp.ime.sigp.dao.GenericDAOString;
import br.usp.ime.sigp.jpa.BaseEntityString;
import br.usp.ime.sigp.modelo.LinhadePesquisa;
import br.usp.ime.sigp.modelo.Marcador;
import br.usp.ime.sigp.modelo.Topico;
import br.usp.ime.sigp.modelo.TopicoPk;

@Resource
public class LinesController {
	private final GenericDAOString dao;
	private final Result result;

	public LinesController(GenericDAOString dao, Result result) {
		this.result = result;
		this.dao = dao;
	}

	@Path({ "/lines/", "/lines" })
	public void index() {
	}

	@Path("/lines/previous")
	public void previous_lines() {
	}

	@Path("/lines/list")
	public void list() {
		List<BaseEntityString> lines = dao.selectByNamedQuery("selectLines");
		result.include("lines", lines);
		/* result.include("years", this.pdao.years_with_publication()); */
	}
	
	@Path("/line/delete/{line.nome}")
	public void delete(String nome){
		/*
		LinhadePesquisa line = new LinhadePesquisa();
		line.setNome(nome);
		line = dao.selectByNamedQuery(namedQuery);
		
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
		*/
	}
}
