module com.example.javafxmp3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxmp3 to javafx.fxml;
    exports com.example.javafxmp3;
}