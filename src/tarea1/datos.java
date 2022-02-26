/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1;

/**
 *
 * @author aidao
 */
public class datos {
    
    private String nombre; 
    private String carne; 

    datos( String nombre, String carne){
        this.nombre = "alejandra"; 
        this.carne = "202100239";
       
    } 

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getCarne() {
        return carne;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setCarne(String apellido) {
        this.carne = apellido;
    }

    
    
}
