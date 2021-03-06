package de.fhws.app.presentation.showcase.cdi;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("cdi2")
public class CDIServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	Message m;
	

	@Inject
	Message m2;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println(m.getMessage());
		resp.getWriter().println(m2.getMessage());	
		
		m.setMessage("blub");
		
		resp.getWriter().println(m2.getMessage());
	}

}
