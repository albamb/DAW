/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 * Clase main que crea una cuenta y realiza operaciones con ella
 * @author Alba Martínez
 * @version 2.0
 */
public class Main {
    
    /**
     * Método main de la clase
     * @param args 
     */
    public static void main(String[] args) {
        operativa_cuenta(0.0);
    }
    
    /**
     * Método que opera con un objeto CCuenta
     * @param cantidad con la que queremos operar
     */
    private static void operativa_cuenta(Double cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.getEstado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    

 
}
