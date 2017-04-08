package br.cesjf.lppo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ListaRegistrosServelet", urlPatterns = {"/lista.html"})
public class ListaContatos extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListaRegistrosServelet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Listagem de Contatos:  </h1>");
            
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                out.println("<p> Driver encontrado</p>");
                String url = "jdbc:derby://localhost:1527//lppo-2017-1";  
                Connection conexao = DriverManager.getConnection(url, "usuario", "usuario");
                out.println("<p>Conexao aberta com sucesso</p>");
                
                String sql = "SELECT nome,sobrenome,telefone FROM contato";
                Statement operacao = conexao.createStatement();
                ResultSet resultado = operacao.executeQuery(sql);
                out.println( "<p>Consulta Realizada </p>");
                out.println( "<table border=2><tr>");
                out.println("<th>Nome:</th><th>Sobrenome</th><th>Telefone:</th></tr>");
                while(resultado.next()){
                    out.println("<tr><td>");
                    out.print(resultado.getString(1));
                    out.print("</td><td>");
                    out.print(resultado.getString(2));
                    out.print("</td><td>");
                    out.println(resultado.getString(3));
                    out.print("</td></tr>");
                }
                out.println( "</table>");
             
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ListaContatos.class.getName()).log(Level.SEVERE, null, ex);
                out.println("<h2> Driver não encontrado</h2>");
            } catch (SQLException ex) {
                Logger.getLogger(ListaContatos.class.getName()).log(Level.SEVERE, null, ex);
                out.println("<p>Erro ao acessar o banco</p>");
            }
            
            out.println("</body>");
            out.println("</html>");
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
