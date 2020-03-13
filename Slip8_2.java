
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HitCount extends HttpServlet
{
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
Cookie c[]=request.getCookies();
if(c==null)
 {
 Cookie cookie = new Cookie("count","1"); response.addCookie(cookie);
out.println("<h3>Welcome Servlet<h3>"+ "Hit Count:<b>1</b>");
}
else
{

int val=Integer.parseInt(c[0].getValue())+1; c[0].setValue(Integer.toString(val)); response.addCookie(c[0]); out.println("Hit Count:<b>"+val+"</b>");

}
 }
}