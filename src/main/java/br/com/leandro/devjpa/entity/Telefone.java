package br.com.leandro.devjpa.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name ="TELEFONES")
public class Telefone implements Serializable{
	public enum TipoTelefone{
		RESIDENCIAL, CELULAR, COMERCIAL
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TELEFONE")
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_TELEFONE", nullable = false)
	private TipoTelefone tipo;
	
	@Column(name="NUMERO")
	private String numero;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PESSOA_ID")
	private Person pessoa;

	public Telefone() {
	}

	public Telefone(TipoTelefone tipo, String numero) {
		this.tipo = tipo;
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Person getPessoa() {
		return pessoa;
	}

	public void setPessoa(Person pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return String.format("Telefone [id=%s, tipo=%s, numero=%s, pessoa=%s]", id, tipo, numero, pessoa);
	}

}
