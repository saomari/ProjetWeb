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

/**
 * Servlet implementation class gestionCandidatures
 */


@WebServlet("/gestionCandidatures")
public class GestionCandidatures extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionCandidatures() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
////		String test = (String) request.getParameter("test");
//		CandidatType candiTy = new CandidatType();
//		candiTy.setAge(20);
//		candiTy.setCivilite("M");
////		candiTy.setNom(test);
//		candiTy.setNom("AOMARI");
//		candiTy.setPrenom("Sarah");
//		ParcoursType parcTy = new ParcoursType();
//		parcTy.setEtablissement("Université de Bordeaux");
//		parcTy.setAnneeBac("2015");
//		CandidatureType ct = new CandidatureType();
//		ct.setCandidat(candiTy);
//		ct.setParcours(parcTy);
//		request.getSession().setAttribute("candidat", ct);
//		gotoPage("/affichage.jsp",request,response);
	}
	 
	/**
	 * 
	 * @param adress hk
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * 
	 */
	private static void gotoPage(String adress, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		RequestDispatcher dispatcher = request.getSession().getServletContext().getRequestDispatcher(adress);
		dispatcher.forward(request, response);
	}
}
