/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jhonatan
 */
public abstract  class  SeleccionFutbol  implements  IntegranteSeleccionFutbol {
    
        protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
      
        //  Getter And Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        //IMPLEMENTAMOS LA CLASE PADRE 
    
    public void concentrarse() {
		System.out.println("Se Concentra (Clase Padre)");
	}

	public void viajar() {
		System.out.println("Viaja (Clase Padre)");
	}
	
	public void entrenar() {
		System.out.println("Entrena (Clase Padre)");
	}

	public void jugarPartido() {
		System.out.println("Asiste al Partido de Fútbol (Clase Padre)");
	}
    
}
