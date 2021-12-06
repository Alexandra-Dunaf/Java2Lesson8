module com.example.java2lesson8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java2lesson8 to javafx.fxml;
    exports com.example.java2lesson8;
}