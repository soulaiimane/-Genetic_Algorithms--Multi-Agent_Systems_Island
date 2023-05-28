module ma.enset.paralleldistributed_genetic_algorithm {
    requires javafx.controls;
    requires javafx.fxml;
    requires jade;


    opens ma.enset.paralleldistributed_genetic_algorithm to javafx.fxml;
    exports ma.enset.paralleldistributed_genetic_algorithm;
}