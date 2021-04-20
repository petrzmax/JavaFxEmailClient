module FirstJavaFX {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;
    requires java.desktop;

    opens com.barosanu.view;
    opens com.barosanu.controller;
    opens com.barosanu.model;
    opens com.barosanu to javafx.graphics;
}
