package com.utn.modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "forma", catalog = "base__saludable")

public class Formulario {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "tipcomida")
	private String tipcomida;

	@Column(name = "comPrincipal")
	private String comPrincipal;

	@Column(name = "comSecundaria")
	private String comSecundaria;

	@Column(name = "bebida")
	private String bebida;

	@Column(name = "postre")
	private String postre;

	@Column(name = "tentacion")
	private String tentacion;

	@Column(name = "alimento")
	private String alimento;

	@Column(name = "hambre")
	private String hambre;

	@Column(name = "fecha")
	private Date fecha;

	

	public Formulario(Integer id, String tipcomida, String comPrincipal, String comSecundaria, String bebida,
			String postre, String tentacion, String alimento, String hambre, Date fecha) {
		super();
		this.id = id;
		this.tipcomida = tipcomida;
		this.comPrincipal = comPrincipal;
		this.comSecundaria = comSecundaria;
		this.bebida = bebida;
		this.postre = postre;
		this.tentacion = tentacion;
		this.alimento = alimento;
		this.hambre = hambre;
		this.fecha = fecha;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Formulario() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipcomida() {
		return tipcomida;
	}

	public void setTipcomida(String tipcomida) {
		this.tipcomida = tipcomida;
	}

	public String getComPrincipal() {
		return comPrincipal;
	}

	public void setComPrincipal(String comPrincipal) {
		this.comPrincipal = comPrincipal;
	}

	public String getComSecundaria() {
		return comSecundaria;
	}

	public void setComSecundaria(String comSecundaria) {
		this.comSecundaria = comSecundaria;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getPostre() {
		return postre;
	}

	public void setPostre(String postre) {
		this.postre = postre;
	}

	public String getTentacion() {
		return tentacion;
	}

	public void setTentacion(String tentacion) {
		this.tentacion = tentacion;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String getHambre() {
		return hambre;
	}

	public void setHambre(String hambre) {
		this.hambre = hambre;
	}

	

}
