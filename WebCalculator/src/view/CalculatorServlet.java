package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");

		out.println("<html>");
		out.println("<body>");
		
		try {
			int x = Integer.parseInt(num1);
			int y = Integer.parseInt(num2);

			int sum = x + y;
			out.println("<h1>Sum is " + sum+"</h1>");
		} catch (NumberFormatException e){
			out.println("<font color='red'>Invalid Number Entered  " + e.getMessage()+"</font>");
		}
		

		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
