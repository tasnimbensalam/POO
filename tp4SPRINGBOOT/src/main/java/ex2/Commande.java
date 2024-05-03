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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
        request.getRequestDispatcher("/WEB-INF/formulaire.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FabriquePetitDej fabrique = new FabriquePetitDej();
        PetitDejeuner petitDej = fabrique.construitPetitDejeuner(request);
        
        if (fabrique.succesCreation) {
            request.setAttribute("attributPetitDej", petitDej);
            request.getRequestDispatcher("recapitulatif.jsp").forward(request, response);
        } else {
            request.setAttribute("erreurs", fabrique.erreurs);
            request.getRequestDispatcher("/WEB-INF/formulaire.jsp").forward(request, response);
        }
    }

}
