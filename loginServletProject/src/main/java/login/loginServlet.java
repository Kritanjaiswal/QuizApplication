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
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String Load_Driver="com.mysql.cj.jdbc.Driver";
    public static String URL="jdbc:mysql://localhost:3306/Studentdb";
    public static String user="root";
    public static String password="Kritan@321";
    Connection connection;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname");
		String pswd=request.getParameter("pswd");
		try {
			String query="select * from uinfo where uname=?";
			PreparedStatement preparestatement=connection.prepareStatement(query);
			preparestatement.setString(1, uname);
			ResultSet resultset=preparestatement.executeQuery();
			PrintWriter pw=response.getWriter();
			if(resultset.next()) {
				pw.println("Welcome :"+uname);
			}else {
				pw.println("User not Valid");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
