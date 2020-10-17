/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
public class NomeServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<h1>getParameter</h1>");
            out.println("<h3>Usando request.getParameter(\"nome\"): " + request.getParameter("nome") + "</h3>");
            out.println("<h3>Usando request.getParameter(\"telefone\"): " + request.getParameter("telefone") + "</h3>");
            out.println("<h3>Usando request.getParameter(\"email\"): " + request.getParameter("email") + "</h3>");
            out.println("<h3>Usando request.getParameter(\"estado\"): " + request.getParameter("estado") + "</h3>");
            
            out.println("<h1>getParameterNames</h1>");
            
            Enumeration<String> retornoGetParameterNames = request.getParameterNames();
            
            while(retornoGetParameterNames.hasMoreElements()){
                out.println("<h3>"+ retornoGetParameterNames.nextElement() + "</h3>");
            }            
            
            
            out.println("<h1>getParameterValues</h1>");
            
            String retornoGetParameterValues[] = request.getParameterValues("nome");
            
            for(String valores: retornoGetParameterValues)
                out.println("<h3> Usantos getParameterValues: "+valores+"</h3>");

            retornoGetParameterValues = request.getParameterValues("telefone");
            
            for(String valores: retornoGetParameterValues)
                out.println("<h3> Usantos getParameterValues: "+valores+"</h3>");

            retornoGetParameterValues = request.getParameterValues("email");
            
            for(String valores: retornoGetParameterValues)
                out.println("<h3> Usantos getParameterValues: "+valores+"</h3>");

            retornoGetParameterValues = request.getParameterValues("senha");
            
            for(String valores: retornoGetParameterValues)
                out.println("<h3> Usantos getParameterValues: "+valores+"</h3>");
            
            retornoGetParameterValues = request.getParameterValues("estado");
            
            for(String valores: retornoGetParameterValues)
                out.println("<h3> Usantos getParameterValues: "+valores+"</h3>");
            
            out.println("<h1>getParameterMap</h1>");
            
            Map<String, String[]> retornoGetParameterMap = request.getParameterMap();
            Set conjunto = retornoGetParameterMap.entrySet();
            Iterator indice = conjunto.iterator();
            
            while(indice.hasNext()){
                Map.Entry<String,String[]> dados = (Map.Entry<String,String[]>)indice.next();
                for(String valor: dados.getValue())
                    out.println("<h3>Campo: " + dados.getKey() + " Valor informado pelo usu&aacute;rio: " + valor + "</h3>");
            }
            
            
            

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
