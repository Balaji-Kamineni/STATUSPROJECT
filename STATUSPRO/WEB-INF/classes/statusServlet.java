import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class statusServlet extends HttpServlet{
	
	public void service(ServletRequest request, ServletResponse response ) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		int age=Integer.parseInt(request.getParameter("age"));
		String[] hobbies=request.getParameterValues("hob");
		String msg="";
		if (age>=18)
		{
			msg="major";
		}
		else msg="minor";
		out.print("<body bgcolor=green>");
		out.print("<h1 align=center> Status of "+name+"</h1>");
		out.print("<hr><br><br><br><br>");
		out.print("<table align=center>");
		out.print("<tr> <td> Name </td> <td> "+name+"</td></tr>");
		out.print("<tr> <td> Gender </td> <td> "+gender +"</td> </tr>");
		out.print("<tr> <td> age </td> <td> "+age +"</td></tr>");
		out.print("<tr> <td> Hobbies </td> <td>");
		for (String i: hobbies){out.print(i+"<br>");}
		out.print(" </td></tr>");
		out.print("<tr> <td> status </td> <td> "+msg+"</td></tr>");
		out.print("</table></body>");
		out.close();

	}
}