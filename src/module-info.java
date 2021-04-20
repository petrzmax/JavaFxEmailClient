module FirstJavaFX {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;
    requires java.desktop;

    opens com.petrzmax.view;
    opens com.petrzmax.controller;
    opens com.petrzmax.model;
    opens com.petrzmax to javafx.graphics;
}
