package co.com.agendaonline.tareas.models.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="evento")
public class Evento implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@NotBlank
	@Column(name="titulo")
	private String titulo;
	
	@NotBlank
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="fechainicio")
	private LocalDate fechaInicio;
	
	
	@NotBlank
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="fechafin")
	private LocalDate fechaFin;
	
	@NotBlank
	@Column(name="horas")
	private Integer horas;
	
	@NotBlank
	@Column(name="descripcion")
	private String descripcion;
	
	@NotBlank
	@Column(name="nivel_prioridad")
	private String nivelPrioridad;
	
	@Column(name="Lugar")
	private String asignada;

	private String foto1;

	private String foto2;
	
	public Evento() {
		super();
	}

	public  Long getId() {
		return id;
	}

	public  String getTitulo() {
		return titulo;
	}

	public  LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public  Integer getHoras() {
		return horas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public  String getNivelPrioridad() {
		return nivelPrioridad;
	}

	public  String getAsignada() {
		return asignada;
	}

	private final void setId(final Long id) {
		this.id = id;
	}

	private final void setTitulo(final String titulo) {
		this.titulo = titulo;
	}

	private final void setFechaInicio(final LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	private final void setFechaFin(final LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	private final void setHoras(final Integer horas) {
		this.horas = horas;
	}

	private final void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

	private final void setNivelPrioridad(final String nivelPrioridad) {
		this.nivelPrioridad = nivelPrioridad;
	}

	private final void setAsignada(final String asignada) {
		this.asignada = asignada;
	}
	
	public String getFoto1() {
		return getFoto1();
	}
	public void setFoto1(String foto1) {
	this.foto1 = foto1;
	}
	public String getFoto2() {
		return getFoto2();
	}
	public void setFoto2(String foto2) {
	this.foto2 = foto2;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarea other = (Tarea) obj;
		return Objects.equals(id, other.getId());
	}


	private static final long serialVersionUID = 1L;
	

}

/*** creado por M4rced and G3ors ***/
