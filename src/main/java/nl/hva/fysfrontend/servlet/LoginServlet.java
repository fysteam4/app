package nl.hva.fysfrontend.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import nl.hva.fysfrontend.model.User;
import nl.hva.fysfrontend.service.LoginService;
import nl.hva.fysfrontend.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginService loginService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		loginService = new LoginServiceImpl();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("Dit moet werken");
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json");
		Gson g = new Gson();

		try {
			StringBuilder sb = new StringBuilder();
			String s;
			while ((s = request.getReader().readLine()) != null) {
				sb.append(s);
			}
			
			User user = g.fromJson(sb.toString(), User.class);
			
			User resultUser = loginService.login(user);
			
			PrintWriter out = response.getWriter();
			out.println(g.toJson(resultUser));
		} catch (Exception e) {
			
		}
	}

}
