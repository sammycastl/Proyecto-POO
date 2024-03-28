
package com.mycompany.proyectopoodenuncia;

public class Usuario {
    private String nombre;
    private String contraseña;

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    // Método para validar las credenciales del usuario
    public boolean validarCredenciales(String nombre, String contraseña) {
        return this.nombre.equals(nombre) && this.contraseña.equals(contraseña);
    }

    // Método para cambiar la contraseña del usuario
    public void cambiarContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
