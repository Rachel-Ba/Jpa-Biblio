package entity;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.*;


import org.junit.Test;

@Entity
@Table(name = "client")

public class client 
{
	
	@Id
	private Integer id;
	
	@Column(name = "NOM", length = 50, nullable = false)
	private String nom;
	
	@Column(name = "PRENOM", length = 50, nullable = false)
	private String prenom;
	
	   
 /* @ManyToOne
    @JoinColumn(name="ID_CLIENT")
    private emprunt emprunt;*/
	
	public client()
	{
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	
}
