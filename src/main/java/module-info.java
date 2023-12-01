module sample.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.sql;

    opens sample to javafx.fxml;
    exports sample;
    exports sample.controller;
    opens sample.controller to javafx.fxml;
}