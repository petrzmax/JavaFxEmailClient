package com.barosanu.controller;

import com.barosanu.EmailManager;
import com.barosanu.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.HTMLEditor;

public class ComposeMessageController extends BaseController {


    public class ComposeMessageWindow {

        @FXML
        private TextField subjectTextField;

        @FXML
        private TextField recipientTextField;

        @FXML
        private HTMLEditor htmlEditor;

        @FXML
        private Label errorLabel;

        @FXML
        void sendButtonAction() {
            System.out.println("TEST WYSYLANKA");
        }

    }


    public ComposeMessageController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }
}
