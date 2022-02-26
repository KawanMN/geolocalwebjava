package com.kawan.SpringRestApi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Logradouros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String cd_logradouro;

	private String cd_bairro;

	private String cd_tipo_logradouros;
	
	private String ds_logradouro_nome;
	
	private String no_logradouro_cep;

	public Logradouros() {
		
		}

	public Logradouros(String cd_logradouro, String cd_bairro, String cd_tipo_logradouros, String ds_logradouro_nome,
			String no_logradouro_cep) {
		super();
		this.cd_logradouro = cd_logradouro;
		this.cd_bairro = cd_bairro;
		this.cd_tipo_logradouros = cd_tipo_logradouros;
		this.ds_logradouro_nome = ds_logradouro_nome;
		this.no_logradouro_cep = no_logradouro_cep;
	}

	public String getCd_logradouro() {
		return cd_logradouro;
	}

	public void setCd_logradouro(String cd_logradouro) {
		this.cd_logradouro = cd_logradouro;
	}

	public String getCd_bairro() {
		return cd_bairro;
	}

	public void setCd_bairro(String cd_bairro) {
		this.cd_bairro = cd_bairro;
	}

	public String getCd_tipo_logradouros() {
		return cd_tipo_logradouros;
	}

	public void setCd_tipo_logradouros(String cd_tipo_logradouros) {
		this.cd_tipo_logradouros = cd_tipo_logradouros;
	}

	public String getDs_logradouro_nome() {
		return ds_logradouro_nome;
	}

	public void setDs_logradouro_nome(String ds_logradouro_nome) {
		this.ds_logradouro_nome = ds_logradouro_nome;
	}

	public String getNo_logradouro_cep() {
		return no_logradouro_cep;
	}

	public void setNo_logradouro_cep(String no_logradouro_cep) {
		this.no_logradouro_cep = no_logradouro_cep;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cd_logradouro == null) ? 0 : cd_logradouro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Logradouros other = (Logradouros) obj;
		if (cd_logradouro == null) {
			if (other.cd_logradouro != null)
				return false;
		} else if (!cd_logradouro.equals(other.cd_logradouro))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Logradouros [cd_logradouro=" + cd_logradouro + ", cd_bairro=" + cd_bairro + ", cd_tipo_logradouros="
				+ cd_tipo_logradouros + ", ds_logradouro_nome=" + ds_logradouro_nome + ", no_logradouro_cep="
				+ no_logradouro_cep + "]";
	}
	
		

}