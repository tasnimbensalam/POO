package tp6exception;
import java.lang.Math; 

class Mathem {

	private double x;
	private double n;
	
	
	static double f(double x,double n) throws ParameterNullException,NegatifException {
		if(n==0) {
			/*throw new ArithmeticException ("exception null");*/
			throw new ParameterNullException("Message d'erreur division par zero!!");
		}
		if(n<0) {
			throw new NegatifException("negatiif");
		}
		return Math.sqrt(x)/n;	}
	public static void main(String[] args)  {
		try{
				
			    double x = Double.parseDouble(args[0]);
	            double n = Double.parseDouble(args[1]);
			    System.out.println(f(x,n));
	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Vous devriez entrer deux nombres sur la ligne de commande pour que fonctionne");
		}
		catch( NumberFormatException n) {
			System.out.println("Les arguments doivent être des nombres » puis qu’il se termine.");
		}
		/*catch( ArithmeticException a) {
			System.out.println("null !!"+a.getStackTrace());
		}*/
		 catch (ParameterNullException e) {
	            System.out.println("Erreur : " + e.getMessage());}
		catch ( NegatifException n) {
            System.out.println("Erreur : " + n.getMessage());}
		
		finally {
			System.out.println("fin du Programme");
		}
	}

}