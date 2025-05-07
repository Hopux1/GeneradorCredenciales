/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package credenciales;

import java.util.ArrayList;

/**
 *
 * @author hopu_
 */
public class GestorCredenciales {
    private static GestorCredenciales instancia;
    private ArrayList<Credencial> listaCredenciales;

    private GestorCredenciales() {
        listaCredenciales = new ArrayList<>();
    }

    public static GestorCredenciales getInstancia() {
        if (instancia == null) {
            instancia = new GestorCredenciales();
        }
        return instancia;
    }

    public void agregarCredencial(Credencial c) {
        listaCredenciales.add(c);
    }

    public void mostrarCredenciales() {
        if (listaCredenciales.isEmpty()) {
            System.out.println("No hay credenciales registradas.");
        } else {
            for (Credencial c : listaCredenciales) {
                c.mostrar();
            }
        }
    }
}
