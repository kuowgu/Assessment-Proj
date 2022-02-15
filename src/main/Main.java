package main;

import dataAccess.JDBC;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/LoginView.fxml"));
        stage.setTitle("Login page");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }


    public static void main(String[] args) {

        Locale.setDefault(new Locale("fr"));

        ResourceBundle rb = ResourceBundle.getBundle("source/Nat", Locale.getDefault());
        System.out.println(rb.getString("hello"));

        JDBC.makeConnection();
        launch(args);
    }
}
