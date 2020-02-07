package com.bolsadeideas.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // para que la llave sea auto incrementable
	private Long id;

	@NotEmpty//Validaciones
	//@Size(min=4,max12) Valida que el tamaño del string este dentro de ese rango
	private String nombre;
	@NotEmpty//Validaciones
	private String apellido;
	@NotEmpty//Valida que no venga vacio
	@Email//Valida que sea formato email
	private String email;

	@NotNull//Valida que no sea nulo 
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE) // Para asignar el formato en el que se guarde la fecha
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createAt;
	
	
	/*@PrePersist//Se ejecuta este metodos justo antes insertar
	public void prePersist() {
		createAt=new Date();
	}*/
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

}
