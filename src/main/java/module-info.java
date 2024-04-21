module com.example.bookhaven0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bookhaven0 to javafx.fxml;
    exports com.example.bookhaven0;
}