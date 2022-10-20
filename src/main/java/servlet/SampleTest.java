package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
	
    /** protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException{} はテンプレートのようなもの **/
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
			// /SampleTestのリクエストがあった場合、JSPを表示
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/sample.jsp");
			dispatcher.forward(req, res);
			
			// 下記は省略した書き方
			// req.getRequestDispatcher("/WEB-INF/view/sample.jsp").forward(req, res);
		}
}
