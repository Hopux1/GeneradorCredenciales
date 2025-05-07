/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package credenciales;

/**
 *
 * @author hopu_
 */
public class Credencial implements Cloneable {
    private String nombre;
    private String rut;
    private String cargo;

    public Credencial(String nombre, String rut, String cargo) {
        this.nombre = nombre;
        this.rut = rut;
        this.cargo = cargo;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("RUT: " + rut);
        System.out.println("Cargo: " + cargo);
        System.out.println("--------------------------");
    }

    @Override
    public Credencial clone() {
        try {
            return (Credencial) super.clone(); // Deep copy básica
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // Setters para personalizar después de clonar
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setRut(String rut) { this.rut = rut; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}
