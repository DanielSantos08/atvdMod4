package controles.clientes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.persistencia.DAOCliente;
import modelo.pessoal.Cliente;

/**
 * Servlet implementation class AlterarClienteEmail
 */
@WebServlet("/AlterarClienteEmail")
public class AlterarClienteEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarClienteEmail() {
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
		cliente.setEmail(request.getParameter("txtEmail"));
		cliente.setCPF(request.getParameter("txtCPF"));
		
		

		daoCliente.alterarEmail(cliente);
		
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
