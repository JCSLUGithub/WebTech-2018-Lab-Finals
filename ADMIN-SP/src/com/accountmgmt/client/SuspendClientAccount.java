package com.accountmgmt.client;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ClientMgmtDAO;

@WebServlet("/SuspendClientAccount")
public class SuspendClientAccount extends HttpServlet {
	
	ClientMgmtDAO accountMgmtDAO = new ClientMgmtDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int accountID;
		accountID = Integer.parseInt(request.getParameter("accountID"));
		
		try {
			accountMgmtDAO.suspendAccount(accountMgmtDAO.connectToDB(), accountID);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		response.sendRedirect(request.getContextPath() + "/ViewAllClientAccounts");
		
	}
	
}
