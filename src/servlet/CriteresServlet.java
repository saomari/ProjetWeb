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

import model.Criteres;
import model.EnregistrementCriteres;
import model.EnregistrementFormation;

/**
 * Servlet implementation class gestionCandidatures
 */
@WebServlet("/CandidatureServlet")
public class CriteresServlet extends HttpServlet {
	private static final String VUE = "/pages/candidature/candidature.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CriteresServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() throws ServletException{
    	super.init();
    	System.err.println("Initialisé");
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
	

		Criteres c = new Criteres();
		c.setCombobox(combobox);
		
		
		EnregistrementCriteres eCandidature = new EnregistrementCriteres("/WEB-INF/enregistrement.xml");
		eCandidature.enregistrer(c);
		
		req.setAttribute("utilisateur", c);
		this.getServletContext().getRequestDispatcher("/WEB-INF/candidature.jsp").forward(req, response);
		
		
	}
	
	
}
