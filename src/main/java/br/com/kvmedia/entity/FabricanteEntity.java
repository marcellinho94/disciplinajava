package br.com.kvmedia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Fabricantes")
public class FabricanteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Fabricante")
	private Integer idFabricante;

	@Column(name = "DESC_Fabricante")
	private String descFabricante;

	/* ====================================================================================== */
	/* CONSTRUCTOR */
	/* ====================================================================================== */
	public FabricanteEntity() {
		super();
	}

	public FabricanteEntity(Integer idFabricante, String descFabricante) {
		super();
		this.idFabricante = idFabricante;
		this.descFabricante = descFabricante;
	}

	/* ====================================================================================== */
	/* GETTERS AND SETTERS */
	/* ====================================================================================== */
	public Integer getIdFabricante() {
		return idFabricante;
	}

	public void setIdFabricante(Integer idFabricante) {
		this.idFabricante = idFabricante;
	}

	public String getDescFabricante() {
		return descFabricante;
	}

	public void setDescFabricante(String descFabricante) {
		this.descFabricante = descFabricante;
	}

	/* ====================================================================================== */
	/* HASHCODE AND EQUALS */
	/* ====================================================================================== */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descFabricante == null) ? 0 : descFabricante.hashCode());
		result = prime * result + ((idFabricante == null) ? 0 : idFabricante.hashCode());
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
		FabricanteEntity other = (FabricanteEntity) obj;
		if (descFabricante == null) {
			if (other.descFabricante != null)
				return false;
		} else if (!descFabricante.equals(other.descFabricante))
			return false;
		if (idFabricante == null) {
			if (other.idFabricante != null)
				return false;
		} else if (!idFabricante.equals(other.idFabricante))
			return false;
		return true;
	}
}
