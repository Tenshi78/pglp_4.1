package pglp_4_1;

import java.time.LocalDate;
import java.util.HashSet;

public class Personnel implements Groupe{
	
	private String nom;
	private String prenom;
	private LocalDate datedenaissance;
	private HashSet<NumeroTelephone> numerostelephone;
	private String poste;
	
	private Personnel(Builder builder)
	{
		nom = builder.nom;
		prenom = builder.prenom;
		datedenaissance = builder.datedenaissance;
		numerostelephone = builder.numerostelephone;
		poste = builder.poste;
	}
	
	@Override
	public String toString()
	{
		String tmp = "";
		
		for(NumeroTelephone num : this.numerostelephone)
		{
			tmp += (num.toString() + "; ");
		}
		
		return this.nom +" "+ this.prenom+" " + this.poste+" " + this.datedenaissance+" " + tmp;
	}

	public static class Builder
	{
		private String nom;
		private String prenom;
		private LocalDate datedenaissance = LocalDate.now();
		private HashSet<NumeroTelephone> numerostelephone = new HashSet<NumeroTelephone>();
		private String poste;
		
		public Builder(String nom,String prenom)
		{
			this.nom = nom;
			this.prenom = prenom;
			numerostelephone.add(new NumeroTelephone("0000000000"));
		}
		
		public Builder poste(String poste)
		{
			this.poste = poste;
			return this;
		}
		
		public Builder telephone(HashSet<NumeroTelephone> numero)
		{
			this.numerostelephone = numero;
			return this;
		}
		
		public Builder datedenaissance(LocalDate date)
		{
			this.datedenaissance = date;
			return this;
		}
		
		public Personnel build()
		{
			return new Personnel(this);
		}	
	}
	


	
}
