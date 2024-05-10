package ex2;

import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import java.io.IOException;



public class TestCopy {

    public static void main(String[] args) {

        try {

            File inputFile = new File("C:\\fichiers\\inn.txt");



            BufferedReader reader = new BufferedReader(new FileReader(inputFile));



            String line;

            boolean auth = false;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(" ");

                if (parts.length >= 2) {

                    String loginFromFile = parts[0].trim();

                    String passwordFromFile = parts[1].trim();



                    String enteredLogin = "User3"; 

                    String enteredPassword = "passUser3"; 



                    if (enteredLogin.equals(loginFromFile) && enteredPassword.equals(passwordFromFile)) {

                        auth = true;

                        break;

                    }

                }

                  

            }



            reader.close();



            if (auth) {

                System.out.println("Authentification réussie");

            } else {

                System.out.println("PB Authentification !!");

            }

        } catch (IOException e) {

            System.out.println("Erreur lors de la lecture du fichier: " + e.getMessage());

        }

    }

}