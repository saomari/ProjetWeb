package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormationServlet
 */
@WebServlet("/FormationServlet")
public class FormationServlet extends HttpServlet {
	public static final String VUE = "/WebContent/pages/acceuil/formation.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormationServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		
	}

}
