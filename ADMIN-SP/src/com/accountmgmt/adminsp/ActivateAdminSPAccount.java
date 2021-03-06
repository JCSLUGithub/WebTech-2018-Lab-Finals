package com.accountmgmt.adminsp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdminSPAccountMgmtDAO;

@WebServlet("/ActivateAdminSPAccount")
public class ActivateAdminSPAccount extends HttpServlet {
	
	AdminSPAccountMgmtDAO accountMgmtDAO = new AdminSPAccountMgmtDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int accountID;
		accountID = Integer.parseInt(request.getParameter("accountID"));
		
		try {
			accountMgmtDAO.activateAccount(accountMgmtDAO.connectToDB(), accountID);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		response.sendRedirect(request.getContextPath() + "/ViewAllAdminSPAccounts");
		
	}

}
