package com.kawan.SpringRestApi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Uf {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cd_uf;

	private String ds_uf_sigla;

	private String ds_uf_nome;

	public Uf() {

	}

	public Uf(Long cd_uf, String ds_uf_sigla, String ds_uf_nome) {
		super();
		this.cd_uf = cd_uf;
		this.ds_uf_sigla = ds_uf_sigla;
		this.ds_uf_nome = ds_uf_nome;
	}

	public Long getCd_uf() {
		return cd_uf;
	}

	public void setCd_uf(Long cd_uf) {
		this.cd_uf = cd_uf;
	}

	public String getDs_uf_sigla() {
		return ds_uf_sigla;
	}

	public void setDs_uf_sigla(String ds_uf_sigla) {
		this.ds_uf_sigla = ds_uf_sigla;
	}

	public String getDs_uf_nome() {
		return ds_uf_nome;
	}

	public void setDs_uf_nome(String ds_uf_nome) {
		this.ds_uf_nome = ds_uf_nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cd_uf == null) ? 0 : cd_uf.hashCode());
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
		Uf other = (Uf) obj;
		if (cd_uf == null) {
			if (other.cd_uf != null)
				return false;
		} else if (!cd_uf.equals(other.cd_uf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Uf [cd_uf=" + cd_uf + ", ds_uf_sigla=" + ds_uf_sigla + ", ds_uf_nome=" + ds_uf_nome + "]";
	}

}
