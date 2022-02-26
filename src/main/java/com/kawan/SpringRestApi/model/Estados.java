package com.kawan.SpringRestApi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Estados {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo_uf;

    private String uf;

    private String nome;

    private Double latitude;

    private Double longitude;
    
    private String regiao;

	public Estados() {
		
	}

	public Estados(Long codigo_uf, String uf, String nome, Double latitude, Double longitude, String regiao) {
		super();
		this.codigo_uf = codigo_uf;
		this.uf = uf;
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
		this.regiao = regiao;
	}

	public Long getCodigo_uf() {
		return codigo_uf;
	}

	public void setCodigo_uf(Long codigo_uf) {
		this.codigo_uf = codigo_uf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo_uf == null) ? 0 : codigo_uf.hashCode());
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
		Estados other = (Estados) obj;
		if (codigo_uf == null) {
			if (other.codigo_uf != null)
				return false;
		} else if (!codigo_uf.equals(other.codigo_uf))
			return false;
		return true;
	}
    
   	 

}
