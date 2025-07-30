package com.curso.modelo.negocio;

import java.util.List;
import java.util.Vector;

import com.curso.modelo.entidad.Genero;
import org.springframework.stereotype.Service;

import com.curso.modelo.entidad.Pelicula;

@Service
public class ServicioPeliculas {

	private static List<Pelicula> peliculas;

	static{
		peliculas = new Vector<>();
		peliculas.add(new Pelicula(1,"2001","Stanley Kubrik", Genero.SCIFI,1968));
		peliculas.add(new Pelicula(2,"Alien","Ridley Scott",Genero.SCIFI,1979));
		peliculas.add(new Pelicula(3,"Die Hard","John McTiernan",Genero.ACCIÓN,1988));
		peliculas.add(new Pelicula(4,"Young Frankenstein","Mel Brooks",Genero.COMEDIA,1974));
		peliculas.add(new Pelicula(5,"Moon","Duncan Jones",Genero.TERROR,2009));
		peliculas.add(new Pelicula(6,"El bueno, el feo y el malo","Sergio Leone",Genero.AVENTURAS,1968));
	}

	public void insertarPelicula(Pelicula pelicula){
		System.out.println("Insertando la pelicula:"+pelicula.getTitulo());
		pelicula.setId(peliculas.size()+1);
		peliculas.add(pelicula);
	}
	public void eliminarPelicula(Pelicula pelicula){
		System.out.println("Eliminando la película: " + pelicula.getTitulo());
		List<Pelicula> nuevaLista = new Vector<>();
		for(Pelicula p: peliculas){
			if (p.getId() != pelicula.getId() ) {
				nuevaLista.add(p);
			}
		}
		peliculas = nuevaLista;
	}

	public void modificarPelicula(Pelicula pelicula){
		System.out.println("Modificando la película con id:"+pelicula.getId());
		List<Pelicula> nuevaLista = new Vector<>();
		for(Pelicula p: peliculas){
			if(p.getId() == pelicula.getId()){
				nuevaLista.add(pelicula);
			}else {
				nuevaLista.add(p);

			}
		}
		peliculas = nuevaLista;
	}

	public List<Pelicula> listarPeliculas(){
		return peliculas;
	}

	public Pelicula buscarPelicula(Integer id){
		return peliculas.get(id-1);
	}


}
