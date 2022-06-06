package Java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Java.*; //import alle gemaakte classes

/**
 * Servlet implementation class main
 */
@WebServlet("/Verhuren")
public class Verhuren extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Verhuren() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.getWriter().append("Huis aanmaken:");
		
		PrintWriter writer = response.getWriter();
		
		String html = "<html>";
        html += "<form name=\"loginForm\" method=\"post\" action=\"Home\">";      
        html += "<center>";
        html += "Naam: <input type=\"text\" name=\"Naam\"/> <br/>";   
        html += "Email: <input type=\"text\" name=\"Email\"/> <br/>";
        html += "Tekst: <input type=\"text\" name=\"Tekst\"/> <br/>";
        html += "Plaatjes: <input type=\"text\" name=\"Plaatjes\"/> <br/>";
        html += "Aantalkamers: <input type=\"text\" name=\"Aantalkamers\"/> <br/>";
        html += "Locatie: <input type=\"text\" name=\"Locatie\"/> <br/>";
        html += "Prijs per week: <input type=\"text\" name=\"Prijspw\"/> <br/>";
        html += "Aantal verdiepingen: <input type=\"text\" name=\"Verdiepingen\"/> <br/>";
        html += "Zwembad ja of nee: <input type=\"text\" name=\"Zwembad\"/> <br/>";
        html += "<input type=\"submit\" value=\"Maak huis\" />";
        html += "</center>";
        html += "</form>";
        html += "</html>";
        
        writer.println(html);
        
        String Naam = request.getParameter("Naam");
        String Email = request.getParameter("Email");
        String Tekst = request.getParameter("Tekst");
        
        //Huis.MaakHuis(Naam, Email, Tekst, null, 0, null, 0, 0, false);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}





//jQuery

//github token:                        als je moet inloggen is dit t ww
//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