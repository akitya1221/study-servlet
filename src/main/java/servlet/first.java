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
 * Servlet implementation class first
 */
@WebServlet("/first")
public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
			// セッションの作成または取得
			HttpSession session = req.getSession(true);
			// セッションオブジェクトからデータ（cart）を取得
			ArrayList<String> booklist = (ArrayList<String>)session.getAttribute("cart");
			
			req.setCharacterEncoding("utf-8");
			res.setContentType("text/html;charset=utf-8");
			
			String name = req.getParameter("name");
			if (name == null) {
				name = "名無しさん";
			} else {
				// 何もしない
			}
			
			String book = req.getParameter("book");
			
			if (booklist == null) {
				booklist = new ArrayList<String>();
				// name属性の値を取得し、変数に代入
			} else if(book != null) {
				// リストのbooklistに追加する
				booklist.add(book);
			} else {
				// 何もしない
			}
			// cartという名前でセッションオブジェクトにbooklistを保存
			session.setAttribute("cart", booklist);
			
			PrintWriter out = res.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>初めてのサーブレット</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>サーブレットを始めよう！</h1>");
			out.println("<form action=/ServletSample/first method=POST>");
			out.println("<input type=text name=name>");
			out.println("<select name=book size=1>");
			out.println("<option value=Java>Java</option>");
			out.println("<option value=JavaScript>JavaScript</option>");
			out.println("</select>");
			out.println("<input type=submit value=送信>");
			out.println("</form>");
			out.println("<p>ユーザー：" + name + "</p>");
			out.println("<h2>カートの中身</h2>");
			out.println("リストの中身：" + booklist + "<br>");
			for (int i = 0; i < booklist.size(); i++) {
				out.println(booklist.get(i) + "<br>");
			}
			out.println("<a href=/ServletSample/delete>セッション情報の削除</a><br>");
			out.println("<a href=/ServletSample/SampleTest>戻る</a>");
			out.println("</body");
			out.println("</html");
		}
	
	// /firstリクエストがあった場合、req,resの情報をdoPostに渡す
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
			doPost(req, res);
		}
}
