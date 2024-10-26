module org.guivic.appconversor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.guivic.appconversor to javafx.fxml;
    exports org.guivic.appconversor;
}