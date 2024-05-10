package tpfichier;
import java.io.*;
import java.util.Scanner;

public class TestCopy {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("C:\\fichiers\\inn.txt");
        File output=new File("C:\\fichiers\\output.txt");
      
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        FileWriter out=new FileWriter(output);
        StringBuilder content = new StringBuilder();
        String l;
        while ((l = reader.readLine()) != null) {
            content.append(l).append("\n");
        }
        
        reader.close();

        System.out.println("Contenu du fichier inn.txt :\n" + content);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre login : ");
        String login = scanner.nextLine();
        System.out.print("Entrez votre mot de passe : ");
        String password = scanner.nextLine();

        if (content.toString().contains(login + " pass " + password)) {
            System.out.println("Authentification réussie !");
        } else {
            System.out.println("Problème d'authentification !");
        }
    }
}
