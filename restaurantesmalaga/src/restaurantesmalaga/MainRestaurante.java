package restaurantesmalaga;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainRestaurante {
	private static final  String RUTA_FICHERO = "restaurantes.txt";
	
	public static List<Restaurante> cargarRestaurante (List<String> lineas){
		List<Restaurante> lRestaurantes = null;
		int numeroLineas = 0;
		Restaurante restauranteAux = null;//El restaurante en curso
		lRestaurantes = new ArrayList<>(); 
		
		for (String linea : lineas) {
			numeroLineas = numeroLineas + 1;
			switch (numeroLineas) {
			case 1:restauranteAux.setNombre(linea);break; 
			case 2:restauranteAux.setDireccion(linea);break; 
			case 3:restauranteAux.setWeB(linea);break;
			case 4:restauranteAux.setFichaGoogle(linea);break;
			case 5:restauranteAux.setLatitud(Float.parseFloat(linea));break;
			case 6:restauranteAux.setLongitud(Float.parseFloat(linea));break;
			case 7:restauranteAux.setBarrio(linea);break;
			case 8:
				String[] especialidades = linea.split(",");//Troceo esp1,esp2,esp3
				List<String> lespecialidades = Array.asList(especialidades);
				restauranteAux.setEspacialidades();
				lRestaurantes.add(restauranteAux);
				
				numlinea = 0;
				restauranteAux = new Restaurante;
				break;
			}
	
			}
		}
		
		return lRestaurantes;
	}
	public static void main(String[] args) throws IOException {
		//TODO Cargar la lista de restaurantes del fichero
		File file = new File(RUTA_FICHERO);
		if (file.exists()) {
			
			System.out.println("FICHERO EXISTE !, A PARSEARLO");
			Path path = file.toPath();//convierto a Path para usar el nuevo API y a
			List<String> lineas = Files.readAllLines(path);//leo todo el fichero en 
			List<Restaurante> listRead 
			for (String linea : lineas) {
				System.out.println(linea);
				
			}
		}
		else {
			System.out.println("NO EXISTE el fichero para esa ruta : (");
		}
	}
}
