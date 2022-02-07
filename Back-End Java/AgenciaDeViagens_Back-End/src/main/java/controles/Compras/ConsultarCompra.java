package controles.Compras;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.persistencia.DAOCliente;
import modelo.persistencia.DAODestinos;
import modelo.pessoal.Cliente;
import modelo.pessoal.Destinos;

/**
 * Servlet implementation class ConsultarCompra
 */
@WebServlet("/ConsultarCompra")
public class ConsultarCompra extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultarCompra() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher despacho = null;
		
		try {
		
		DAOCliente daoCliente = new DAOCliente();
		
		Cliente cliente = new Cliente();
	
		cliente.setPassword(request.getParameter("txtSenha"));

		 cliente = daoCliente.consultar(cliente);
		 
		 request.setAttribute("cli", cliente);
		 
		 DAODestinos daoDestinos = new DAODestinos();
			
		 Destinos destinos = new Destinos();
		
		 destinos.setCidade(request.getParameter("txtCidade"));

		 destinos = daoDestinos.consultar(destinos);
			 
		 request.setAttribute("des", destinos);
		
		despacho = request.getRequestDispatcher("IncluirCompra.jsp");
		
		}catch (Exception e) {
			despacho = request.getRequestDispatcher("erro.jsp");
		}
		finally {
			despacho.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
