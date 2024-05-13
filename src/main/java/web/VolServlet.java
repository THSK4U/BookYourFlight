package web;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.flyDao;
import metier.vol;

@WebServlet("/")
public class VolServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private flyDao dao;

    public void init() {
        dao = new flyDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<vol> vols = dao.allvol();
        request.setAttribute("vols", vols);
        request.getRequestDispatcher("vols.jsp").forward(request, response);
    }
}