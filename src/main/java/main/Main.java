package main;

import javax.persistence.EntityManager;

import model.Conn;
import model.Doctor;

public class Main {

	public static void main(String[] args) {
		EntityManager em = Conn.getInstancia().getFactory().createEntityManager();
		
		Doctor doc1 = new Doctor();
		doc1.setNomDoctor("Steven Gerrard");
		doc1.setEspecialidadDoctor("Cardiologia");
		
		em.getTransaction().begin();
		em.persist(doc1);
		em.getTransaction().commit();
		System.out.print("Se creo un nuevo doctor");
		
		Doctor doc2 = new Doctor();
		doc2.setNomDoctor("Paul Scholes");
		doc2.setEspecialidadDoctor("Medicina General");
		
		em.getTransaction().begin();
		em.persist(doc2);
		em.getTransaction().commit();
		System.out.print("Se creo un nuevo doctor");
		
		Doctor doc3 = new Doctor();
		doc3.setNomDoctor("Frank Lampard");
		doc3.setEspecialidadDoctor("Cardiologia");
		
		em.getTransaction().begin();
		em.persist(doc3);
		em.getTransaction().commit();
		System.out.print("Se creo un nuevo doctor");
	}
}
