package team.redrock.messageBoard.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "loginFilter",
        urlPatterns = "/send")
public class LoginFiLter implements Filter{

    public void init(FilterConfig config) throws ServletException{}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException ,ServletException{
        HttpServletRequest req = (HttpServletRequest)request;
        HttpSession ses = req.getSession();
        if(ses.getAttribute("username")!=null){
            chain.doFilter(request,response);
        }else {
            request.getRequestDispatcher("/login").forward(request,response);
        }
    }
    @Override
    public void destroy(){}

    }
