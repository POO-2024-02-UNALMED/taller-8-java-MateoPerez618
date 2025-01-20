package futbol;

public abstract class Futbolista implements Comparable{
    
    private String nombre;
    private int edad;
    private String posicion;
    
    // Constructor con parámetros
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    
    // Constructor por defecto
    public Futbolista() {
        this("Maradona", 30, "delantero");
    }
    
    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    // Métodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Futbolista f = (Futbolista) obj;
        return nombre.equals(f.nombre) && edad == f.edad && posicion.equals(f.posicion);
    }

    // Método abstracto
    public abstract boolean jugarConLasManos();

    // Método toString
    @Override
    public String toString() {
        return "El futbolista " + nombre +
               " tiene " + edad +
               ", y juega de " + posicion;
    }
}
