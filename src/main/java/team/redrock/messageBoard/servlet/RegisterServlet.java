package team.redrock.messageBoard.servlet;

import team.redrock.messageBoard.been.Message;
import team.redrock.messageBoard.been.User;
import team.redrock.messageBoard.dao.impl.MessageBoardDaoImpl;
import team.redrock.messageBoard.service.MessageBoardService;
import team.redrock.messageBoard.service.impl.MessageBoardServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public RegisterServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPut(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        int id=Integer.valueOf(request.getParameter("id"));
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        User user=new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        MessageBoardDaoImpl userDAO=new MessageBoardDaoImpl();
        userDAO.addUser(user);
        response.getWriter().write("注册成功！");
    }
}

