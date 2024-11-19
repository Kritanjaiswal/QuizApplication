package register;

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
import java.sql.SQLException;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String Load_Driver="com.mysql.cj.jdbc.Driver";
    public static String URL="jdbc:mysql://localhost:3306/userdb";
    public static String user="root";
    public static String password="Kritan@321";
    Connection connection;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			connection=DriverManager.getConnection(URL, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String uname=request.getParameter("uname");
		String pswd=request.getParameter("pswd");
		try {
			String query="insert into uinfo values(?, ?, ?, ?)";
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, fname);
			preparedStatement.setString(2, lname);
			preparedStatement.setString(3, uname);
			preparedStatement.setString(4, pswd);
			preparedStatement.executeUpdate();
			PrintWriter pw=response.getWriter();
			pw.println("<html><body bgcolor=black text=white><center>");
			pw.println("<h2>Registration Successfully...</h2>");
			pw.println("<a href=login.html>Login</a>");
			pw.println("</center></body></html>");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
