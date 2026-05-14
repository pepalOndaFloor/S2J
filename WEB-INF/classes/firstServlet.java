import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class firstServlet extends HttpServlet{
    public void service(HttpServletRequest request , HttpServletResponse response) 
    throws IOException, ServletException{
        PrintWriter out = response.getWriter();
        //above is the boiler plate code for servlet 

        String uname = request.getParameter("user");
        out.println("Hello "+uname);
    }
}
