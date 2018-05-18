package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InscriptionServelet
 */
@WebServlet("/InscriptionServelet")
public class InscriptionServlet extends HttpServlet {
	public static final String VUE = "/WebContent/pages/inscription/inscription.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
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
		String name =req.getParameter("name");
		String prenom=req.getParameter("prenom");
		String mdp=req.getParameter("mdp");
		String mdp2=req.getParameter("mdp2");
		String phone =req.getParameter("phone");
		String email =req.getParameter("email");
		String nationalite =req.getParameter("nationalite");
		String add=req.getParameter("paddress");
		String genderboxes =req.getParameter("genderboxes");
		String selectbasic =req.getParameter("selectbasic");
		
	}

}
