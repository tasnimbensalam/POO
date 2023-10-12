package tp4;
public class AgenceMobiliere {
private Vehicule tab[];
private final int max;
private int nb=0;
void AgenceMobilière(int max) {
	this.max=max;
	for(int i=0; i<max;i++ )
	{
		tab=new Vehicule [max];
	}
}
void ajoutVehicule(Vehicule v )
{
	if(this.nb<this.max)
	{
		tab[nb]=v;
		this.nb+=1:
	}
	else
	{
		System.out.println("plus d'espace ");
	}
	
}
void selection(int n)
{
	if(tab[n]!=NULL || n<nb)
	{
		tab[n].decrisVehicule();
	}
	else
	{
		Systeme.out.println("case nexiste pas");
	}
}
void selection(String mq)
{
	boolean existe=false;
	for(int i=0;i<n;i++)
	{
		if(tab[i].getMarque.equals(mq))
		{
			tab[i].decrisVehicule;
			boolean existe =true;
		}
	}
	if (existe==false)
	{
	 System.out.println("aucune marque existe");
	}
}
void selection(double px)
{
	boolean existe=false;
	for(int i=0;i<n;i++)
	{
		if(tab[i].getPrix()<px)
		{
			tab[i].decrisVehicule;
			boolean existe =true;
		}
	}
	if (existe==false)
	{
	 System.out.println("il n’y a pas de véhicules dans cette marge de prix ");
	}
}

}
