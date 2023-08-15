/* Author UoW Id :w1790191
* Author IIT id : 2019741
*
* Topic : Financial Calculator App */
//Start
package MyFinancialCalculator; //Package name`

import javafx.application.Application; //to import applications in javafx
import javafx.event.ActionEvent;  // to import action events in javafx
import javafx.event.EventHandler;  //to import  event handler in javafx

import javafx.scene.Scene; //to import scenes
import javafx.scene.image.Image; //to import images
import javafx.scene.image.ImageView; //to import image views
import javafx.scene.layout.AnchorPane;  //to import anchor panes as scenes layouts
import javafx.scene.layout.Pane; //to import panes
import javafx.scene.text.Font;  //to import fonts
import javafx.stage.Stage;  //to import stages
import javafx.scene.control.TabPane;  //to import tab panes
import javafx.scene.control.Tab;  //to import tabs
import javafx.scene.control.Button;  //to import buttons
import javafx.scene.control.Label;  //to import labels
import javafx.scene.control.TextField;  //to import text fields

import java.io.FileInputStream;  //to import java.io.FileInputStream

import static javafx.scene.paint.Color.BLUE;
import static javafx.scene.paint.Color.RED;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        
        primaryStage.setTitle("Financial Calculator App"); //Set a title of this application
        Tab tab1=new Tab("compound savings"); //Compound savings tag
        Pane pane1=new Pane();  //adding a pane to the tab
        tab1.setContent(pane1); //entering the pane in to the tab
        Label tab1Label1=new Label("Compound Interest Savings ($)");//initialize the elements//in this case "T1Lb1" is a object name
        tab1Label1.setLayoutY(10);//layout y axis
        tab1Label1.setLayoutX(30);//layout x axis //actual thing of these setLayoutX and setLayoutY is to set the location of our elements
        tab1Label1.setStyle("-fx-Background-color:#d926ac ; -fx-font-weight:bold ; -fx-font-size:25px"); //styling the label
        tab1.setStyle("-fx-Background-color:pink");//change tab colors

        Label subtitle1=new Label("Calculate annual Interest rate of compound savings");
        subtitle1.setLayoutX(30);
        subtitle1.setLayoutY(50); //layouting
        subtitle1.setStyle("-fx-font-weight:bold");

        Button closeButton1=new Button("  Close  ");//initialize the element//in this case closeButton1 is a object name
        closeButton1.setLayoutX(30);
        closeButton1.setLayoutY(430);
        closeButton1.setStyle("-fx-background-color:yellow;-fx-font-size:20px;-fx-font-weight:bold;-fx-border-color:black");
        closeButton1.setMinSize(110,30);
        closeButton1.setOnAction(new EventHandler<ActionEvent>() { //in this case button follows the action to do some task
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        }); //when I click the button scene should be closed

        Button closeButton2=new Button("Close");
        closeButton2.setLayoutX(30);
        closeButton2.setLayoutY(430);
        closeButton2.setMinSize(110,30);
        closeButton2.setStyle("-fx-background-color:yellowgreen;-fx-font-size:20px;-fx-font-weight:bold;-fx-border-color:black");

        closeButton2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        }); //When I click the close Button scene should be closed



        Button closeButton3=new Button("Close");
        closeButton3.setLayoutX(30);
        closeButton3.setLayoutY(430);
        closeButton3.setStyle("-fx-background-color:lightblue;-fx-font-size:20px;-fx-font-weight:bold;-fx-border-color:black");
        closeButton3.setMinSize(110,30);
        closeButton3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            } //When I click the close Button, scene should be closed
        });

        Button closeButton4=new Button("Close");
        closeButton4.setLayoutX(440);
        closeButton4.setLayoutY(520);
        closeButton4.setStyle("-fx-background-color:sandybrown;-fx-font-size:20px;-fx-font-weight:bold;-fx-border-color:black");
        closeButton4.setMinSize(110,30);
        closeButton4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            } //When I click the close Button scene should be closed
        });



        Label tab1Label2=new Label("Future Value"); //a label
        tab1Label2.setLayoutX(200);
        tab1Label2.setLayoutY(80); //layout the label

        TextField tab1TF1_FutureValue=new TextField();  //Add text fields to prompt user input
        tab1TF1_FutureValue.setLayoutX(30);
        tab1TF1_FutureValue.setLayoutY(80); //layout the text field

        Label tab1Label3=new Label("Present Value"); //a label
        tab1Label3.setLayoutX(200);
        tab1Label3.setLayoutY(130); //layout the label

        TextField tab1TF2_PresentValue=new TextField(); //a text field
        tab1TF2_PresentValue.setLayoutX(30);
        tab1TF2_PresentValue.setLayoutY(130);  //layout the text field

        Label tab1Label4=new Label("The number of times that interest is" +
                "compounded per unit time/(monthly)");
        tab1Label4.setLayoutX(200);
        tab1Label4.setLayoutY(180);

        TextField tab1Tf3_calCompoundingFrequencyM=new TextField();
        tab1Tf3_calCompoundingFrequencyM.setLayoutX(30);
        tab1Tf3_calCompoundingFrequencyM.setLayoutY(180);

        Label tab1Label5=new Label("time in money invested or borrowed in years");
        tab1Label5.setLayoutX(200);
        tab1Label5.setLayoutY(230);

        TextField tab1Tf4_time=new TextField();
        tab1Tf4_time.setLayoutX(30);
        tab1Tf4_time.setLayoutY(230);

        Label result1=new Label();
        result1.setLayoutY(280);

        ImageView imageV1=new ImageView(); //set image view to add a image to Tab-->Pane-->ImageView
        imageV1.setX(250);
        imageV1.setY(320);
        //layout the image view

        imageV1.setFitHeight(200); //set the fit height  of the ImageView
        imageV1.setFitWidth(300);  //set the fit weight of the ImageView
        Image image1=new Image(new FileInputStream("C:\\Users\\Acer\\Downloads\\w1790191\\w1790191_PP2_CW\\src\\MyFinancialCalculator\\comoundSavings.jpeg"));//add url of the picture

        Button CalAnnualIntButton=new Button("Calculate annual interest rate :)"); // the button
        CalAnnualIntButton.setLayoutX(130);
        CalAnnualIntButton.setLayoutY(280); //layout the button

        CalAnnualIntButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String st1=tab1TF2_PresentValue.getText();
                String st2=tab1TF2_PresentValue.getText();
                String st3=tab1Tf3_calCompoundingFrequencyM.getText();
                String st4=tab1Tf4_time.getText();
                Double calTotal1=Double.parseDouble(st3)*(Math.pow(Double.parseDouble(st1)/Double.parseDouble(st2),(1/(Double.parseDouble(st3)*Double.parseDouble(st4))))-1);
                result1.setText(" "+calTotal1*100+"%"); //create set on action to button to calculate compound interest rate of the year

            }
        });

        Pane pane2=new Pane();  //pane to the mortgage tab
        Tab tab2=new Tab("   Mortgages  ");
        tab2.setContent(pane2);
        tab2.setStyle("-fx-Background-color:LIGHTGREEN"); //set color to my tab


        Label tab2Label1=new Label("    Mortgages  ($)  "); //a label
        tab2Label1.setLayoutY(10);
        tab2Label1.setLayoutX(30);
        //layout the label
        tab2Label1.setStyle("-fx-background-color:#4bc322;-fx-font-size:25px;-fx-font-weight:bold"); //set style to the label

        Label subtitle2=new Label("Calculate time in years to repay mortgage money");//a label
        subtitle2.setLayoutX(30);
        subtitle2.setLayoutY(50);
        subtitle2.setStyle("-fx-font-weight:bold");

        TextField tab2TF1_FutureValue =new TextField();//a text field
        tab2TF1_FutureValue.setLayoutX(30);
        tab2TF1_FutureValue.setLayoutY(80);



        Label tab2Label2=new Label("Future Value of the mortgages" +
                "");  //label
        tab2Label2.setLayoutX(200);
        tab2Label2.setLayoutY(80);

        TextField tab2TF2_AnnualInterest=new TextField();//a text field
        tab2TF2_AnnualInterest.setLayoutX(30);
        tab2TF2_AnnualInterest.setLayoutY(130);

        Label tab2Label3=new Label("Annual Interest Rate");//a label
        tab2Label3.setLayoutX(200);
        tab2Label3.setLayoutY(130);

        TextField tab2TF3_AnnuityPayment =new TextField(); //a text field
        tab2TF3_AnnuityPayment.setLayoutX(30);
        tab2TF3_AnnuityPayment.setLayoutY(180);

        Label tab2Label4=new Label("Annuity Payments");//a label
        tab2Label4.setLayoutX(200);
        tab2Label4.setLayoutY(180);

        Button CalMortgageTermBtn=new Button("Calculate time in years :>");//a button
        CalMortgageTermBtn.setLayoutX(200);
        CalMortgageTermBtn.setLayoutY(230);

        Label result2=new Label();//this label should represent the time in years when i click the calculation button
        result2.setLayoutY(230); // layout y axes only for this label

        ImageView imageV2=new ImageView(); //image view for pane 2
        imageV2.setX(280); //set image layout x axis
        imageV2.setY(300); //set image layout y axis

        imageV2.setFitWidth(320);
        imageV2.setFitHeight(180);
        Image image3=new Image(new FileInputStream("C:\\Users\\Acer\\Downloads\\w1790191\\w1790191_PP2_CW\\src\\MyFinancialCalculator\\mortgage1.JPG")); //add URL of the picture

        CalMortgageTermBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String st5=tab2TF1_FutureValue.getText();
                String st6=tab2TF2_AnnualInterest.getText();
                String st7=tab2TF3_AnnuityPayment.getText();
                Double CalTotal2=Math.log((1+(Double.parseDouble(st6)*Double.parseDouble(st5))/Double.parseDouble(st7))/(Math.log(1+Double.parseDouble(st6))*12));
                result2.setText(" "+CalTotal2+" years");
            }
        });




        Tab tab3=new Tab("  Loans "); //create tab for loans
        tab3.setStyle("-fx-Background-color:LIGHTSEAGREEN");
        Pane pane3=new Pane(); //create pane for this loan tab
        tab3.setContent(pane3); //  add a pane this loan tab

        Label tab3Label1=new Label("    Loans    ($)   ");//a label
        tab3Label1.setLayoutY(10);
        tab3Label1.setLayoutX(30);
        tab3Label1.setStyle("-fx-background-color:#6699cc;-fx-font-weight:bold;-fx-font-size:25px"); //set a style to this label

        Label sub3=new Label("Calculate time in years to repay a loan's money");//a label
        sub3.setLayoutX(30);
        sub3.setLayoutY(50);
        sub3.setStyle("-fx-font-weight:bold");

        TextField tab3TF1_FutureValue =new TextField(); //a text field
        tab3TF1_FutureValue.setLayoutX(30);
        tab3TF1_FutureValue.setLayoutY(80);

        Label tab3Label2=new Label("Future Value of the loan"); //a label
        tab3Label2.setLayoutX(200);
        tab3Label2.setLayoutY(80);

        TextField tab3TF2_AnnualInterest=new TextField(); //a text field
        tab3TF2_AnnualInterest.setLayoutX(30);
        tab3TF2_AnnualInterest.setLayoutY(130);

        Label tab3Label3=new Label("Annual Interest Rate"); //a label
        tab3Label3.setLayoutX(200);
        tab3Label3.setLayoutY(130);

        TextField tab3TF3_AnnuityPayment =new TextField(); //a text field
        tab3TF3_AnnuityPayment.setLayoutX(30);
        tab3TF3_AnnuityPayment.setLayoutY(180);

        Label tab3Label4=new Label("Annuity Payments");  //a label
        tab3Label4.setLayoutX(200);
        tab3Label4.setLayoutY(180);

        Button calLoanTermBtn=new Button("Calculate time taken in years to pay a loan :>"); //a button
        calLoanTermBtn.setLayoutX(200);
        calLoanTermBtn.setLayoutY(230);

        Label result3=new Label(); // hided label for get out put after clicked calculation button
        result3.setLayoutY(230);

        ImageView imageV3=new ImageView();  // image view to 3 rd pane to add image
        Image image4=new Image(new FileInputStream("C:\\Users\\Acer\\Downloads\\w1790191\\w1790191_PP2_CW\\src\\MyFinancialCalculator\\loans2.jpeg"));
        imageV3.setX(300); //set ImageView's x axis
        imageV3.setY(320); //set ImageView's y axis
        imageV3.setFitHeight(180);  //set fit the height of ImageView
        imageV3.setFitWidth(340);  //set fit the width of ImageView

        calLoanTermBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String st8=tab3TF1_FutureValue.getText();
                String st9=tab3TF2_AnnualInterest.getText();
                String st10=tab3TF3_AnnuityPayment.getText();
                Double CalTotal3=Math.log((1-(Double.parseDouble(st9)*Double.parseDouble(st8))/Double.parseDouble(st10))/(Math.log(1+Double.parseDouble(st9))*12));
                result3.setText(" "+CalTotal3+" years");
            }
        }); //set formula and setOnAction to the calculation button to get the time in years to repay loan


        Tab tab4=new Tab("  Help  "); //add tab for help view
        tab4.setStyle("-fx-Background-color:LIGHTSALMON");
        Pane pane4=new Pane(); //add pane to 4 th tab (help tab)
        tab4.setContent(pane4);


        Label tab4Label1=new Label("I need a help.."); //a label
        tab4Label1.setLayoutY(25);
        tab4Label1.setLayoutX(150);
        tab4Label1.setFont(new Font("Cambria",40));
        tab4Label1.setTextFill(RED);

        ImageView imageV4=new ImageView();
        imageV4.setX(420);
        imageV4.setY(20);
        imageV4.setFitWidth(170);
        imageV4.setFitHeight(100);
        Image imagehelp=new Image(new FileInputStream("C:\\Users\\Acer\\Downloads\\w1790191\\w1790191_PP2_CW\\src\\MyFinancialCalculator\\helpReal.JPG"));

        Label helpLb1=new Label("Compound Interest Savings");//a label for topic
        helpLb1.setLayoutX(30);
        helpLb1.setLayoutY(80);
        helpLb1.setStyle("-fx-font-name:Arial;-fx-font-size:20px;-fx-font-weight:bold");//set a style for this label

        Label helpLb2=new Label("You can grow your money from compound interest savings with the time."+"\n" +
                " So we have a normal formula to calculate the annual interest rate ." +"\n"+
                "It is r=n*[(A/P)^(1/nt) - 1]"+"\n" +
                "You can find this calculator in the compound savings tab . If you fill future value,"+"\n"+"present value, the number of times that interest is\n" +
                "compounded per unit,time in money you burrowed in years fields and by clicking the button ,"+"\n"+"you can calculate a annual interest rate of compound \n" +
                "savings.");// a label for description
        helpLb2.setLayoutX(30);
        helpLb2.setLayoutY(110);
        helpLb2.setFont(new Font("Arial",14));

        Label helpLb3=new Label("Mortgages"); //a label for topic

        helpLb3.setLayoutX(30);
        helpLb3.setLayoutY(260);
        helpLb3.setStyle("-fx-font-name:Arial;-fx-font-size:20px;-fx-font-weight:bold");

        Label helpLb4=new Label("Actually mortgage is a loan from financial institution (ex:Bank) to buy a\n" +
                "homes or properties so we have normal formula to calculate time in years to pay this money back\n" +
                ".It is t=ln[(1-(rA)/PMT)/ln(1+r)*12]\n So you can find calculation from the secont tab in my application" +
                "If you fill the values and by clicking \n the time calculation button you can find time in years to pay mortgage loan");//a label for description
        helpLb4.setLayoutX(30);
        helpLb4.setLayoutY(290);
        helpLb4.setFont(new Font("Arial",14));

        Label helpLb5=new Label("Loans"); //a label for topic
        helpLb5.setStyle("-fx-font-name:Arial;-fx-font-size:20px;-fx-font-weight:bold");
        helpLb5.setLayoutX(30);
        helpLb5.setLayoutY(380);

        Label helpLb6=new Label("Loan is like, get money from financially or from friend or someone \n" +
                "to repayment for future . In my calculator on third tab you can calculate \n" +
                "time to pay your full payments . It has a manual formula same as mortgage \n " +
                "t=ln[(1-(rA)/PMT)/ln(1+r)*12)]"); //a label for description
        helpLb6.setLayoutX(30);
        helpLb6.setLayoutY(410);
        helpLb6.setFont(new Font("Arial",14));

        Label helpLb7=new Label(" Introduction of symbols \n"+"\n"+" A - the future value of the investment" +
                "/loan including interesting "+"\n"+" P-Present value "+"\n"+" the annual interest rate "+"\n"
       +" n- The number of times tha interest compounded per unit time "+"\n"+" t - time the money invested or borrowed in years \n" +
                " PMT - annuity payments" ); //a label fro introduction symbols

        helpLb7.setLayoutX(30);
        helpLb7.setLayoutY(490);
        helpLb7.setTextFill(BLUE);
        helpLb7.setStyle("-fx-Background-color:WHITE;-fx-font-size:12.5px");

        AnchorPane root=new AnchorPane(); /*
        the root is an object which is came from the class anchor pane*/

        TabPane tabPane=new TabPane();// a tab pane inside the anchor pane





        pane2.getChildren().addAll(subtitle2,closeButton2,tab2TF1_FutureValue,tab2Label1,tab2TF2_AnnualInterest,tab2Label2,tab2Label3,tab2Label4,tab2TF3_AnnuityPayment,CalMortgageTermBtn,result2,imageV2);
        imageV1.setImage(image1);
        imageV2.setImage(image3);
        imageV3.setImage(image4);
        imageV4.setImage(imagehelp);
        pane1.getChildren().addAll(subtitle1,closeButton1,imageV1,tab1Label1,tab1TF1_FutureValue,tab1Label2,tab1Label3,tab1TF2_PresentValue,tab1Tf3_calCompoundingFrequencyM,tab1Label4,tab1Label5  ,tab1Tf4_time,CalAnnualIntButton,result1);
        pane3.getChildren().addAll(sub3,closeButton3,tab3Label1,tab3TF1_FutureValue,tab3Label2,tab3Label3,tab3TF3_AnnuityPayment,tab3Label4,calLoanTermBtn,result3,tab3TF2_AnnualInterest,imageV3);
        pane4.getChildren().addAll(closeButton4,imageV4,tab4Label1,helpLb1,helpLb2,helpLb3,helpLb4,helpLb5,helpLb6,helpLb7);
        root.getChildren().add(tabPane);
        tabPane.getTabs().add(tab1);
        tabPane.getTabs().add(tab2);
        tabPane.getTabs().add(tab3);
        tabPane.getTabs().add(tab4);

        /* add root node */

        primaryStage.setScene(new Scene(root, 650, 675)); //set scene width and height
        primaryStage.show();//Show Scene
    }


    public static void main(String[] args) { //main method
        launch(args);
    }
}
/* end
*/

//------------------learned financial terms through the project ---------------
//present value - current value of the future sum of money.
//future value - the value of the current assets at a future date based on the assumed rate of growth (expected targeted value)
//annual interest rate - the annual  interest rate, I should follow to get the future value (expected targeted value)
//the number of times that interest is compounded per unit time (monthly) - no of times interest is compounded per year
//time in money invested or borrowed in years - how many years


//annuity payment - a series of equal payments made at the end of the consecutive periods over a fixed length of time