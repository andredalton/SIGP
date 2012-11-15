package br.usp.ime.sigp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.vraptor.ioc.Component;
import br.usp.ime.sigp.jpa.BaseEntityString;
import br.usp.ime.sigp.jpa.JPAFactory;

@Component
public class GenericDAOString {

	protected EntityManager manager;

	public GenericDAOString() {
		manager = JPAFactory.getEntityManager();
	}

	public BaseEntityString insert(BaseEntityString entity) {
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		return entity;
	}

	public BaseEntityString update(BaseEntityString entity) {
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		return entity;
	}

	public void remove(BaseEntityString entity) {
		entity = selectById(entity);
		manager.getTransaction().begin();
		manager.remove(entity);
		manager.getTransaction().commit();
	}

	public BaseEntityString selectById(BaseEntityString entity) {
		entity = (BaseEntityString) manager.find(entity.getClass(),
				entity.getId());
		return entity;
	}

	public List<BaseEntityString> selectByNamedQuery(String namedQuery) {
		return selectByNamedQuery(namedQuery, new Object[0]);
	}

	public List<BaseEntityString> selectByNamedQuery(String namedQuery,
			Object... parameters) {
		try {
			Query query = manager.createNamedQuery(namedQuery);
			if (parameters != null && parameters.length > 0) {
				for (int i = 0; i < parameters.length; i++) {
					query.setParameter(i + 1, parameters[i]);
				}
			}
			List<BaseEntityString> list = query.getResultList();
			return list;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
