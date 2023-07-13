module fx.application.lab2javafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens ku.cs.lab2javafx to javafx.fxml;
    exports ku.cs.lab2javafx;
    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;
}