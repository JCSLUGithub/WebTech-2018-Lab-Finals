package com.accountmgmt.adminsp;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accountmgmt.adminsp.AccountInfo;
import com.dao.AdminSPAccountMgmtDAO;

@WebServlet("/ViewAllAdminSPAccounts")
public class ViewAllAdminSPAccounts extends HttpServlet {
	
	AdminSPAccountMgmtDAO accountMgmtDAO = new AdminSPAccountMgmtDAO();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<AccountInfo> accountList;
		
		try {
			
			accountList = accountMgmtDAO.getAccountList(accountMgmtDAO.connectToDB());
			request.setAttribute("accountList", accountList);
			
			RequestDispatcher requestDispatcher;
			requestDispatcher = request.getServletContext().getRequestDispatcher("/adminspmgmt.jsp");
			requestDispatcher.forward(request, response);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
