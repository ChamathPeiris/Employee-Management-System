package sample;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML private Button logIn;
    @FXML private Button employee;
    @FXML private Button role;
    @FXML private Button customer;
    @FXML private Button contract;

    @FXML private Button createEmployee;
    @FXML private Button deleteEmployee;
    @FXML private Button updateEmployee;
    @FXML private Button viewEmployee;
    @FXML private Button createCustomer;
    @FXML private Button deleteCustomer;
    @FXML private Button updateCustomer;
    @FXML private Button viewCustomer;

    @FXML private Button createRole;
    @FXML private Button deleteRole;
    @FXML private Button updateRole;
    @FXML private Button viewRole;

    @FXML private Button createContract;
    @FXML private Button deleteContract;
    @FXML private Button updateContract;
    @FXML private Button viewContract;

    //Log in
    @FXML static String password;
    @FXML static String userId;
    @FXML public TextField userName;
    @FXML public PasswordField text;

    //employee
    @FXML public TextField empId;
    @FXML public TextField fullName;
    @FXML public DatePicker dob;
    @FXML public TextArea empAddress;
    @FXML public TextField empPhoneNumber;


    //customer
    @FXML public TextField cusId;
    @FXML public TextField cusFullName;
    @FXML public TextArea cusAddress;
    @FXML public TextField cusPhoneNumber;

    //contract
    @FXML public TextField conId;
    @FXML public TextField conName;
    @FXML public TextArea conDescription;
    @FXML public DatePicker conDate;
    @FXML public TextField conType;
    @FXML public TextField proLeader;

    //role
    @FXML public TextField roleId;
    @FXML public TextArea roleDescription;
    @FXML public TextField rolePay;

    //salary
    @FXML public TextField hours;
    @FXML public TextField payment;



    //Employee validation
    @FXML static String employeeId;

    //Customer validation
    @FXML static String customerId;

    //Contract validation
    @FXML static String contractId;

    //Contract validation
    @FXML static String role_Id;

    public void cancelBtn() {

        System.exit(0);
    }

    public void employeeMenubtn() {
        Main.primaryStage.setScene(Main.clickEmployee);
        Main.primaryStage.show();
    }

    public void BackButton() {
        Main.primaryStage.setScene(Main.menu);
        Main.primaryStage.show();
    }

    public void cancelEmployee() {
        Main.primaryStage.setScene(Main.clickEmployee);
        Main.primaryStage.show();
    }

    public void cancelCustomer() {
        Main.primaryStage.setScene(Main.clickCustomer);
        Main.primaryStage.show();
    }

    public void cancelRole() {
        Main.primaryStage.setScene(Main.clickRole);
        Main.primaryStage.show();
    }

    public void cancelContract() {
        Main.primaryStage.setScene(Main.clickContract);
        Main.primaryStage.show();
    }

    public void roleMenubtn() {
        Main.primaryStage.setScene(Main.clickRole);
        Main.primaryStage.show();
    }

    public void customerMenubtn() {
        Main.primaryStage.setScene(Main.clickCustomer);
        Main.primaryStage.show();
    }

    public void contractMenubtn() {
        Main.primaryStage.setScene(Main.clickContract);
        Main.primaryStage.show();
    }
    public void salaryMenubtn() {
        Main.primaryStage.setScene(Main.clickSalary);
        Main.primaryStage.show();
    }

    public void LogIn() {
        Boolean correct = false;
        DBCollection collection = Main.database.getCollection("users");
        DBCursor cur = collection.find();

        while (cur.hasNext()) {
            DBObject obj = cur.next();
            String user = (String) obj.get("userName");
            String newPassword = (String) obj.get("password");

            password = text.getText();
            userId = userName.getText();

            if (password.equals(newPassword)&&userId.equals(user)) {
                correct = true;
                Main.primaryStage.setScene(Main.menu);
                Main.primaryStage.show();
            }
        }
        if (correct==false){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Log In Error");
            alert.setContentText("Invalid Username or Password!");

            alert.showAndWait();

        }
    }

    //Employee Button
    public void createEmployeebtn() {
        Main.primaryStage.setScene(Main.clickEmployeeCreate);
        Main.primaryStage.show();
    }

    public void deleteEmployeebtn() {
        Main.primaryStage.setScene(Main.clickEmployeeDelete);
        Main.primaryStage.show();
    }

    public void updateEmployeebtn() {
        Main.primaryStage.setScene(Main.clickEmployeeUpdate);
        Main.primaryStage.show();
    }

    public void viewEmployeebtn() {
        Main.primaryStage.setScene(Main.clickEmployeeView);
        Main.primaryStage.show();
    }

    //Customer Button
    public void createCustomerbtn() {
        Main.primaryStage.setScene(Main.clickCustomerCreate);
        Main.primaryStage.show();
    }

    public void deleteCustomerbtn() {
        Main.primaryStage.setScene(Main.clickCustomerDelete);
        Main.primaryStage.show();
    }

    public void updateCustomerbtn() {
        Main.primaryStage.setScene(Main.clickCustomerUpdate);
        Main.primaryStage.show();
    }

    public void viewCustomerbtn() {
        Main.primaryStage.setScene(Main.clickCustomerView);
        Main.primaryStage.show();
    }

    //Role Button
    public void createRolebtn() {
        Main.primaryStage.setScene(Main.clickRoleCreate);
        Main.primaryStage.show();
    }

    public void deleteRolebtn() {
        Main.primaryStage.setScene(Main.clickRoleDelete);
        Main.primaryStage.show();
    }

    public void updateRolebtn() {
        Main.primaryStage.setScene(Main.clickRoleUpdate);
        Main.primaryStage.show();
    }

    public void viewRolebtn() {
        Main.primaryStage.setScene(Main.clickRoleView);
        Main.primaryStage.show();
    }

    //Contract Button
    public void createContractbtn() {
        Main.primaryStage.setScene(Main.clickContractCreate);
        Main.primaryStage.show();
    }

    public void deleteContractbtn() {
        Main.primaryStage.setScene(Main.clickContractDelete);
        Main.primaryStage.show();
    }

    public void updateContractbtn() {
        Main.primaryStage.setScene(Main.clickContractUpdate);
        Main.primaryStage.show();
    }

    public void viewContractbtn() {
        Main.primaryStage.setScene(Main.clickContractView);
        Main.primaryStage.show();
    }
    //=================================================Connect to database============================================================
    //Employee details Submit Button
    public void empSubmitBtn() {

        DBCollection collection = Main.database.getCollection("employee");
        DBCursor cur = collection.find();

        while(cur.hasNext()){
            DBObject obj = cur.next();
            String id = (String) obj.get("empId");

            employeeId = empId.getText();
            if(!employeeId.equals(id)) {

                //Creating an Object
                BasicDBObject dbObject = new BasicDBObject();
                dbObject.append("empId", empId.getText());
                dbObject.append("fullName", fullName.getText());
                dbObject.append("dob", (String.valueOf(dob.getValue())));
                dbObject.append("address", empAddress.getText());
                dbObject.append("phoneNumber", empPhoneNumber.getText());
                collection.insert(dbObject);
            }else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Employee Dialog");
                alert.setHeaderText("Employee ID Alert");
                alert.setContentText("Employee ID already exist!!!");

                alert.showAndWait();
                return;

            }
        }
    }

    //Customer Details Submit button
    public void cusSubmitBtn() {

        DBCollection collection = Main.database.getCollection("customer");
        DBCursor cur = collection.find();

        while (cur.hasNext()) {
            DBObject obj = cur.next();
            String id = (String) obj.get("customerId");

            customerId = cusId.getText();
            if (!customerId.equals(id)) {

                //Creating an Object
                BasicDBObject dbObject = new BasicDBObject();
                dbObject.append("customerId", cusId.getText());
                dbObject.append("cusFullName", cusFullName.getText());
                dbObject.append("telephone", cusPhoneNumber.getText());
                dbObject.append("address", cusAddress.getText());
                collection.insert(dbObject);
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Customer Dialog");
                alert.setHeaderText("Customer ID Alert");
                alert.setContentText("Customer ID already exist!!!");

                alert.showAndWait();
                return;
            }

        }
    }
    //contract details submit button
    public void contractSubmitBtn() {

        DBCollection collection = Main.database.getCollection("contract");
        DBCursor cur = collection.find();

        while (cur.hasNext()) {
            DBObject obj = cur.next();
            String id = (String) obj.get("contractId");

            contractId = conId.getText();
            if (!contractId.equals(id)) {

                //Creating an Object
                BasicDBObject dbObject = new BasicDBObject();
                dbObject.put("contractId", conId.getText());
                dbObject.append("conName", conName.getText());
                dbObject.append("conDescription", conDescription.getText());
                dbObject.append("conDate", (String.valueOf(conDate.getValue())));
                dbObject.append("jobType", conType.getText());
                dbObject.append("proLeader", proLeader.getText());
                collection.insert(dbObject);
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Contract Dialog");
                alert.setHeaderText("Contract ID Alert");
                alert.setContentText("Contract ID already exist!!!");

                alert.showAndWait();
                return;
            }

        }
    }
    //role details submit button
    public void roleSubmitBtn() {

        DBCollection collection = Main.database.getCollection("role");
        DBCursor cur = collection.find();

        while (cur.hasNext()) {
            DBObject obj = cur.next();
            String id = (String) obj.get("roleId");

            role_Id = roleId.getText();
            if (!role_Id.equals(id)) {

                //Creating an Object
                BasicDBObject dbObject = new BasicDBObject();
                dbObject.append("roleId", roleId.getText());
                dbObject.append("roleDescription", roleDescription.getText());
                dbObject.append("hourlyPay", rolePay.getText());
                collection.insert(dbObject);
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Role Dialog");
                alert.setHeaderText("Role ID Alert");
                alert.setContentText("Role ID already exist!!!");

                alert.showAndWait();
                return;
            }

        }

    }
    //Delete Employee
    public void deleteEmpBtn() {
        DBCollection collection = Main.database.getCollection("employee");
        BasicDBObject dbObject = new BasicDBObject();
        dbObject.put("empId", empId.getText());
        collection.remove(dbObject);

    }

    //Delete Customer
    public void deleteCusBtn() {
        DBCollection collection = Main.database.getCollection("customer");
        BasicDBObject dbObject = new BasicDBObject();
        dbObject.put("customerId", cusId.getText());
        collection.remove(dbObject);

    }

    //Delete Role
    public void deleteRoleBtn() {
        DBCollection collection = Main.database.getCollection("role");
        BasicDBObject dbObject = new BasicDBObject();
        dbObject.put("roleId", roleId.getText());
        collection.remove(dbObject);
    }

    //Delete Contract
    public void deleteContractBtn() {
        DBCollection collection = Main.database.getCollection("contract");
        BasicDBObject dbObject = new BasicDBObject();
        dbObject.put("contractId", conId.getText());
        collection.remove(dbObject);
    }
    //Update Employee
    public void updateEmployeeBtn() {

        DBCollection collection = Main.database.getCollection("employee");
        BasicDBObject updateQuery = new BasicDBObject();
        BasicDBObject newDocument = new BasicDBObject();

        updateQuery.append("fullName", fullName.getText());
        updateQuery.append("dob", String.valueOf(dob.getValue()));
        updateQuery.append("address", empAddress.getText());
        updateQuery.append("phoneNumber", empPhoneNumber.getText());
        newDocument.append("$set", updateQuery);

        BasicDBObject searchQuery = new BasicDBObject().append("empId", empId.getText());
        collection.update(searchQuery, newDocument);

    }
    //Update Customer
    public void updateCustomerBtn() {

        DBCollection collection = Main.database.getCollection("customer");
        BasicDBObject updateQuery = new BasicDBObject();
        BasicDBObject newDocument = new BasicDBObject();

        updateQuery.append("customerId", cusId.getText());
        updateQuery.append("cusFullName", cusFullName.getText());
        updateQuery.append("telephone", cusPhoneNumber.getText());
        updateQuery.append("address", cusAddress.getText());

        newDocument.append("$set", updateQuery);

        BasicDBObject searchQuery = new BasicDBObject().append("customerId", cusId.getText());
        collection.update(searchQuery, newDocument);



    }
    //Update Contract
    public void updateContractBtn() {

        DBCollection collection = Main.database.getCollection("contract");
        BasicDBObject updateQuery = new BasicDBObject();
        BasicDBObject newDocument = new BasicDBObject();

        updateQuery.append("conName", conName.getText());
        updateQuery.append("conDescription", conDescription.getText());
        updateQuery.append("conDate", (String.valueOf(conDate.getValue())));
        updateQuery.append("jobType", conType.getText());
        updateQuery.append("proLeader", proLeader.getText());

        newDocument.append("$set", updateQuery);

        BasicDBObject searchQuery = new BasicDBObject().append("contractId", conId.getText());
        collection.update(searchQuery, newDocument);

    }
    //Update Role
    public void updateRoleBtn() {

        DBCollection collection = Main.database.getCollection("role");
        BasicDBObject updateQuery = new BasicDBObject();
        BasicDBObject newDocument = new BasicDBObject();

        updateQuery.append("roleId", roleId.getText());
        updateQuery.append("roleDescription", roleDescription.getText());
        updateQuery.append("hourlyPay", rolePay.getText());

        newDocument.append("$set", updateQuery);

        BasicDBObject searchQuery = new BasicDBObject().append("roleId", roleId.getText());
        collection.update(searchQuery, newDocument);

    }
    //Salary
    public void salarySubmitBtn() {

        DBCollection collection = Main.database.getCollection("salary");

        //Creating an Object
        BasicDBObject dbObject = new BasicDBObject();
        dbObject.append("empId", empId.getText());
        dbObject.append("roleId", roleId.getText());
        dbObject.append("hours", hours.getText());
        dbObject.append("payment", payment.getText());
        collection.insert(dbObject);

    }

    //View Employee
    public void viewEmployeeBtn() {

        DBCollection collection = Main.database.getCollection("employee");
        BasicDBObject dbObject = new BasicDBObject();
        dbObject.put("empId", empId.getText());
        DBCursor cursor = collection.find(dbObject);
        while(cursor.hasNext()) {
            System.out.println(cursor.next());
            return;

        }
    }

    //View Customer
    public void viewCustomerBtn() {

        DBCollection collection = Main.database.getCollection("customer");
        BasicDBObject dbObject = new BasicDBObject();
        dbObject.put("customerId", cusId.getText());
        DBCursor cursor = collection.find(dbObject);
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
            return;

        }
    }

    //View Contract
    public void viewContractBtn() {

        DBCollection collection = Main.database.getCollection("contract");
        BasicDBObject dbObject = new BasicDBObject();
        dbObject.put("contractId", conId.getText());
        DBCursor cursor = collection.find(dbObject);
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
            return;

        }
    }

    //View Role
    public void viewRoleBtn() {

        DBCollection collection = Main.database.getCollection("role");
        BasicDBObject dbObject = new BasicDBObject();
        dbObject.put("roleId", roleId.getText());
        DBCursor cursor = collection.find(dbObject);
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
            return;

        }
    }
}

