module com.example.carslist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.carslist to javafx.fxml;
    exports com.example.carslist;
}