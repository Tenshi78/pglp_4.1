package pglp_4_1;

public class NumeroTelephone {
	
	private String numero;
	
	public NumeroTelephone(String num)
	{
		if(num.length() < 10)
		{
			this.numero = "0000000000";
		}
		else
		{
			this.numero = num;
		}
	}
	
	public String toString()
	{
		return this.numero;
	}

}
