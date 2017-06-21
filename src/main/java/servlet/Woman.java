package servlet;

import dao.MansList;
import dao.WomansList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;



@WebServlet("/womans")
public class Woman extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<bean.Woman> womanList = WomansList.getList();

        request.setAttribute("womanlist", womanList);

        RequestDispatcher rq = request.getRequestDispatcher("/womansList.jsp");
        rq.forward(request, response);
    }
}
