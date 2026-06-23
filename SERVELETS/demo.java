

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Demo() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Date d = new Date();
		int h = d.getHours();
		int m = d.getMinutes();
		String ms;
		String color;
		String textColor;
		if(h>=5 && h<12){
			ms = "Good Morning";
			color = "#FFD700";
			textColor= "white";
		}
		else if(h>=12 && h<16){
			ms = "Good Afternoon";
			color = "orange";
			textColor = "black";
		} else if(h>=16 && h<20) {
			ms = "Good Evening";
			color="lightblue";
			textColor= "black";
		} else {
			ms= "Good Night";
			color="midnightblue";
			textColor= "white";
		}
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Smart Landing page</title>");
		
		
		
		pw.println("<style>");
		pw.println("body{");
		pw.println("background-color:"+color+";");
		pw.println("color:"+textColor+";");
		pw.println("font-family: 'Segoe UI' 'Arial, sams-serif';");
		pw.println("display: flex;");
		pw.println("justify-content: center;");
		pw.println("align-items: center;");
		pw.println("text-align: center;");
		pw.println("margin:0");
		pw.println("</style>");
		pw.println("</head>");
		
		pw.println("<body>");
		pw.println("<div class='mood box'>");
		pw.println("<h1>"+ms+"</h1>");
		pw.println("<h2>The current time is "+ h + ":" + m+"</h2>");
		pw.println("</div>");
		pw.println("</body>");
		pw.println("</html>");
		
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
