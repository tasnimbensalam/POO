package spring_tp1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableauDeBord
 */
@WebServlet("/TableauDeBord")
public class TableauDeBord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TableauDeBord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();

       
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Tableau de Bord</h1>");

        String poids = "";
        String taille = "";
        String imc = "";

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("poids")) {
                    poids = cookie.getValue();
                } else if (cookie.getName().equals("taille")) {
                    taille = cookie.getValue();
                } else if (cookie.getName().equals("imc")) {
                    imc = cookie.getValue();
                }
            }
        }

       
        response.getWriter().println("Poids: " + poids + "<br>");
        response.getWriter().println("Taille: " + taille + "<br>");
        response.getWriter().println("IMC: " + imc + "<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
