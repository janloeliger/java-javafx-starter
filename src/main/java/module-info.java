module ch.project.name {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.project.name to javafx.fxml;
    exports ch.project.name;
}