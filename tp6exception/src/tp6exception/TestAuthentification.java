package tp6exception;

public class TestAuthentification {

	static boolean erreur=false;
		public static void main(String[] args)  {
			do {
				try {
			Authentification a=new Authentification();
			
				}
				catch(WrongLoginException w){
					System.out.println("errrreuuuurrr");
					erreur=true;
				}
				catch(WrongPwdException w1){
					System.out.println("errrreuuuurrr2");
					erreur=true;
				}
				catch(WrongInputLength w2){
					System.out.println("errrreuuuurrr3");
					erreur=true;
				}}
			while(erreur ==true);
				
			
			
	}

}
