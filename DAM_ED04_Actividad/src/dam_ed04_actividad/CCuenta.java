/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 * Clase llamada CCuenta para realizar una serie de operaciones bancarias.
 * @author Alba Martínez
 * @version 2.0
 */
public class CCuenta {

    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /**
     * Método para crear un objeto CCuenta
     * @param nom nombre del titular
     * @param cue cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }


    /**
     * Método para ingresar dinero en la cuenta
     * @param cantidad a ingresar
     * @throws Exception si se introduce una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
   
    /**
     * Método para retirar dinero de la cuenta
     * @param cantidad a retirar
     * @throws Exception si es negrativa o no hay suficiente saldo en la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getEstado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * obtener cuenta
     * @return cuenta a través de getCuenta()
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }
    
    /**
     * obtener estado
     * @return saldo a través de getSaldo()
     */
    public double getEstado(){
        return getSaldo();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta la cuenta a asignar
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo el saldo a asignar
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres el tipoInteres a asignar
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

}
