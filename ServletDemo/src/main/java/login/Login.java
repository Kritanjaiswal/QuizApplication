package login;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String Load_Driver="com.mysql.cj.jdbc.Driver";
    public static String URL="jdbc:mysql://localhost:3306/userdb";
    public static String user="root";
    public static String password="Kritan@321";
    Connection connection;
    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			connection=DriverManager.getConnection(URL, user, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pswd=request.getParameter("pswd");
		try {
			String query="select * from uinfo where uname=?";
			PreparedStatement preparestatement=connection.prepareStatement(query);
			preparestatement.setString(1, uname);
			ResultSet resultset=preparestatement.executeQuery();
			PrintWriter pw=response.getWriter();
			pw.println("<html><body bgcolor=black text=white><center>");
			if(resultset.next()) {
				pw.println("Welcome :"+uname);
			}else {
				pw.println("User not Valid");
			}
			pw.println("</center></body></html>");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
