package Kalkulatorme;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLKalkulatorMeController implements Initializable {

    @FXML
    private Button btn_Clear;
    @FXML
    private Button btn_01;
    @FXML
    private Button btn_07;
    @FXML
    private Button btn_04;
    @FXML
    private Button btn_02;
    @FXML
    private Button btn_03;
    @FXML
    private Button btn_Plus;
    @FXML
    private Button btn_08;
    @FXML
    private Button btn_05;
    @FXML
    private Button btn_06;
    @FXML
    private Button btn_09;
    @FXML
    private Button btn_Mod;
    @FXML
    private Button btn_Divided;
    @FXML
    private Button btn_Time;
    @FXML
    private Button btn_Minus;
    @FXML
    private Button btn_Result;
    private int angkaData1 = 0;
    private String oprator = "netral";
    private int angkaData2 = 0;
    private int result;
    @FXML
    private Button btn_00;
    @FXML
    private Button btn_0;
    @FXML
    private TextField view_Display;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void buttonClicked(ActionEvent event) {
        if(event.getSource() == btn_00) {
            view_Display.setText(view_Display.getText() + "00");
        } else if(event.getSource() == btn_0) {
            view_Display.setText(view_Display.getText() + "0");
        } else if(event.getSource() == btn_01) {
            view_Display.setText(view_Display.getText() + "1");
        } else if(event.getSource() == btn_02) {
            view_Display.setText(view_Display.getText() + "2");
        } else if(event.getSource() == btn_03) {
            view_Display.setText(view_Display.getText() + "3");
        } else if(event.getSource() == btn_04) {
            view_Display.setText(view_Display.getText() + "4");
        } else if(event.getSource() == btn_05) {
            view_Display.setText(view_Display.getText() + "5");
        } else if(event.getSource() == btn_06) {
            view_Display.setText(view_Display.getText() + "6");
        } else if(event.getSource() == btn_07) {
            view_Display.setText(view_Display.getText() + "7");
        } else if(event.getSource() == btn_08) {
            view_Display.setText(view_Display.getText() + "8");
        } else if(event.getSource() == btn_09) {
            view_Display.setText(view_Display.getText() + "9");
        } else if(event.getSource() == btn_Plus) {
            if(!view_Display.getText().isBlank()) {
                angkaData1 = Integer.parseInt(view_Display.getText());
                oprator = "plus";
                view_Display.setText("");
            } 
        } else if(event.getSource() == btn_Minus) {
            if(!view_Display.getText().isBlank()) {
                angkaData1 = Integer.parseInt(view_Display.getText());
                oprator = "minus";
                view_Display.setText("");
            }
        } else if(event.getSource() == btn_Time) {
            if(!view_Display.getText().isBlank()) {
                angkaData1 = Integer.parseInt(view_Display.getText());
                oprator = "time";
                view_Display.setText("");
            }   
        } else if(event.getSource() == btn_Divided) {
            if(!view_Display.getText().isBlank()) {
                angkaData1 = Integer.parseInt(view_Display.getText());
                oprator = "devided";
                view_Display.setText("");
            }   
        } else if(event.getSource() == btn_Mod) {
            if(!view_Display.getText().isBlank()) {
                angkaData1 = Integer.parseInt(view_Display.getText());
                oprator = "mod";
                view_Display.setText("");
            }   
        } else if(event.getSource() == btn_Result) { 
            if(!view_Display.getText().isBlank()) {
                angkaData2 = Integer.parseInt(view_Display.getText());
            
                if(oprator.equals("plus")) {
                    result = angkaData1 + angkaData2;
                } else if(oprator.equals("minus")) {
                    result = angkaData1 - angkaData2;
                } else if(oprator.equals("time")) {
                    result = angkaData1 * angkaData2;
                } else if(oprator.equals("devided")) {
                    result = angkaData1 / angkaData2;
                } else if(oprator.equals("mod")) {
                    result = angkaData1 % angkaData2;
                }

                view_Display.setText(String.valueOf(result));
                oprator = "netral";
            } else {
                view_Display.setText("");
            }
        } else if(event.getSource() == btn_Clear) {
            view_Display.setText("");
        }
    }
    
}
