package com.mycompany.proyectopoodenuncia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Llamar al método existente de tu clase ProyectoPOODenuncia
        ProyectoPOODenuncia proyecto = new ProyectoPOODenuncia();
        proyecto.iniciarAplicacion();

        // Crear una etiqueta con el mensaje de bienvenida
        Label label = new Label("¡Bienvenido al sistema de denuncias!");

        // Crear un contenedor VBox y agregar la etiqueta
        VBox root = new VBox(label);

        // Crear la escena y agregar el contenedor VBox
        Scene scene = new Scene(root, 400, 300);

        // Establecer la escena en la ventana principal
        primaryStage.setScene(scene);

        // Establecer el título de la ventana
        primaryStage.setTitle("Sistema de Denuncias");

        // Mostrar la ventana
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
