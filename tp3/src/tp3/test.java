package tp3;




public class test{
public static void main(String[] args) {

		Personne p=new Personne("tesnim","bensalem","adress");
		Compte c=new Compte(p);
		//System.out.println(c);
		Personne p1=new Personne("tes","ben","adress");
		Compte c1=new Compte(p1);
		//System.out.println(c1);
		c.crediter(500);
		Compte.virement(100, c, c1);
		System.out.println(c);
		System.out.println(c1);
		c.retrait(1000);
		System.out.println(c); 
		c1.virementtwo(100,c1);
		

}} 