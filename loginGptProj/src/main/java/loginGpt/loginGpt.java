package loginGpt;

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
import java.sql.SQLException;

/**
 * Servlet implementation class loginGpt
 */
public class loginGpt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String Load_Driver="com.mysql.cj.jdbc.Driver";
    public static String URL="jdbc:mysql://localhost:3306/Studentdb";
    public static String user="root";
    public static String password="Kritan@321";
	Connection connection;
    /**
     * Default constructor. 
     */
    public loginGpt() {
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
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uname=req.getParameter("uname");
		String pswd=req.getParameter("pswd");
		String query="select * from uinfo where uname=?";
		PrintWriter pw=res.getWriter();
		try {
			PreparedStatement prepareStatement=connection.prepareStatement(query);
			prepareStatement.setString(1, uname);
			ResultSet resultSet=prepareStatement.executeQuery();
			if(resultSet.next()) {
				pw.println("<html><body bgcolor=black color=Yellow><center>");
				pw.println("<h1>Welcome to CoodeForSuccess</h1>");
				pw.println("</center></body></html>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
