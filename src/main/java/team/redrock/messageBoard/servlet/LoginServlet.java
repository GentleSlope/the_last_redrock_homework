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
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession ses = request.getSession();
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        MessageBoardDaoImpl userDAO=new MessageBoardDaoImpl();
        User user= userDAO.login(username, password);
        if(user!=null){
            ses.setAttribute("username",username);
            ses.setAttribute("password",password);
            response.getWriter().write("\n" +
                    "login successfully!!!!");
        }else{
            response.getWriter().write("\n" +
                    "User doesn't exist!!!!");
        }
    }
}
