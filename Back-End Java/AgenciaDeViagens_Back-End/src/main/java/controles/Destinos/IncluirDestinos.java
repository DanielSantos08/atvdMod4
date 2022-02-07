package controles.Destinos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.persistencia.DAODestinos;
import modelo.pessoal.Destinos;

/**
 * Servlet implementation class IncluirDestinos
 */
@WebServlet("/IncluirDestinos")
public class IncluirDestinos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncluirDestinos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher despacho = null;
		
		try {
		
			DAODestinos daoDestinos = new DAODestinos();
		
			Destinos destinos = new Destinos();
			destinos.setCidade(request.getParameter("txtCidade"));
			destinos.setEstado(request.getParameter("txtEstado"));
			destinos.setPaís(request.getParameter("txtPaís"));
			destinos.setValor(request.getParameter("txtValor"));
			
			
			daoDestinos.incluir(destinos);
		
			despacho = request.getRequestDispatcher("sucesso.jsp");
			despacho.forward(request, response);
		
		}catch (Exception e) {
			e.printStackTrace();
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
