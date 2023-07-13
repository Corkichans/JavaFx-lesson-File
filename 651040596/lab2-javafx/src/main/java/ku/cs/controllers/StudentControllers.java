package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Student;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class StudentControllers {
    @FXML
    Label nameLabel;
    @FXML
    Label idLabel;
    @FXML
    Label scoreLabel;


    @FXML
    public void initialize() {
        Student student = new Student("6410400001", "Tony Stark");
        showStudent(student);
    }

    public static void configRoute()
    {
        String viewPath = "ku/cs/views/";
        FXRouter.when("hello", viewPath + "hello-view.fxml");
    }
    private void showStudent(Student student) {
        nameLabel.setText(student.getName());
        idLabel.setText(student.getId());
        scoreLabel.setText(""+ student.getScore());
    }


    public void onGogoButtonClick()  {
        try {
            FXRouter.goTo("hello");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}