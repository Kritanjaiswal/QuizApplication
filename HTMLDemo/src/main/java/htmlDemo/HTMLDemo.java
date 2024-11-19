package htmlDemo;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HTMLDemo
 */
public class HTMLDemo extends GenericServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HTMLDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s=request.getParameter("uname");
		PrintWriter pW=response.getWriter();
		pW.println("uname: "+s);
	}

}
