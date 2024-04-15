package com.mycompany.proyectopoodenuncia;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FX extends Application {

    private ProyectoPOODenuncia proyecto;

    @Override
    public void start(Stage primaryStage) {
        // Inicializar el proyecto
        proyecto = new ProyectoPOODenuncia();

        // Crear etiqueta con el mensaje de bienvenida
        Label label = new Label("¡Bienvenido al sistema de denuncias!");

        // Crear botones para acciones
        Button btnCrearDenuncia = new Button("Crear Denuncia");
        Button btnListarDenuncias = new Button("Listar Denuncias");
        Button btnSalir = new Button("Salir");

        // Manejar eventos de los botones
        btnCrearDenuncia.setOnAction(e -> proyecto.crearDenuncia());
        btnListarDenuncias.setOnAction(e -> proyecto.listarDenuncias());
        btnSalir.setOnAction(e -> primaryStage.close());

        // Alinear los botones horizontalmente
        HBox hbox = new HBox(10, btnCrearDenuncia, btnListarDenuncias, btnSalir);
        hbox.setPadding(new Insets(10));

        // Crear contenedor VBox y agregar elementos
        VBox root = new VBox(label, hbox);
        root.setSpacing(10);
        root.setPadding(new Insets(10));

        // Crear la escena y agregar el contenedor VBox
        Scene scene = new Scene(root, 400, 200);

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
