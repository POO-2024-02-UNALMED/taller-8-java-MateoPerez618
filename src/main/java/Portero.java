package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
    
	@Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public int compareTo(Futbolista otro) {
        if (otro instanceof Portero) {
            // Si el otro objeto es un Portero, comparamos los goles
            Portero otroPortero = (Portero) otro;
            return Math.abs(this.golesRecibidos - otroPortero.golesRecibidos);
        }
        
        // Si no es un Portero, comparamos la edad (como lo hace Futbolista)
        return super.compareTo(otro);
    }
    
    @Override
    public String toString() {
    	 return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + 
                 ", y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal + 
                 ". Le han marcado " + this.golesRecibidos + ".";
    }

}
