package tp6exception;
import java.io.IOException;
import java.util.Scanner;


public class Authentification {
	private final String LoginCorrect="scott";
	private final String LoginPwdt="tiger";
	
	private String getUserLogin() throws WrongInputLength, IOException, WrongLoginException{
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer votre login : ");
        String login= scanner.nextLine();
        if(login.length()>10) {
        	throw new  WrongInputLength("length ghalta");
        }
        if(!(login.equals(LoginCorrect))){
        	throw new  WrongLoginException("login ghalet");
	}
		
			return login;
		}
	
	private String getUserPwd() throws WrongPwdException, IOException{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer votre pwd : ");
        String pwd= scanner.nextLine();
        if(!(pwd.equals(LoginPwdt))) {
        	throw new  WrongPwdException("mdp ghalet");
        }
        return pwd;
		}
		
	Authentification() throws WrongLoginException,WrongPwdException,WrongInputLength, IOException{
			getUserLogin();
			getUserPwd();
		}
	}


