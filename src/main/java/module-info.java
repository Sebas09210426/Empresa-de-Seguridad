module java {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens app to javafx.fxml;
    exports app;

    opens controller to javafx.fxml;
    exports controller to javafx.graphics;

    opens model to javafx.fxml;
    exports model;

    opens viewController to javafx.fxml;
    exports viewController to javafx.graphics;
}