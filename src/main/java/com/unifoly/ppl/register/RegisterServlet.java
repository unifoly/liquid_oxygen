package com.unifoly.ppl.register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Lenovo
 */

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet{
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       RegisterDao dao = new RegisterDao();

       String username=request.getParameter("username");
       String password=request.getParameter("password");
       String email=request.getParameter("email");

       User user = new User(username,password,email);
       int result = dao.register(user);

       if(result>0){
           out.print("注册成功,懒得美化提示界面了，先这样吧");
       }else{
           out.print("注册失败，看到这个界面的请务必反馈");
       }
   }

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
       doGet(request, response);
   }
}
