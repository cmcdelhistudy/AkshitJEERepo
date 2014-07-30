package view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

	public MyServlet() {
		System.out.println("Inside MyServlet Constructor ");

	}

	@Override
	public void init() throws ServletException {

		System.out.println("Inside MyServlet Init");

		super.init();
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("Inside MyServlet Service Method ");
		super.service(arg0, arg1);
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside MyServlet doGet Method ");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside MyServlet doPost Method ");
	}

	@Override
	public void destroy() {
		System.out.println("Inside MyServlet Destroy Method ");
		super.destroy();
	}

}
