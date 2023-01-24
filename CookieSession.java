

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CookieSession
 */
@WebServlet("/CookiesSession")
public class CookieSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie cookie[] = request.getCookies();
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>LoginSucces</title><body>");
		out.print("<h2>Cookie Details</h2>");
		for(int i=0;i<cookie.length;i++)
		{
			out.print("<p>Cookie Name:"+cookie[i].getName()+" Cookie Value:"+cookie[i].getValue());
		}
		out.print("</body></html>");
	}

}
