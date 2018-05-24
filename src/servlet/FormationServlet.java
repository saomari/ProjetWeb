package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EnregistrementFormation;
import model.EnregistrementCandidat;
import model.Formation;

/**
 * Servlet implementation class FormationServlet
 */
@WebServlet("/FormationServlet")
public class FormationServlet extends HttpServlet {
	public static final String VUE = "/pages/acceuil/formation.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormationServlet() {
        super();
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
		this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String  motivation =req.getParameter("motivation");
		String school =req.getParameter("school");
		String note =req.getParameter("note");
		String diplome =req.getParameter("diplome");
		
	
		Formation f = new Formation();
		f.setMotivation(motivation);
		f.setSchool(school);
		f.setNote(note);
		f.setDiplome(diplome);
		
		
		EnregistrementFormation eFormation = new EnregistrementFormation("/WEB-INF/enregistrement.xml");
		eFormation.enregistrer(f);
		
		req.setAttribute("utilisateur", f);
		this.getServletContext().getRequestDispatcher("/WEB-INF/formation.jsp").forward(req, response);
	}

}
