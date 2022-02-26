package com.kawan.SpringRestApi.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cepcidade {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String estado;

    private String localidade;

    private String faixa_cep;

    private String cep_inicial;
    
    private String cep_final;
    
    private String situacao;
    
    private String tipo_faixa;

	public Cepcidade() {
		
	}

	public Cepcidade(Long id, String estado, String localidade, String faixa_cep, String cep_inicial, String cep_final,
			String situacao, String tipo_faixa) {
		super();
		this.id = id;
		this.estado = estado;
		this.localidade = localidade;
		this.faixa_cep = faixa_cep;
		this.cep_inicial = cep_inicial;
		this.cep_final = cep_final;
		this.situacao = situacao;
		this.tipo_faixa = tipo_faixa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getFaixa_cep() {
		return faixa_cep;
	}

	public void setFaixa_cep(String faixa_cep) {
		this.faixa_cep = faixa_cep;
	}

	public String getCep_inicial() {
		return cep_inicial;
	}

	public void setCep_inicial(String cep_inicial) {
		this.cep_inicial = cep_inicial;
	}

	public String getCep_final() {
		return cep_final;
	}

	public void setCep_final(String cep_final) {
		this.cep_final = cep_final;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getTipo_faixa() {
		return tipo_faixa;
	}

	public void setTipo_faixa(String tipo_faixa) {
		this.tipo_faixa = tipo_faixa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cep_final == null) ? 0 : cep_final.hashCode());
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
		Cepcidade other = (Cepcidade) obj;
		if (cep_final == null) {
			if (other.cep_final != null)
				return false;
		} else if (!cep_final.equals(other.cep_final))
			return false;
		return true;
	}
    
    	

}
