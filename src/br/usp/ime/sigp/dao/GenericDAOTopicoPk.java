package br.usp.ime.sigp.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.vraptor.ioc.Component;
import br.usp.ime.sigp.jpa.BaseEntityTopicoPk;
import br.usp.ime.sigp.jpa.JPAFactory;
import br.usp.ime.sigp.modelo.Topico;

@Component
public class GenericDAOTopicoPk {

	protected EntityManager manager;

	public GenericDAOTopicoPk() {
		manager = JPAFactory.getEntityManager();
	}

	public BaseEntityTopicoPk insert(BaseEntityTopicoPk entity) {
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		return entity;
	}

	public BaseEntityTopicoPk update(BaseEntityTopicoPk entity) {
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		return entity;
	}

	public void remove(Topico entity) {
		entity = selectById(entity);
		manager.getTransaction().begin();
		manager.remove(entity);
		manager.getTransaction().commit();
	}

	public Topico selectById(Topico entity) {
		entity = (Topico) manager.find(entity.getClass(), entity.getId());
		return entity;
	}

	public List<Topico> selectByNamedQuery(String namedQuery) {
		return selectByNamedQuery(namedQuery, new Object[0]);
	}

	public List<Topico> selectByNamedQuery(String namedQuery,
			Object... parameters) {
		try {
			Query query = manager.createNamedQuery(namedQuery);
			if (parameters != null && parameters.length > 0) {
				for (int i = 0; i < parameters.length; i++) {
					query.setParameter(i + 1, parameters[i]);
				}
			}
			@SuppressWarnings("unchecked")
			List<Topico> list = query.getResultList();
			return list;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
