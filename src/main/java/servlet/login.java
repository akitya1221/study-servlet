package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String const_name = "test";
		String const_pass = "test";
		
		String in_name = request.getParameter("user_name");
		String in_pass = request.getParameter("password");
		
		System.out.print(in_name + ":" + in_pass);
		
		// setAttributeメソッドを使用しなければオブジェクトの登録がされないため、JSPでオブジェクトの参照をすることができない。
		request.setAttribute("name", in_name);
		
		if (const_name.equals(in_name) && const_pass.equals(in_pass)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/login.jsp");
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/sample.jsp");
			dispatcher.forward(request, response);
		}
	}

}
