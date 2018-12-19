package br.com.treinaweb.agenda.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MensagemServlet extends HttpServlet {

	private static final long serialVersionUID = -2729038205237024561L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Servlet - Java web</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<form action='/receberMensagem'> ");
		out.println("			<p>Digite seu nome</p>");
		out.println("			<p><input type='text' name='userName' /></p>");
		out.println("			<p><button type='submit'>Enviar</button></p>");
		out.println("		</form>");
		out.println("	</body>");
		out.println("</html>");
		
	}

	
}
