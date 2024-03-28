
package com.mycompany.proyectopoodenuncia;

import java.util.ArrayList;
import java.util.List;

public class Denuncia {
    private String lugar;
    private String detalles;
    private List<String> delitos;
    private Persona denunciante;
    private Persona ofendido;
    private Persona denunciado;
    private List<Persona> testigos;
    private List<String> pruebas;

    public Denuncia(String lugar, String detalles) {
        this.lugar = lugar;
        this.detalles = detalles;
        this.delitos = new ArrayList<>();
        this.testigos = new ArrayList<>();
        this.pruebas = new ArrayList<>();
    }

    // Método para agregar un delito a la denuncia
    public void agregarDelito(String delito) {
        this.delitos.add(delito);
    }

    // Método para agregar un testigo a la denuncia
    public void agregarTestigo(Persona testigo) {
        this.testigos.add(testigo);
    }

    // Método para agregar una prueba a la denuncia
    public void agregarPrueba(String prueba) {
        this.pruebas.add(prueba);
    }

    // Método para mostrar información sobre la denuncia
    public void mostrarInformacion() {
        System.out.println("Lugar: " + lugar);
        System.out.println("Detalles: " + detalles);
        System.out.println("Delitos: " + delitos);
        System.out.println("Denunciante: " + denunciante.getNombre());
        System.out.println("Ofendido: " + ofendido.getNombre());
        System.out.println("Denunciado: " + (denunciado != null ? denunciado.getNombre() : "N/A"));
        System.out.println("Testigos: " + testigos);
        System.out.println("Pruebas: " + pruebas);
    }

    // Getters y setters
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public List<String> getDelitos() {
        return delitos;
    }

    public void setDelitos(List<String> delitos) {
        this.delitos = delitos;
    }

    public Persona getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(Persona denunciante) {
        this.denunciante = denunciante;
    }

    public Persona getOfendido() {
        return ofendido;
    }

    public void setOfendido(Persona ofendido) {
        this.ofendido = ofendido;
    }

    public Persona getDenunciado() {
        return denunciado;
    }

    public void setDenunciado(Persona denunciado) {
        this.denunciado = denunciado;
    }

    public List<Persona> getTestigos() {
        return testigos;
    }

    public void setTestigos(List<Persona> testigos) {
        this.testigos = testigos;
    }

    public List<String> getPruebas() {
        return pruebas;
    }

    public void setPruebas(List<String> pruebas) {
        this.pruebas = pruebas;
    }

    
}
