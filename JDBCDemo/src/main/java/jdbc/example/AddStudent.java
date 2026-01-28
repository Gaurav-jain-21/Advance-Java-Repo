package jdbc.example;

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

@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("uname");
		String number = request.getParameter("umobile");
		String address = request.getParameter("uaddress");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/employee?useSSL=false&serverTimezone=UTC",
				"root",
				"Roman123@."
			);

			PreparedStatement ps = con.prepareStatement(
				"INSERT INTO student (name, mobile, address) VALUES (?, ?, ?)"
			);

			ps.setString(1, name);
			ps.setString(2, number);
			ps.setString(3, address);

			int count = ps.executeUpdate();

			if (count == 1) {
				out.println("<h3>Student inserted successfully</h3>");
			} else {
				out.println("<h3>Insertion failed</h3>");
			}

			ps.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
			out.println("<h3>Error: " + e.getMessage() + "</h3>");
		}
	}
}
