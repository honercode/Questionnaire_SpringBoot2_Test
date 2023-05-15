package com.questionnaire_system.user;

import com.questionnaire_system.service.UserService;
import com.questionnaire_system.util.Log;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/user/login.do")
public class LoginDoServlet extends HttpServlet {
  private final UserService  userService = new UserService();

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    request.setCharacterEncoding("utf-8");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    Log.println("输入的用户名是：" + username);
    Log.println("输入的密码是：  " + password);


  }
}
