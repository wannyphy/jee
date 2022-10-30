package woa.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import woa.form.ConnectionForm;

/**
 * Servlet implementation class Test
 */

public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  Calendar calendar = Calendar.getInstance();
		  String message = "Yuri eres mi bibi"; StringBuilder sb = new StringBuilder();
		  message = sb.append(message).reverse().toString(); // message=
		  sb.reverse().append(message).toString(); request.setAttribute("variable",
		  message); System.out.println("reverse p: " + sb.append(message).reverse());
		  calendar.add(Calendar.DAY_OF_MONTH, -6);
		  String todaysdate = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(calendar);
		
		  
		  System.out.println("Today's Date is: " + todaysdate);
		  
		  request.setAttribute("heure", todaysdate);
		 

		this.getServletContext().getRequestDispatcher("/WEB-INF/hola.jsp").forward(request, response);
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Today's Date toez: " );
		
		
		
		ConnectionForm form = new ConnectionForm();
		form.verif(request); 
		request.setAttribute("form", form);
		this.getServletContext().getRequestDispatcher("/WEB-INF/hola.jsp").forward(request, response);
		System.out.println("connecto "+ request.getParameter("login"+"olp"));
		System.out.println("connectof "+ request.getParameter("pass"));
		System.out.println("connect "+ form.getResultat());
		
		/**
		 * code pour form contuens mauvaise paratique car le traitement de donées ne doit pas s'effectuer directement dans une sevrlet
		*/
		//request.setAttribute("nom", nom);
		//System.out.println("Todlddddllm: "+nom );
		//System.out.println(response) ;
		
		// TODO Auto-generated method stub
		// doGet(request, response);
	}

}
