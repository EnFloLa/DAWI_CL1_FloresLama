package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.persistence.EntityManager;

import model.Cita;
import model.Conn;
import model.Doctor;

public class Main {

	public static void main(String[] args) {
		EntityManager em = Conn.getInstancia().getFactory().createEntityManager();
		
		/*Doctor doc1 = new Doctor();
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
		System.out.print("Se creo un nuevo doctor");*/
		
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Ingresar Cita");
            System.out.println("2. Mostrar Citas del doctor");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                    	
                    	Doctor doc4 = em.find(Doctor.class, 1);
                    	
                        System.out.println("Has seleccionado la opcion 1");
                        
                        System.out.println("ingresar nombre de paciente:");
                		
                		String name = sn.nextLine();
                		
                		System.out.println("ingresar fecha de cita:");
                		
                		String fecha = sn.nextLine();
                		
                		System.out.println("ingresar nombre del doctor:");
                		String coddoc = sn.nextLine();
                		
                		Cita cita = new Cita();
                		cita.setNomPaciente(name);
                		cita.setFechaCita(fecha);
                		cita.setDoctor(doc4);
                		
                		em.getTransaction().begin();
                		
                		em.persist(cita);
                		
                		
                		em.getTransaction().commit();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        System.out.println("Mostrar citas del doctor");
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
		
	}
}
