package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleTest
 */
/** アノテーション/マッピング名 **/
@WebServlet("/SampleTest")
public class SampleTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    /** protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException{} はテンプレートのようなもの **/
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
			// /SampleTestのリクエストがあった場合、JSPを表示
			request.getRequestDispatcher("/WEB-INF/view/sample.jsp").forward(request, response);
		}
}
