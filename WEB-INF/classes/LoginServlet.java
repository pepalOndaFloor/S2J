import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) 
	throws ServletException,IOException{
		PrintWriter pw = response.getWriter();
		
		String uname = request.getParameter("usr");
		String pass = request.getParameter("pwd");
		
		if(uname.equals(pass))
			pw.println("Congrats "+uname);
		else
			pw.println("Sorry "+uname);
	}
}