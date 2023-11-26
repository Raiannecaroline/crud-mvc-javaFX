module com.example.javafxcrud {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.javafxcrud to javafx.fxml;
    exports com.example.javafxcrud;
}