/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jhonatan
 */
public class entrenador extends SeleccionFutbol {
 
   public entrenador(int id, int edad, String nombre, String apellidos) {
        super(id, nombre, apellidos,edad);
        }
    
    @Override
    public void jugarPartido() {
        System.out.println("Dirige un entrenamiento (Clase Entrenador)");
    }

    @Override
    public void entrenar() {
        System.out.println("Dirige un Partido (Clase Entrenador)");
    }
    
    public void planificarEntrenamiento() {
	System.out.println("Planifica un Entrenamiento");
	}
    
}
