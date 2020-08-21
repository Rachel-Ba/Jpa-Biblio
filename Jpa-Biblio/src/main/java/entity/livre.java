package entity;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import javax.persistence.*;


import org.junit.Test;

@Entity
@Table(name = "livre")
public class livre 
{
	@Id
	private Integer id;
	
	@Embedded
	private auteur auteurEmbedd;
	
	public auteur getAuteurEmbedd()
	{
		return auteurEmbedd;
	}
	
	public void setAuteurEmbedd(auteur auteur)
	{
		this.auteurEmbedd = auteur;
	}
	
	@Column(name = "TITRE", length = 255, nullable = false)
	private String titre;
	
	@Column(name = "AUTEUR", length = 50, nullable = false)
	private String auteur;
	
	@ManyToMany
    @JoinTable (name="compo",
    			joinColumns=@JoinColumn(name="ID_LIV"),
    			inverseJoinColumns=@JoinColumn(name="ID_EMP"))
	private Set<emprunt> emprunt;
	
	public livre()
	{
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return " " + id + " : " + titre + " // " + auteur + " ";
	}
	
	
	



}
