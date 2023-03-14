package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import dao.Ads;
import dao.DaoFactory;
import dao.ListAdsDao;


@WebServlet(name = "controllers.AdsServlet", value = "/ads")
public class AdsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//  Instructors methods makes it better for performance and for future proofing if code needs to be refactored
        Ads adsDao = DaoFactory.getAdsDao();

            request.setAttribute("ads", adsDao.all());
//        request.setAttribute("ads", DaoFactory.getAdsDao().all()); this is the method I used no separation of concerns
        request.getRequestDispatcher("/ads/index.jsp").forward(request,response);
    }
}
