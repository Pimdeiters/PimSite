package Java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class main
 */
@WebServlet("/main")
public class main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}





//@paramatisedtest voor alle maanden of ze goed functioneren
//@paramatisedtest voor alle dagen per elke maand of ze goed functioneren
//@paramatisedtest voor alle pijlen in elke mogelijke opstelling

//domein klassendiagram
//doen alsof er meerdere huizen zijn
//polymorfise superclass en subclasses
//goed op beoordelingscriteria letten

//jQuery

//github token:                        als je moet inloggen is dit t ww
//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