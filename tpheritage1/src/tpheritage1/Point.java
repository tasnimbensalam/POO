package tpheritage1;

public class Point {
	static char nom;
	static int abs;
	static int ord;
	 


public void affiche ()
	{
		System.out.println(nom+"("+abs+","+ord+")");
	}
public void deplacer(int a,int b)
	{
		abs=abs+a;
		ord=ord+b;
	}
public void rest()
{
	abs=0;
	ord=0;
	
	
}
public Point()
{
	nom='o';
	abs=0;
	ord=0;
}
public Point(char nom, int abs, int ord)
{
	this.nom=nom;
	this.abs=abs;
	this.ord=ord;
}
public Point(Point p)
{
	nom=p.nom;
	ord=p.ord;
	abs=p.abs;
}
@Override //verification
public String toString()
{return ( nom+"("+abs+","+ord+")" );}

public boolean coïncide_V1 (Point p) 
{
	 return p.abs==this.abs && p.ord==this.ord;
}
static boolean coincide_V(Point p,Point p2) 
{
	 return p.abs==p2.abs &&p.ord==p2.ord;
	 
}



}

