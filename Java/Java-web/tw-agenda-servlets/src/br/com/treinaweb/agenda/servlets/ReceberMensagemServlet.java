package br.com.treinaweb.agenda.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReceberMensagemServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7605825879917071904L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName = req.getParameter("user-name");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Servlet - Java web</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<h1>Olá, " + userName + "</h1>");
		out.println("	</body>");
		out.println("</html>");
		
	}
	
	

}
