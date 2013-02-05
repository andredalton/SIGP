package br.usp.ime.sigp.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.usp.ime.sigp.jpa.JPAFactory;
import br.usp.ime.sigp.modelo.Colaborador;

@Component
public class ColaboradorDao {
	
	protected EntityManager manager;

	public ColaboradorDao() {
		manager = JPAFactory.getEntityManager();
	}
	
	public void save(Colaborador colaborador) {
		manager.getTransaction().begin();
		manager.persist(colaborador);
		manager.getTransaction().commit();
	}
}
