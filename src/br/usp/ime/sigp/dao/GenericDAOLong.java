package br.usp.ime.sigp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.vraptor.ioc.Component;
import br.usp.ime.sigp.jpa.BaseEntityLong;
import br.usp.ime.sigp.jpa.JPAFactory;

@Component
public class GenericDAOLong{

	protected EntityManager manager;

	public GenericDAOLong() {
		manager = JPAFactory.getEntityManager();
	}

	public BaseEntityLong insert(BaseEntityLong entity) {
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		return entity;
	}

	public BaseEntityLong update(BaseEntityLong entity) {
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		return entity;
	}

	public void remove(BaseEntityLong entity) {
		entity = selectById(entity);
		manager.getTransaction().begin();
		manager.remove(entity);
		manager.getTransaction().commit();
	}

	public BaseEntityLong selectById(BaseEntityLong entity) {
		entity = (BaseEntityLong) manager.find(entity.getClass(), entity.getId());
		return entity;
	}

	public List<BaseEntityLong> selectByNamedQuery(String namedQuery) {
		return selectByNamedQuery(namedQuery, new Object[0]);
	}

	public List<BaseEntityLong> selectByNamedQuery(String namedQuery,
			Object... parameters) {
		try {
			Query query = manager.createNamedQuery(namedQuery);
			if (parameters != null && parameters.length > 0) {
				for (int i = 0; i < parameters.length; i++) {
					query.setParameter(i + 1, parameters[i]);
				}
			}
			List<BaseEntityLong> list = query.getResultList();
			return list;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
