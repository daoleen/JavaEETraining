package com.daoleen.javaee.training.controllers;

import com.daoleen.javaee.training.config.TrainingApplication;
import org.thymeleaf.TemplateEngine;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by alex on 25.5.14.
 */
public class HomeController extends HttpServlet {
    private TemplateEngine templateEngine;

    @Override
    public void init() throws ServletException {
        super.init();
        templateEngine = TrainingApplication.getTemplateEngine();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        ServletContext servletContext = req.getServletContext();
        templateEngine.process("index", (org.thymeleaf.context.IContext) this.getServletContext());
    }
}
