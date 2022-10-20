package bean;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/counter")
public class SampleBean extends HttpServlet {
	private int count;
	
	// コンストラクタ
	public SampleBean() {
		count = 0;
	}
	
	// セッター
	public void setCount(int count) {
		this.count = count;
	}
	// ゲッター
	public int getCount() {
		count ++;
		return count;
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
			// /SampleTestのリクエストがあった場合、JSPを表示
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/counter.jsp");
			dispatcher.forward(req, res);
	}
}