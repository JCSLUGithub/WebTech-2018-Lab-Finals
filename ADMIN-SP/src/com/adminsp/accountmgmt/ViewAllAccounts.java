package com.adminsp.accountmgmt;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdminSPAccountMgmtDAO;
import com.adminsp.accountmgmt.AccountInfo;

@WebServlet("/ViewAllAccounts")
public class ViewAllAccounts extends HttpServlet {
	
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
