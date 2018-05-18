package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServelet")
public class LoginServelet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
		
		String l=request.getParameter("name");
		String p=request.getParameter("pass");
		
		PrintWriter out =response.getWriter();
		
		out.println("<html><body>");
		out.println("<h1> Votre login est :"+l+"</h1>");
		out.println("</body></html>");
	}
}
