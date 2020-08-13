package br.com.leandro.devjpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DOCUMENTS")
public class Documents implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DOCUMENTS")
	private Long id;

	@Column(name = "CPF", nullable = true, unique = true, length = 14)
	private String cpf;

	@Column(name = "RG", nullable = true)
	private Integer rg;

	public Documents() {
		super();
	}

	public Documents(String cpf, Integer rg) {
		this.id = id;
		this.cpf = cpf;
		this.rg = rg;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return String.format("[DOCS_ID:%s], CPF: %s, RG: %s]", id, cpf, rg);
	}

}
