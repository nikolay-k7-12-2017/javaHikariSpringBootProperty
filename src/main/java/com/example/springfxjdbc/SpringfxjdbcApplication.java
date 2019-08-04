package com.example.springfxjdbc;


import formJavaFx.ControllerFx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import java.util.ResourceBundle;


@SpringBootApplication
@ComponentScan(value={"connectMsSql","formJavaFx","personTable","daoConnectData"} )
public class SpringfxjdbcApplication extends Application {

    private ConfigurableApplicationContext context;

    @Autowired
    private ControllerFx mainController;




    @Override
    public void init() throws Exception {
        context=SpringApplication.run(SpringfxjdbcApplication.class);

    }

    public static void main(String[] args) {
      //context=   SpringApplication.run(SpringfxjdbcApplication.class, args);
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        Parent parent = FXMLLoader.load(getClass().getResource("/formstart.fxml"));
        // добавили в таблицу 5 столбцов
   //    root.setPadding(new Insets(1));
      //  root.getChildren().add(this.tableView);
        primaryStage.setTitle("Spring Boot Hibernet");
        Scene scene= new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.show();


        ResourceBundle rb = ResourceBundle.getBundle("myresourse"); // application.properties
        System.out.println("key: "+rb.getString("myznach"));

        //System.out.println( context.getBean("dataSour"));

    }


    @Override
    public void stop() throws Exception {

        context.close();
    }



}
