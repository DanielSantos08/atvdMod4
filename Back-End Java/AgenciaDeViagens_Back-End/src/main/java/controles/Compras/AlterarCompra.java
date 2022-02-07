package controles.Compras;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.persistencia.DAOCompras;
import modelo.persistencia.DAODestinos;
import modelo.pessoal.Compras;
import modelo.pessoal.Destinos;

/**
 * Servlet implementation class AlterarCompra
 */
@WebServlet("/AlterarCompra")
public class AlterarCompra extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarCompra() {
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
		compras.setFk_IdCli(request.getParameter("txtIdClienteCompra"));
		compras.setFk_IdDes(request.getParameter("txtIdDestinosCompra"));
		compras.setFormaPagamento(request.getParameter("txtPagamento"));
		compras.setData(request.getParameter("txtData"));
		
		

		daoCompras.alterar(compras);
		
		despacho = request.getRequestDispatcher("sucesso.jsp");
		
		}catch (Exception e) {
			e.printStackTrace();
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
