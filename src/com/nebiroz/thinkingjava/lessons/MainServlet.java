package com.nebiroz.thinkingjava.lessons;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CONTENT_TYPE = "text/html;charset=UTF-8";
	private static final String MESSAGE = "<!DOCTYPE html><html>"
			+ "<head><title>Список упражнений</title></head>";
    public static String BODY = "";
    private static final String BEGINBODY = "<body>";
    private static final String ENDBODY = "</body></html>";

	public static final String[] CHAPTERSNAMES = {
			"Введение в объекты",
			"Все является объектом",
			"Операторы",
			"Управляющие конструкции",
			"Инициализация и завершение",
			"Управление доступом",
			"Повторное использование классов",
			"Полиморфизм",
			"Интерфейсы",
			"Внутрениие классы",
			"Коллекции объектов",
			"Обработка ошибок и исключения",
			"Строки",
			"Информация о типах",
			"Обобщенные типы",
			"Массивы",
			"Подробнее о контейнерах",
			"Система ввода-вывода Java",
			"Перечислимые типы",
			"Аннотации",
			"Параллельное выполнение",
			"Графический интерфейс"
	};

	/**
	 * Массив упражнений.
	 * TODO: дома надо заполнить
	 */
	//private int[][] countsExercisesOfChapters;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int exId = 0;
		BaseExample example;
		BODY = "<p>Главы изученной книги:</p>";
		BODY += "<ol>";
		for (int chapter = 1; chapter < 23; chapter++){
		BODY += "<li> глава - " + CHAPTERSNAMES[chapter - 1] + "</li>";
			BODY += "<ul>\n";
			for (int excId = 1; excId < 10; excId++){
				FactoryTask taskManager = new FactoryTask(chapter, exId, excId);
				example = taskManager.getTask();

				if (example != null){
					BODY += "<li><a href=\"/lessons/chapters?chapter=" + chapter + "&exc=" + excId + "\">Упражнение " + excId + "</a><br/>" + example.description + "</li>\n";
				}
				else{
					break;
				}
			}
			BODY += "</ul>\n";
		}
		BODY += "</ol>";
		example = null;

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
