package entity;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.*;


import org.junit.Test;

@Entity
@Table(name = "emprunt")

public class emprunt 
{
	
	@Id
	private Integer id;
	
	@Column(name = "DATE_DEBUT", length = 50, nullable = false)
	private Integer date_debut;
	
	@Column(name = "DATE_FIN", length = 50, nullable = false)
	private Integer date_fin;
	
	@Column(name = "DELAI", length = 10, nullable = false)
	private Integer delai;
	
	@Column(name = "ID_CLIENT", length = 10, nullable = false)
	private Integer id_client;
	
	@OneToMany(mappedBy = "compo")
    private List<compo> compo;
	
	public emprunt()
	{
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Integer date_debut) {
		this.date_debut = date_debut;
	}

	public Integer getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Integer date_fin) {
		this.date_fin = date_fin;
	}

	public Integer getDelai() {
		return delai;
	}

	public void setDelai(Integer delai) {
		this.delai = delai;
	}

	public Integer getId_client() {
		return id_client;
	}

	public void setId_client(Integer id_client) {
		this.id_client = id_client;
	}

	@Override
	public String toString() {
		return "emprunt [id=" + id + ", date_debut=" + date_debut + ", date_fin=" + date_fin + ", delai=" + delai
				+ ", id_client=" + id_client + "]";
	}
	
	

}
