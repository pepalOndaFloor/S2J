import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;

public class ServletInfo extends HttpServlet{
    public void service(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException , IOException{
        PrintWriter out = response.getWriter();

        String ipaddress = request.getRemoteAddr();
        String browser = request.getHeader("User-Agent");
        String server  = request.getServletContext().getServerInfo();
        String os = System.getProperty("os.name");
        String method = request.getMethod();
        //String servletnames = getServletNames();

        out.println("Client Information");
        out.println("IP Address : " + ipaddress);
        out.println("Browser : " + browser);
        out.println("Server : " + server);
        out.println("OS : " + os);
        out.println("Method : " + method);
      //  out.println("Servlet Names : " + servletnames);
    }
}