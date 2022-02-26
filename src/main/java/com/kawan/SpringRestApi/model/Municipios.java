package com.kawan.SpringRestApi.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Municipios {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long cd_uf;

    private String nome;

    private Double latitude;

    private Double longitude;

    private Boolean capital ;
    
    private Integer codigo_uf;
    
    private String siafi_id;
    
    private Integer ddd;
    
    private String fuso_horario;

	public Municipios() {
		
	}

	public Municipios(Long codigo_ibge, String nome, Double latitude, Double longitude, Boolean capital,
			Integer codigo_uf, String siafi_id, Integer ddd, String fuso_horario) {
		super();
		this.cd_uf = codigo_ibge;
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
		this.capital = capital;
		this.codigo_uf = codigo_uf;
		this.siafi_id = siafi_id;
		this.ddd = ddd;
		this.fuso_horario = fuso_horario;
	}
	
	
	public Long getCodigo_ibge() {
		return cd_uf;
	}

	public void setCodigo_ibge(Long codigo_ibge) {
		this.cd_uf = codigo_ibge;
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

	public Boolean getCapital() {
		return capital;
	}

	public void setCapital(Boolean capital) {
		this.capital = capital;
	}

	public Integer getCodigo_uf() {
		return codigo_uf;
	}

	public void setCodigo_uf(Integer codigo_uf) {
		this.codigo_uf = codigo_uf;
	}

	public String getSiafi_id() {
		return siafi_id;
	}

	public void setSiafi_id(String siafi_id) {
		this.siafi_id = siafi_id;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public String getFuso_horario() {
		return fuso_horario;
	}

	public void setFuso_horario(String fuso_horario) {
		this.fuso_horario = fuso_horario;
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
		Municipios other = (Municipios) obj;
		if (cd_uf == null) {
			if (other.cd_uf != null)
				return false;
		} else if (!cd_uf.equals(other.cd_uf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Municipios [codigo_ibge=" + cd_uf + ", nome=" + nome + ", latitude=" + latitude + ", longitude="
				+ longitude + ", capital=" + capital + ", codigo_uf=" + codigo_uf + ", siafi_id=" + siafi_id + ", ddd="
				+ ddd + ", fuso_horario=" + fuso_horario + "]";
	}
    
    

}

