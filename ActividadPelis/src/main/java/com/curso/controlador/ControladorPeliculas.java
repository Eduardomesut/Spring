package com.curso.controlador;

import java.util.List;

import com.curso.modelo.entidad.Genero;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.curso.modelo.entidad.Pelicula;
import com.curso.modelo.negocio.ServicioPeliculas;

@Controller
public class ControladorPeliculas {

	private ServicioPeliculas servicioPeliculas;


	//PROBAR ASPECTOS

	//PROBARLO CON BASE DE DATOS H2



	public ControladorPeliculas(ServicioPeliculas servicioPeliculas) {
		super();
		this.servicioPeliculas = servicioPeliculas;
	}

	@GetMapping(path = "/listadoPeliculas")
	public ModelAndView verListadoPeliculas() {
		System.out.println("ControladorPeliculas.verListadoPeliculas");
		ModelAndView mav = new ModelAndView("listadoPeliculas");
		List<Pelicula> peliculas = servicioPeliculas.listarPeliculas();
		mav.addObject("peliculas", peliculas);
		return mav;
	}

	@GetMapping(path = "/formularioPeliculas")
	public ModelAndView verFormularioPeliculas() {
		return new ModelAndView("formularioPeliculas")
			.addObject("pelicula", new Pelicula())
				.addObject("generos", Genero.values());

	}

	@PostMapping("/seleccionarPelicula/modificarPelicula/{id}")
	public String modificarPelicula(@ModelAttribute("pelicula") Pelicula pelicula, @PathVariable("id") Integer idPelicula) {

		//servicioPeliculas.insertarPelicula(pelicula);
		servicioPeliculas.modificarPelicula(pelicula);
		return "redirect:/mvc/listadoPeliculas";
	}

	@GetMapping(path = "/seleccionarPelicula/{id}")
	public ModelAndView seleccionarPelicula(@PathVariable("id") Integer idPelicula) { 
		Pelicula pSel = servicioPeliculas.buscarPelicula(idPelicula);
		return new ModelAndView("formularioPeliculas")
			.addObject("pelicula", pSel)
				.addObject("generos", Genero.values());

	}

	//Tambien podemos escribir el método así
	@PostMapping("/insertarPelicula")
	public String insertarPelicula(@ModelAttribute("pelicula") Pelicula pelicula) {
		servicioPeliculas.insertarPelicula(pelicula);
		return "redirect:/mvc/listadoPeliculas";
	}

	@PostMapping("/seleccionarPelicula/borrarPelicula/{id}")
	public String borrarPelicula(@ModelAttribute("pelicula") Pelicula pelicula, @PathVariable("id") Integer idPelicula) {
		System.out.println("Borrando pelicula con id:"+idPelicula);
		//servicioPeliculas.modificarPelicula(pelicula);
		servicioPeliculas.eliminarPelicula(pelicula);
		return "redirect:/mvc/listadoPeliculas";
	}
	
}

