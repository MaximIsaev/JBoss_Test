package com.main_servlet;

import com.json_news_item.JsonConverter;
import com.json_news_item.JSONContainer;
import com.news_item.FillNews;
import com.news_item.News;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.xml_parser.XMLParser;
import org.json.*;


public class NewsServlet extends HttpServlet {
//    File file = new File("D:/Tomcat/rss.builder.feedrss.builder.xml");
    ServletConfig conf;


    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");


        XMLParser.parser();

        PrintWriter out = resp.getWriter();
        out.println("Deploy is working from IDEA on Tomcat ");

        out.println();
       // JSONContainer.displayJsonObjects(out);

    }

    @Override
    public void init(ServletConfig config) throws ServletException{
        System.out.println("Init called");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);

    }
}
