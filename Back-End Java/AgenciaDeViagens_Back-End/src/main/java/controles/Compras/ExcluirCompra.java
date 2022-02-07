package controles.Compras;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.persistencia.DAOCliente;
import modelo.persistencia.DAOCompras;
import modelo.pessoal.Cliente;
import modelo.pessoal.Compras;

/**
 * Servlet implementation class ExcluirCompra
 */
@WebServlet("/ExcluirCompra")
public class ExcluirCompra extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExcluirCompra() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
RequestDispatcher despacho = null;
		
		try {
		
		DAOCompras daoCompras = new DAOCompras();
		
		Compras compras = new Compras();
		compras.setVariaveldeConversaoIdCompra(request.getParameter("txtIdCompra"));
		
		daoCompras.excluir(compras);
		
		despacho = request.getRequestDispatcher("sucesso.jsp");
		
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
