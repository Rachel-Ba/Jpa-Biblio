package entity;

import javax.persistence.Embeddable;

@Embeddable
public class auteur 
{
	private String titre;
	private String auteurEmbedd;
	
	public String getTitre()
	{
		return titre;
	}
	
	public void setTitre(String titre)
	{
		this.titre = titre;
	}
	
	public String getAuteurEmbedd()
	{
		return auteurEmbedd;
	}
	
	public void setAuteurEmbedd(String auteurEmbedd)
	{
		this.auteurEmbedd = auteurEmbedd;
	}

}
