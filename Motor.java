// Archivo: Motor.java
public class Motor {
    private String tipo;
    private int potencia;
    
    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }
    
    public void encender() {
        System.out.println("Motor " + tipo + " encendido.");
    }
    
    public void apagar() {
        System.out.println("Motor " + tipo + " apagado.");
    }
    
    public void mostrarEspecificaciones() {
        System.out.println("Tipo de motor: " + tipo);
        System.out.println("Potencia: " + potencia + " HP");
    }
}