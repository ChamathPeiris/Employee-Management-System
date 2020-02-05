package sample;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    static Stage primaryStage;
    static Scene clickLogIn;

    static Scene clickEmployee;
    static Scene menu;
    static Scene clickRole;
    static Scene clickCustomer;
    static Scene clickContract;
    static Scene clickSalary;

    static Scene clickEmployeeCreate;
    static Scene clickEmployeeDelete;
    static Scene clickEmployeeUpdate;
    static Scene clickEmployeeView;

    static Scene clickCustomerCreate;
    static Scene clickCustomerDelete;
    static Scene clickCustomerUpdate;
    static Scene clickCustomerView;

    static Scene clickRoleCreate;
    static Scene clickRoleDelete;
    static Scene clickRoleUpdate;
    static Scene clickRoleView;

    static Scene clickContractCreate;
    static Scene clickContractDelete;
    static Scene clickContractUpdate;
    static Scene clickContractView;



    @Override
    public void start(Stage stage) throws Exception{
        primaryStage = stage;
        stage.setResizable(false);


        Parent logIn = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Parent EmployeeDetails = FXMLLoader.load(getClass().getResource("Employee.fxml"));
        Parent RoleDetails = FXMLLoader.load(getClass().getResource("Role.fxml"));
        Parent CustomerDetails = FXMLLoader.load(getClass().getResource("Customer.fxml"));
        Parent ContractDetails = FXMLLoader.load(getClass().getResource("Contract.fxml"));
        Parent Salary = FXMLLoader.load(getClass().getResource("Salary.fxml"));

        Parent CreateEmployee = FXMLLoader.load(getClass().getResource("CreateEmployee.fxml"));
        Parent DeleteEmployee = FXMLLoader.load(getClass().getResource("DeleteEmployee.fxml"));
        Parent UpdateEmployee = FXMLLoader.load(getClass().getResource("UpdateEmployee.fxml"));
        Parent ViewEmployee = FXMLLoader.load(getClass().getResource("ViewEmployee.fxml"));

        Parent CreateCustomer = FXMLLoader.load(getClass().getResource("CreateCustomer.fxml"));
        Parent DeleteCustomer = FXMLLoader.load(getClass().getResource("DeleteCustomer.fxml"));
        Parent UpdateCustomer = FXMLLoader.load(getClass().getResource("UpdateCustomer.fxml"));
        Parent ViewCustomer = FXMLLoader.load(getClass().getResource("ViewCustomer.fxml"));

        Parent CreateRole = FXMLLoader.load(getClass().getResource("CreateRole.fxml"));
        Parent DeleteRole = FXMLLoader.load(getClass().getResource("DeleteRole.fxml"));
        Parent UpdateRole = FXMLLoader.load(getClass().getResource("UpdateRole.fxml"));
        Parent ViewRole = FXMLLoader.load(getClass().getResource("ViewRole.fxml"));

        Parent CreateContract = FXMLLoader.load(getClass().getResource("CreateContract.fxml"));
        Parent DeleteContract = FXMLLoader.load(getClass().getResource("DeleteContract.fxml"));
        Parent UpdateContract = FXMLLoader.load(getClass().getResource("UpdateContract.fxml"));
        Parent ViewContract = FXMLLoader.load(getClass().getResource("ViewContract.fxml"));


        menu = new Scene(root,1000,600 );
        clickLogIn = new Scene(logIn,1000,600 );
        clickEmployee = new Scene(EmployeeDetails,1000,600 );
        clickRole = new Scene(RoleDetails,1000,600 );
        clickCustomer = new Scene(CustomerDetails,1000,600 );
        clickContract = new Scene(ContractDetails,1000,600 );
        clickSalary = new Scene(Salary,1000,600 );

        clickEmployeeCreate = new Scene (CreateEmployee,1000,600 );
        clickEmployeeDelete = new Scene (DeleteEmployee,1000,600 );
        clickEmployeeUpdate = new Scene (UpdateEmployee,1000,600 );
        clickEmployeeView = new Scene (ViewEmployee,1000,600 );

        clickCustomerCreate = new Scene (CreateCustomer,1000,600 );
        clickCustomerDelete = new Scene (DeleteCustomer,1000,600 );
        clickCustomerUpdate = new Scene (UpdateCustomer,1000,600 );
        clickCustomerView = new Scene (ViewCustomer,1000,600 );

        clickRoleCreate = new Scene (CreateRole,1000,600 );
        clickRoleDelete = new Scene (DeleteRole,1000,600 );
        clickRoleUpdate = new Scene (UpdateRole,1000,600 );
        clickRoleView = new Scene (ViewRole,1000,600 );

        clickContractCreate = new Scene (CreateContract,1000,600 );
        clickContractDelete = new Scene (DeleteContract,1000,600 );
        clickContractUpdate = new Scene (UpdateContract,1000,600 );
        clickContractView = new Scene (ViewContract,1000,600 );



        primaryStage.setTitle("Computer Consultancy Firm");
        primaryStage.setScene(clickLogIn);
        primaryStage.show();
    }

    static DB database;

    public static void main(String[] args) {

        MongoClient mongoClient=new MongoClient("localhost",27017);
        database=mongoClient.getDB("chamathCCF");
        launch(args);
    }
}
