package spring_tp1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculDeMonlmc
 */
@WebServlet("/CalculDeMonlmc")
public class CalculDeMonlmc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculDeMonlmc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String p=request.getParameter("poids");
		String t=request.getParameter("taille");
		double pids=Double.parseDouble(p);
		double tai=Double.parseDouble(t);
		response.getWriter().append("lmc="+pids/(tai*tai));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p=request.getParameter("poids");
		String t=request.getParameter("taille");
		double pids=Double.parseDouble(p);
		double tai=Double.parseDouble(t);
		Imc  m = new Imc(pids,tai);
		double c =m.calcul();
		response.getWriter().append("lmc="+c);
		Cookie poidsCookie = new Cookie("poids", String.valueOf(p));
	    Cookie tailleCookie = new Cookie("taille", String.valueOf(t));
	    Cookie imcCookie = new Cookie("imc", String.valueOf(c));
	    response.addCookie(poidsCookie);
	    response.addCookie(tailleCookie);
	    response.addCookie(imcCookie);
    
	}

}
