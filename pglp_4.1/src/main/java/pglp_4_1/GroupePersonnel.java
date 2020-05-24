package pglp_4_1;

import java.util.HashSet;

public class GroupePersonnel implements Groupe{
	
	private HashSet<Groupe> employes = new HashSet<Groupe>();
	
	@Override
	public String toString()
	{
		String chaine ="";
		for(Groupe g : employes)
		{
			chaine += (g.toString() + "\n");
		}
		return chaine;
	}
	
	public void AjouterPersonnel(Groupe g)
	{
		employes.add(g);
	}
	
	public void RetirerPersonnel(Groupe g)
	{
		employes.remove(g);
	}
}
