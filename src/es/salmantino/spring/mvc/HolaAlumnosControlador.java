package es.salmantino.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaAlumnosControlador {

	@RequestMapping("/muestraFormulario")
	public String muestraFormulario()
	{
		//devuelve la página HolaAlumnosFormulario.jsp
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(){
		return "HolaAlumnosSpring";
	}
	
	@RequestMapping("/inicio")
	public String home(){
		return "paginaEjemplo";
	}
	
	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo)
	{
	String nombre=request.getParameter("nombreAlumno");
	nombre+=" es el mejor alumno";
	String mensajeFinal="¿Quién es el mejor alumno? "+nombre;
	modelo.addAttribute("mensajeClaro",mensajeFinal);
	return "HolaAlumnosSpring";
    }
}
