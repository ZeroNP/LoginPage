

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public LoginServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userPwd=request.getParameter("userPwd");
		String userName=request.getParameter("userId");
		if(!userName.contains("2K")||!userPwd.equals("123456")||userName.length()!=11) {
			RequestDispatcher rd=request.getRequestDispatcher("LoginPage.html");
			PrintWriter pw=response.getWriter();
			pw.write("<p style='display:none' id='valid'>Invalid</p>");
			
			rd.include(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("HomePage.html");
			rd.forward(request, response);
		}
	}

}
