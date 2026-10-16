module com.example.videojuegos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.videojuegos to javafx.fxml;
    exports com.example.videojuegos;
}