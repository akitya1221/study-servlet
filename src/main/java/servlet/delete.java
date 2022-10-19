package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class delete
 */
@WebServlet("/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
			// セッションの作成または取得
			HttpSession session = req.getSession(true);
			// セッションオブジェクトからデータ（cart）を取得
			ArrayList<String> booklist = (ArrayList<String>)session.getAttribute("cart");
			session.removeAttribute("cart");
			
			req.setCharacterEncoding("utf-8");
			res.setContentType("text/html;charset=utf-8");
			PrintWriter out = res.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>削除確認</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>削除しました</h1>");
			out.println("<a href=/ServletSample/SampleTest>戻る</a>");
			out.println("</body>");
			out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
