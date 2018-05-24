package servlet;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.miage.model.CandidatType;
import com.miage.model.CandidatureType;
import com.miage.model.ParcoursType;

import model.Candidature;

/**
 * Servlet implementation class gestionCandidatures
 */


@WebServlet("/CandidatureServlet")
public class CandidatureServlet extends HttpServlet {
	private static final String VUE = "/pages/candidature/candidature.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CandidatureServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.err.println("eee");
		this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String combobox= req.getParameter("combobox");
	

		Candidature c = new Candidature();
		c.setCombobox(combobox);
		
		
		req.setAttribute("utilisateur", c);
		this.getServletContext().getRequestDispatcher("/WEB-INF/candidature.jsp").forward(req, response);
		
		
	}
	
	
}
