package tp4Encapsulation;
public class AgenceMobiliere {
private Vehicule tab[];
private Vehicule ta;
private final  int max=5;
private int nb=0;
 AgenceMobiliere(int max) {
	
	
		tab=new Vehicule [this.max];
	
}
void ajoutVehicule(Vehicule v )
{
	if(this.nb<this.max)
	{
		tab[nb]=v;
		this.nb+=1;
	}
	else
	{
		System.out.println("plus d'espace ");
	}
	
}
void selection(int n)
{
	if( n<nb)
	{
		tab[n].decrisVehicule();
	}
	else
	{
		System.out.println("case nexiste pas");
	}
}
void selection(String mq)
{
	boolean existe=false;
	for(int i=0;i<nb;i++)
	{
		if(tab[i].getMarque().equals(mq))
		{
			 existe =true;
			tab[i].decrisVehicule();
			
		}
	}
	if (existe==false)
	{
	 System.out.println(" marque n'existe pas ");
	}
}
void selection(double px)
{
	boolean existe=false;
	for(int i=0;i<nb;i++)
	{
		if(tab[i].getPrix()<px)
		{
			tab[i].decrisVehicule();
			 existe =true;
		}
	}
	if (existe==false)
	{
	 System.out.println("il n’y a pas de véhicules dans cette marge de prix ");
	}
}
void ancienne()
{
	/*int anci=tab[0].getAn();
	ta=tab[0];*/
	Vehicule v=tab[0];
	for(int i=0;i<nb;i++)
	{
		if(tab[i].getAn()<v.getAn())
		{
			//anci=tab[i].getAn();
			v=tab[i];
		}
	}
	v.decrisVehicule();
}
}
