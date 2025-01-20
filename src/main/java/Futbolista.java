package futbol;

public abstract class Futbolista implements Comparable<Futbolista> {
	
	private String nombre;
	private int edad;
	private String posicion; 
	
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    
    public Futbolista() {
    	this("Maradona", 30, "delantero");
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public int compareTo(Futbolista otro) {
        return Math.abs(this.getEdad() - otro.getEdad());
    }
    
    public boolean equals(Futbolista f) {
        if (this == f) return true;
        if (f == null) return false;
        return this.nombre.equals(f.nombre) && this.edad == f.edad && this.posicion.equals(f.posicion);
    }
    
    public abstract boolean jugarConLasManos();
    
    @Override
    public String toString() {
        return "El futbolista" + nombre +
               "tiene" + edad +
               "y juega de" + posicion;
    }

}

