package project3Testbed;

import project3Testbed.ExcelSheet;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;


/**
 * <p> Title: UserInterface Class. </p>	
 * 
 * <p> Description: The Java/FX-based user interface for the calculator. The class works with String
 * objects and passes work to other classes to deal with all other aspects of the computation.</p>
 * 
 * <p> Copyright: Lynn Robert Carter © 2017 </p>
 * 
 * @author Lynn Robert Carter
 *         Yashul Aggarwal
 *         Praik Singh
 * 
 * @version 4.30	2018-03-17 The JavaFX-based GUI for the implementation of a Double Calculator with Error Term
 * 
 */

public class UserInterface {
	
	/**********************************************************************************************

	Attributes
	
	**********************************************************************************************/
	
	/* Constants used to parameterize the graphical user interface.  We do not use a layout manager for
	   this application. Rather we manually control the location of each graphical element for exact
	   control of the look and feel. */
	private final double BUTTON_WIDTH = 60;
	private final double BUTTON_OFFSET = BUTTON_WIDTH/2;

	// These are the application values required by the user interface
	private Label label_ExcelSheetAnalysis = new Label("Excel Analysis");		// Label to display the name of the program
	private TextField text_ExcelSheet = new TextField();					// The text field for first operand
	private Label label_SourceDirectory = new Label("Source Directory");			// Label for second operand
	private Button button_Report = new Button("Generate Analysis Report");				// The add symbol: \u002b
	private Button button_Browse = new Button("browse");				// The subtract symbol: \u2212
	private Button button_Quit = new Button("Quit");				// The multiply symbol: \u00D7

	private double buttonSpace;		// This is the white space between the operator buttons.

public UserInterface(Pane theRoot) {
	// There are five gaps. Compute the button space accordingly.
			buttonSpace = ExcelSheet.WINDOW_WIDTH / 5;
	
	// Label theScene with the name of the calculator, centered at the top of the pane
	setupLabelUI(label_ExcelSheetAnalysis, "Arial", 24,10, Pos.CENTER, 300, 10);
	
	// Label the first operand just above it, left aligned
	setupLabelUI(label_SourceDirectory, "Arial", 18, 10, Pos.BASELINE_LEFT, 10, 45);
	
	setupTextUI(text_ExcelSheet, "Arial", 18, 350, Pos.BASELINE_LEFT, 150, 40, true);
	
	setupButtonUI(button_Report, "Symbol", 15, BUTTON_WIDTH, Pos.BASELINE_LEFT, 0.5 * buttonSpace-BUTTON_OFFSET, 350);
	button_Report.setOnAction((event) -> { analysisReport();});
	
	setupButtonUI(button_Browse, "Symbol", 15, BUTTON_WIDTH, Pos.BASELINE_LEFT, 4 * buttonSpace-BUTTON_OFFSET, 40);
	button_Browse.setOnAction((event) -> { browse();});
	
	setupButtonUI(button_Quit, "Symbol", 15, BUTTON_WIDTH, Pos.BASELINE_LEFT, 4.5 * buttonSpace-BUTTON_OFFSET, 350);
	button_Quit.setOnAction((event) -> { exit();});

theRoot.getChildren().addAll(label_ExcelSheetAnalysis, label_SourceDirectory, text_ExcelSheet, button_Report, 
		button_Browse, button_Quit);
}

/**********
 * Private local method to initialize the standard fields for a label
 */
private void setupLabelUI(Label l, String ff, double f, double w, Pos p, double x, double y){
	l.setFont(Font.font(ff, f));
	l.setMinWidth(w);
	l.setAlignment(p);
	l.setLayoutX(x);
	l.setLayoutY(y);		
}

/**********
 * Private local method to initialize the standard fields for a text field
 */
private void setupTextUI(TextField t, String ff, double f, double w, Pos p, double x, double y, boolean e){
	t.setFont(Font.font(ff, f));
	t.setMinWidth(w);
	t.setMaxWidth(w);
	t.setAlignment(p);
	t.setLayoutX(x);
	t.setLayoutY(y);		
	t.setEditable(e);
}

/**********
 * Private local method to initialize the standard fields for a button
 */
private void setupButtonUI(Button b, String ff, double f, double w, Pos p, double x, double y){
	b.setFont(Font.font(ff, f));
	b.setMinWidth(w);
	b.setAlignment(p);
	b.setLayoutX(x);
	b.setLayoutY(y);		
}	
private void analysisReport() {
}
private void browse() {
}
private void exit() {
}	
}	
