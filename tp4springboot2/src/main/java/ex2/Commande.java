package ex2;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.hotel.FabriquePetitDej;
import fr.hotel.PetitDejeuner;



/**
 * Servlet implementation class commande
 */
@WebServlet("/commande")
public class Commande extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Commande() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.getRequestDispatcher("/WEB-INF/formulaire.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Préparation de la fabrique
		FabriquePetitDej fabrique = new FabriquePetitDej();
		// Traitement de la requête et récupération du bean en résultant
		PetitDejeuner petitDej = null;
		try {
			petitDej = fabrique.construitPetitDejeuner(request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Ajout du bean à l'objet request pour Dispatcher vers recapitulatif.jsp
		request.setAttribute("attributPetitDej", petitDej );
		if(fabrique.succesCreation) {
		request.getRequestDispatcher("/WEB-INF/recapitulatif.jsp").forward(request, response);}
		else {
			request.getRequestDispatcher("/WEB-INF/formulaire.jsp").forward(request, response);
		}
	}
}