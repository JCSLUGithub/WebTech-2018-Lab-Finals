package com.accountmgmt.client;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accountmgmt.client.AccountInfo;
import com.dao.ClientMgmtDAO;

@WebServlet("/ViewClientAccount")
public class ViewClientAccount extends HttpServlet {
	
	ClientMgmtDAO accountMgmtDAO = new ClientMgmtDAO();
	AccountInfo accountInfo = new AccountInfo();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int accountID;
		accountID = Integer.parseInt(request.getParameter("accountID"));
		
		try {
			
			accountInfo = accountMgmtDAO.getAccountInfo(accountMgmtDAO.connectToDB(), accountID);
			request.setAttribute("accountInfo", accountInfo);
			
			RequestDispatcher requestDispatcher;
			requestDispatcher = request.getServletContext().getRequestDispatcher("/clientviewaccount.jsp");
			requestDispatcher.forward(request, response);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
