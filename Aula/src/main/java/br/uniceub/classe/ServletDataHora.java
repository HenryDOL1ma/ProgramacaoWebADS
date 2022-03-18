package br.uniceub.classe;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDataHora
 */
@WebServlet("/ServletDataHora")
public class ServletDataHora extends HttpServlet {
	private static final long serialVersionUID = 1L;
      // HttpServlet � a classe pai, onde a classe filho herda os m�todos 
	
    
    private SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
    
	@Override
	public void init() throws ServletException {
		log("A servlet iniciou em: " + formataData.format(new Date()));
		super.init();
		
	}
	
		// ctrl + space e come�a a digitar o nome do m�todo
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter saida = resp.getWriter();
		saida.write("<HTML><BODY>Ol�! ");
		saida.write("A data e hora atual �: "+ formataData.format(new Date()));
		saida.write("</BODY></HTML>");
		saida.close();
	}
	
	@Override
	public void destroy() {
		log("A servlet iniciou em: " + formataData.format(new Date()));
		super.destroy();
	}
}
