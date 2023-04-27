package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cita database table.
 * 
 */
@Entity
@NamedQuery(name="Cita.findAll", query="SELECT c FROM Cita c")
public class Cita implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cita")
	private int idCita;

	@Column(name="fecha_cita")
	private String fechaCita;

	@Column(name="nom_paciente")
	private String nomPaciente;

	//bi-directional many-to-one association to Doctor
	@ManyToOne
	@JoinColumn(name="doct_asig")
	private Doctor doctor;

	public Cita() {
	}

	public int getIdCita() {
		return this.idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public String getFechaCita() {
		return this.fechaCita;
	}

	public void setFechaCita(String fechaCita) {
		this.fechaCita = fechaCita;
	}

	public String getNomPaciente() {
		return this.nomPaciente;
	}

	public void setNomPaciente(String nomPaciente) {
		this.nomPaciente = nomPaciente;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}