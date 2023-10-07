package point;

public class Cercle {
		double r;
		Point centre;
		int a,b;
	    static boolean t;
public Cercle(Point centre ,double r)
{
	this.centre=centre;
	this.r=r;

}
public void afficher()
{
	System.out.println("Centre du cercle : " + centre);
    System.out.println("Rayon du cercle : " + r);

}
public void deplacer(int a,int b)
{
	centre.deplacer(a,b);
}

public static  boolean coincide(Cercle c1,Cercle c2)
{
	t=Point.coincide_V(c1.centre, c2.centre);
	return t && c1.r==c2.r;

}
}