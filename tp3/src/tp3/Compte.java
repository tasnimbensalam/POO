package tp3;


class Compte {
		private int num;
		Personne titulaire;
		private double sold;
		private double decouvertMax;
		private double debitMax;
		private static int count;
		private boolean estadecouvert;
			
 

 Compte(Personne p)
{
	this.titulaire=p;
	count++;
	num=count;
	this.debitMax=1000;
	this.decouvertMax=800;
}

Compte(Personne p,int num,double solde,double debitMax,double decouvertMax)
{
	this.num=num;
	this.titulaire=p;
	this.sold=0;
	this.debitMax=debitMax;
	this.decouvertMax=decouvertMax;
	
}
double setsold(double sold)
{
	this.sold=sold;
	estadecouvert=estadecouvert();
	return debitMax;
}
public String toString()
{
	 return "num : "+this.num+"\n titulaire :"+this.titulaire+"\n solde : "+this.sold+"\n debitMax : "+this.debitMax+"\n decouvertMax : "+this.decouvertMax;
}

public void crediter(double m)
{
	if(m>0)
		
	{this.sold+=m;}
}
private void debiter(double m)
{
 	
 if((this.sold-m)>0)
 {
	 this.sold -=m;
 }
}
boolean retrait (double m)
{
	if(m<=this.debitMax)
	{
		debiter(m);
		estadecouvert=estadecouvert();
		return true;
	}
	else
	{
		System.out.println("limite atteint");
		return false;
	}
}
boolean estadecouvert()
{
	return (this.sold<0);
}
double MontDecouvert() {
	return this.sold;
}
static void virement(double m,Compte c,Compte c1)
{
	if(c.retrait(m))
	{
		c.debiter(m);
		c1.crediter(m);
	}
	else
	{
		System.out.println("insuffisant");
	} 
}
void virementtwo(double m,Compte c)
{
	if (this.retrait(m))
	{
		this.debiter(m);
		c.crediter(m);
	}
}
}


