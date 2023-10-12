package td3;
import java.util.Scanner;
public class Tab {
static final int nmax=40;




static void remplir(float t[]) {
    Scanner scanner = new Scanner(System.in); 

    for (int i = 0; i < t.length; i++) {
        System.out.println("Remplir tableau [0..20]: ");
        t[i] = scanner.nextFloat();
    }

    scanner.close(); 
}

static float somme_element(float t[])
{
	float s=0;
	for(int i=0;i<nmax;i++)
	{
		s+=t[i];
	}
	return  s;
}
static float[] additionner(float t1[],float t2[])
{
		int max=Math.max(t1.length, t2.length);
	float[] t3=new float[max];
	
		for(int i=0;i<t1.length;i++)
	{
		t3[i]=t1[i]+t2[i];
	}
	return t3 ;
	
}
static float[] produit(float c,float t1[])
{
	float[] t3=new float[t1.length];
	for(int i=0;i<t3.length;i++)
	{
		t3[i]=t1[i]*c;
	}
	return t3 ;
}
static float[] moyenne(float t1[])
{
	
	float[] t3=new float[t1.length];
	for(int i=0;i<=t1.length;i++)
	{
		t3[i]=t1[i]/3;
	}
	return t3 ;
}
static void lister(float t[])
{
	for(int i = 0;i<t.length;i++)
	{
		System.out.println("["+t[i]+"]");
	}
	
}
static float[] additionne(double x, float t[])
{
	float[] t3=new float[t.length];
	for(int i = 0;i<t.length;i++)
	{
		t3[i]= (float) (t[i]+x);
	}
	return t3;
}
}
