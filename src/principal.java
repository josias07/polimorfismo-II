
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jhonatan
 */
public class principal {

    /**
     */
    
    // ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	
   public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
    
    public static void main(String[] args) {
       
       SeleccionFutbol cr7 = new futbolista(1, 30, "Cristiano Ronaldo", "POO");
       SeleccionFutbol joel = new entrenador(1, 25, "Joel", "Paredes Quinteros");
       SeleccionFutbol uchia = new masajista(1, 12, "Miller ", "Rojas Jaramillo");
       
       integrantes.add(cr7);
       integrantes.add(joel);
       integrantes.add(uchia);;

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
    
		for (SeleccionFutbol integrante : integrantes) {
		      System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
		      integrante.concentrarse();
		}

		// VIAJE
		System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for ( SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.viajar();
		}

		// ENTRENAMIENTO
		System.out.println("nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.entrenar();
		}

		// PARTIDO DE FUTBOL
		System.out.println("nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.jugarPartido();
		}

		// PLANIFICAR ENTRENAMIENTO
		System.out.println("nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
		System.out.print(cr7.getNombre() + " " + cr7.getApellidos() + " -> ");
		((entrenador) cr7).planificarEntrenamiento();

		// ENTREVISTA
		System.out.println("nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");
		System.out.print(joel.getNombre() + " " + joel.getApellidos() + " -> ");
		((futbolista) joel).entrevista();

		// MASAJE
		System.out.println("nMasaje: Solo el masajista tiene el método para dar un masaje:");
		System.out.print(uchia.getNombre() + " " + uchia.getApellidos() + " -> ");
		((masajista) uchia).darMasaje();

	}   
        
   
    
}
