module registrationformfxml {
	opens example to javafx.graphics, javafx.fxml;
	exports example;
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
}
