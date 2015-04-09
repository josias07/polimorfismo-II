/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jhonatan
 */
public class futbolista  extends SeleccionFutbol {
    
  public futbolista(int id, int edad, String nombre, String apellidos) {
        super(id, nombre, apellidos,edad);
        }
     
    @Override
    public void jugarPartido() {
        System.out.println("Realiza un entrenamiento (Clase Futbolista)");
    }

    @Override
    public void entrenar() {
        System.out.println("Juega un Partido (Clase Futbolista)");
    }
    public void entrevista() {
	System.out.println("Da una Entrevista");
	}
    
    
    
}
