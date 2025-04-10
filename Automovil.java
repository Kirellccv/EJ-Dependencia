// Archivo: Automovil.java
public class Automovil {
    private String marca;
    private String modelo;
    // Dependencia: Automovil depende de Motor
    private Motor motor;
    
    public Automovil(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;  // Inyección de dependencia por constructor
    }
    
    public void arrancar() {
        System.out.println("Arrancando " + marca + " " + modelo);
        // Usa el método del objeto dependiente
        motor.encender();
    }
    
    public void detener() {
        System.out.println("Deteniendo " + marca + " " + modelo);
        // Usa el método del objeto dependiente
        motor.apagar();
    }
    
    public void mostrarInformacion() {
        System.out.println("Automovil: " + marca + " " + modelo);
        System.out.println("Especificaciones del motor:");
        // Llama al método del objeto dependiente
        motor.mostrarEspecificaciones();
    }
}