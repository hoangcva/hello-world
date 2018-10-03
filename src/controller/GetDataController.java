package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetDataController extends HttpServlet{
	public GetDataController() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/GetData.jsp");
		rd.forward(request , response);
	}
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a = Integer.parseInt(request.getParameter("firstnumber"));
		int b = Integer.parseInt(request.getParameter("secondnumber"));

		request.setAttribute("a", a);
		request.setAttribute("b", b);
		request.setAttribute("sum", sum(a,b));
		request.setAttribute("mul", mul(a,b));
		RequestDispatcher rd = request.getRequestDispatcher("/math.jsp");
		rd.forward(request , response);
	}
	
	private int sum(int a,int b) {
		return a+b;
	}
	
	private int mul(int a, int b) {
		return a*b;
	}
}
