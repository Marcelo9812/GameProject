package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static ArrayList<Element> elementsList = new ArrayList<>();


    @Override
    public void start(Stage stage) throws IOException {

        Gson gson = new Gson();
        try (Reader reader = new FileReader("PeriodicTableJSON.json")) {

            // Convert JSON File to Java Object
            Type userListType = new TypeToken<ArrayList<Element>>(){}.getType();

           elementsList = gson.fromJson(reader, userListType);


        } catch (IOException e) {
            e.printStackTrace();
        }

        scene = new Scene(loadFXML("LoginScreen"));
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}