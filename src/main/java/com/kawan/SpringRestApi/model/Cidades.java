package com.kawan.SpringRestApi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Cidades {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String cd_cidade;

    private Integer cd_uf;

    private String ds_cidade_nome;

	public Cidades() {
		
	}

	public Cidades(String cd_cidade, Integer cd_uf, String ds_cidade_nome) {
		super();
		this.cd_cidade = cd_cidade;
		this.cd_uf = cd_uf;
		this.ds_cidade_nome = ds_cidade_nome;
	}

	public String getCd_cidade() {
		return cd_cidade;
	}

	public void setCd_cidade(String cd_cidade) {
		this.cd_cidade = cd_cidade;
	}

	public Integer getCd_uf() {
		return cd_uf;
	}

	public void setCd_uf(Integer cd_uf) {
		this.cd_uf = cd_uf;
	}

	public String getDs_cidade_nome() {
		return ds_cidade_nome;
	}

	public void setDs_cidade_nome(String ds_cidade_nome) {
		this.ds_cidade_nome = ds_cidade_nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cd_cidade == null) ? 0 : cd_cidade.hashCode());
		result = prime * result + ((cd_uf == null) ? 0 : cd_uf.hashCode());
		result = prime * result + ((ds_cidade_nome == null) ? 0 : ds_cidade_nome.hashCode());
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
		Cidades other = (Cidades) obj;
		if (cd_cidade == null) {
			if (other.cd_cidade != null)
				return false;
		} else if (!cd_cidade.equals(other.cd_cidade))
			return false;
		if (cd_uf == null) {
			if (other.cd_uf != null)
				return false;
		} else if (!cd_uf.equals(other.cd_uf))
			return false;
		if (ds_cidade_nome == null) {
			if (other.ds_cidade_nome != null)
				return false;
		} else if (!ds_cidade_nome.equals(other.ds_cidade_nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cidades [cd_cidade=" + cd_cidade + "]";
	}

   	

}
