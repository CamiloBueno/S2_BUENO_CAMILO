package ui;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import model.Classroom;

public class ClassroomGUI {
	private Classroom classroom;
	
	public  ClassroomGUI() {
		
	}
	public void initialize() throws IOException {
		cbFavoriteBrowser.getItems().addAll("Opera","Chrome","Firefox","Edge");
		gender="";
		career="";
		
		classroom = new Classroom();
		/*FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("login.fxml"));
		fxmlloader.setController(this);
		Parent root = fxmlloader.load();
		mainPane.getChildren().clear();
		mainPane.setCenter(root);*/
	}
	
	//MainPane
	
	@FXML
    private BorderPane mainPane;
	//login
	@FXML
    private TextField tfUsername;

    @FXML
    private PasswordField tfPassword;

    @FXML
    void logIn(ActionEvent event) {
    	
    	String username = tfUsername.getText();
    	String password = tfPassword.getText();
    	if(classroom.verifyAccount(username, password)){
    		
    		Alert info = new Alert(AlertType.INFORMATION);
        	info.setTitle("Login correct");
        	info.setHeaderText(null);
        	info.setContentText("The username and password given are correct");
        	info.show();
    		
    	}else {
    		
    		Alert info = new Alert(AlertType.INFORMATION);
        	info.setTitle("Login incorrect");
        	info.setHeaderText(null);
        	info.setContentText("The username and password given are incorrect");
        	info.show();
    	}
    	
   
    }

    @FXML
    void signUp(ActionEvent event) throws IOException {
    	/*FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("register.fxml"));
		fxmlloader.setController(this);
		Parent root = fxmlloader.load();
		mainPane.getChildren().clear();
		mainPane.setCenter(root);*/
		
    }
    //table
    
    @FXML
    private Label nameid;

    @FXML
    private ImageView photo;

    @FXML
    void logOut(ActionEvent event) {

    }
    
    //register
    private String gender;
    
    private String career;
    @FXML
    private TextField tfProfilePhoto;

    @FXML
    private ComboBox<String> cbFavoriteBrowser;

    @FXML
    private PasswordField pfPassword;

    @FXML
    private TextField tfUserName;

    @FXML
    void bCreateAccount(ActionEvent event) {
    	
    	String userName = tfUserName.getText();
    	String password = pfPassword.getText();
    	String pathField = tfProfilePhoto.getText();
    	String birthday= dpBirthday.getValue().toString();
    	String favorite= cbFavoriteBrowser.getValue();
    	classroom.addAccounts(userName, password, pathField, gender, career, birthday ,favorite );
    	Alert info = new Alert(AlertType.INFORMATION);
    	info.setTitle("Account Created");
    	info.setHeaderText(null);
    	info.setContentText("The new account has been created");
    	info.show();
    	
    }

    @FXML
    void bSignIn(ActionEvent event) throws IOException {
    	/*FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("login.fxml"));
		fxmlloader.setController(this);
		Parent root = fxmlloader.load();
		mainPane.getChildren().clear();
		mainPane.setCenter(root);*/

    }

    @FXML
    void cbIndustrialEngineering(ActionEvent event) {
    	career = career+"- IndustrialEngineering -";
    }

    @FXML
    void cbSoftwareEngineering(ActionEvent event) {
    	career = career+"- SoftwareEngineering -";
    }

    @FXML
    void cbTelematicEngineering(ActionEvent event) {
    	career = career+"- TelematicEngineering -";
    }

    @FXML
    private  DatePicker dpBirthday;

    @FXML
    public void rbFemale(ActionEvent event) {

    	gender = "Female";
    	
    }

    @FXML
    public void rbMale(ActionEvent event) {
    	gender = "Male";
    }

    @FXML
    void rbOther(ActionEvent event) {
    	gender = "Other";	
    }

    @FXML
    void uploadPhoto(ActionEvent event) {
    	
    	FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Image");
        fileChooser.getExtensionFilters().addAll(new ExtensionFilter("All Files", "*.*"));
       
        File file = fileChooser.showOpenDialog(null); 
         
        tfProfilePhoto.setText(file.getAbsolutePath());
        
    }
    
    
    

}
