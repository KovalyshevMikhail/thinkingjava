package com.nebiroz.thinkingjava.lessons;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/chapters")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CONTENT_TYPE = "text/html;charset=UTF-8";
	private static final String MESSAGE = "<!DOCTYPE html><html>"
			+ "<head><title>Hello!</title></head>";
    public static String BODY = "";
    private static final String BEGINBODY = "<body>";
    private static final String ENDBODY = "</body></html>";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BODY = "<p>Hello, World!!</p>";
		//Number of chapter to work
		int chapter = (request.getParameter("chapter") != null) ? Integer.parseInt(request.getParameter("chapter")) : 0;
		//Number of test examples
		int exId = (request.getParameter("ex") != null) ? Integer.parseInt(request.getParameter("ex")) : 0;
		//Number of exercise
		int excId = (request.getParameter("exc") != null) ? Integer.parseInt(request.getParameter("exc")) : 0;
		
		FactoryTask taskManager = new FactoryTask(chapter, exId, excId);
		BaseExample example = taskManager.getTask();
		
		if (example != null){
			BODY = example.runExample();
		}
		else{
			BODY = "Entered chapter and example numer is not valid!" 
					+ "<br/>" + request.getQueryString();
		}
		
		response.setContentType(CONTENT_TYPE);
		try (PrintWriter out = response.getWriter()) {
			out.println(getFullMessageText());
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	private String getFullMessageText(){
		return (MESSAGE + BEGINBODY + BODY + ENDBODY); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/

}
