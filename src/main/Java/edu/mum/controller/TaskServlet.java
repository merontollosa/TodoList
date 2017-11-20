package edu.mum.controller;

import edu.mum.service.TaskService;
import edu.mum.util.DBConnection;
import edu.mum.util.ObjectFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import edu.mum.domain.Task;

@WebServlet("/TaskServlet")
public class TaskServlet extends HttpServlet {
    SimpleDateFormat formatter = new SimpleDateFormat("mm/dd/yyyy");
    DBConnection conn=DBConnection.getInstance();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      String name=request.getParameter("task");
      String taskDate=request.getParameter("datereq");
      String category=request.getParameter("category");
        Date parsed = null;
        try {
            parsed = formatter.parse(taskDate);
        } catch (ParseException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        java.sql.Date data = new java.sql.Date(parsed.getTime());


        java.sql.Date sql = new java.sql.Date(parsed.getTime());
      Task newTask=ObjectFactory.getTaskObject(name,data,category,"New");
      TaskService service= ObjectFactory.getServiceObject();
      if(service.saveTask(newTask)==null)
          System.out.print("Not Saved");




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher=request.getRequestDispatcher("task.jsp");
        dispatcher.forward(request,response);
    }
}
