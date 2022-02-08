package com;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.SimpleToDo;

import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "todorservlet",
        urlPatterns = "/"
)
public class ToDoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ToDoService toDoService = new ToDoService();

        List<SimpleToDo> toDos = toDoService.getToDos();

        req.setAttribute("todos", toDos);
        RequestDispatcher view = req.getRequestDispatcher("main.jsp");
        view.forward(req, resp);

    }
}
