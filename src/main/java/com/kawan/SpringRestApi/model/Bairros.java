package com.kawan.SpringRestApi.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Bairros {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String cd_bairro;

    private String cd_cidade;

    private String ds_bairro_nome;

	public Bairros() {
		
	}

	public Bairros(String cd_bairro, String cd_cidade, String ds_bairro_nome) {
		super();
		this.cd_bairro = cd_bairro;
		this.cd_cidade = cd_cidade;
		this.ds_bairro_nome = ds_bairro_nome;
	}

	public String getCd_bairro() {
		return cd_bairro;
	}

	public void setCd_bairro(String cd_bairro) {
		this.cd_bairro = cd_bairro;
	}

	public String getCd_cidade() {
		return cd_cidade;
	}

	public void setCd_cidade(String cd_cidade) {
		this.cd_cidade = cd_cidade;
	}

	public String getDs_bairro_nome() {
		return ds_bairro_nome;
	}

	public void setDs_bairro_nome(String ds_bairro_nome) {
		this.ds_bairro_nome = ds_bairro_nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cd_bairro == null) ? 0 : cd_bairro.hashCode());
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
		Bairros other = (Bairros) obj;
		if (cd_bairro == null) {
			if (other.cd_bairro != null)
				return false;
		} else if (!cd_bairro.equals(other.cd_bairro))
			return false;
		return true;
	}
    
    	

}
