
package com.mycompany.proyectopoodenuncia;

import java.util.ArrayList;
import java.util.List;

public class agregarDelito {

    private List<String> listaDelitos = new ArrayList<>();

    public agregarDelito(crearExpediente expediente) {
        agregarDelito(expediente.getDelito());
        agregarDenunciado(expediente.getDenunciado());
    }

    public void agregarDenunciado(String nombre) {
        listaDelitos.add(nombre);
    }

    public void agregarDelito(String delito) {
        listaDelitos.add(delito);
    }

    public void imprimirDelitos() {
        System.out.println("Lista de Delitos:");
        for (String delito : listaDelitos) {
            System.out.println("- " + delito);
        }
    }
}