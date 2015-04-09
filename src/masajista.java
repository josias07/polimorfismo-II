/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jhonatan
 */
public class masajista extends SeleccionFutbol{
      

    public masajista(int id, int edad, String nombre, String apellidos) {
    super(id, nombre, apellidos,edad);
    
     }
     

    @Override
    public void entrenar() {
        System.out.println("Toma asistencia en el entrenamiento (Clase Masajista)");
    }
    
    public void darMasaje() {
	System.out.println("Da un Masaje");
	}
    
}
