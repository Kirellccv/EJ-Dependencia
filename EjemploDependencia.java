// Archivo: EjemploDependencia.java
public class EjemploDependencia {
    public static void main(String[] args) {
        System.out.println("=== EJEMPLO DE DEPENDENCIA EN JAVA ===");
        
        // Crear el objeto Motor
        Motor motorV8 = new Motor("V8", 350);
        
        // Crear el objeto Automovil que depende de Motor
        Automovil coche = new Automovil("Ford", "Mustang", motorV8);
        
        // Mostrar información del automóvil
        System.out.println("\nInformacion del automovil:");
        coche.mostrarInformacion();
        
        // Usar métodos que internamente usan la dependencia
        System.out.println("\nOperaciones del automovil:");
        coche.arrancar();
        coche.detener();
        
        System.out.println("\n-----------------------");
        
        // Crear otro motor y otro automóvil para demostrar la reutilización
        Motor motorElectrico = new Motor("Electrico", 300);
        Automovil cocheElectrico = new Automovil("Tesla", "Model S", motorElectrico);
        
        System.out.println("\nInformacion del automovil electrico:");
        cocheElectrico.mostrarInformacion();
        cocheElectrico.arrancar();
    }
}