 package com.user.servlet;

//import 数据库
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;

//瀹炵幇鐢ㄦ埛鐧诲綍鍔熻兘
public class LoginServlet extends HttpServlet {
	/*public String checkdata(String e_mail,String password)
	{
		if(InquireUser(e_mail) ==     &&InquireUser(e_mail) ==  &&    InquireUser(e_mail) ==   )
		{
			return hasE_mailAndPasswordCorrect;
		}
	 	else if(InquireUser(e_mail) ==     &&InquireUser(e_mail) ==  &&    InquireUser(e_mail) ==   )
		{
			return hasE_mailButPasswordInCorrect;
		}
		else if(InquireUser(e_mail) ==    &&InquireUser(e_mail) ==  &&    InquireUser(e_mail) ==   )
		{
			return hasNoE_mail;
		}
	} 
	*/
	public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
	/*	OutputStream out = resp.getOutputStream();
        String e_mail = req.getParameter("e_mail");
        String password = req.getParameter("password");
       // ManageSQLServer2008 check = new ManageSQLServer2008();ManageSQLServer2008数据库
        String result = check.checkdata(e_mail,password);
        if (result.equals("hasE_mailAndPasswordCorrect")) {

            System.out.println("邮箱和密码均正确");

        } else if (result.equals("hasE_mailButPasswordInCorrect")) {

            System.out.println("邮箱正确,密码不正确");

        } else if (result.equals("hasNoE_mail")) {

            System.out.println("没有此用户");

        }*/

        //转发到result.jsp
       // RequestDispatcher rd = req.getRequestDispatcher("主页.jsp");//
       // rd.forward(req, resp);
		
		//OutputStream out = resp.getOutputStream();
        //String e_mail = req.getParameter("e_mail");
        //String password = req.getParameter("password");
        //if (e_mail == "1" && password == "1") {

            //System.out.println("邮箱和密码均正确");
            req.getRequestDispatcher("/主页0.jsp").forward(req, resp);
            //resp.sendRedirect("/主页.jsp");
            //return;
       // } 
		//req.getRequestDispatcher("主页。jsp").forward(req, resp);
		
		

    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doGet(req,resp);
	}

}
