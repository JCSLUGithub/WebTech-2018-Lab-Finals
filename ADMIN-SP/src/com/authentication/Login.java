package com.authentication;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AuthDAO;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	AuthDAO authDAO = new AuthDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		authDAO.connectToDB();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if (authDAO.checkCredentials(username, password)) {
			
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("dashboard.jsp");
			
		} else {
			
			response.sendRedirect("login.jsp");
			
		}
	}

}
