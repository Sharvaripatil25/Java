
class Bank{
    public String bankName;
    public String branchCode;
    Bank(String bankName,String branchCode){
        this.bankName=bankName;
        this.branchCode=branchCode;
    }
    public void displayBankDetails(){
        System.out.println("Bank Name: "+bankName);
        System.out.println("Branch Code: "+branchCode);
    }
}
class Customer extends Bank{
    private static String branchCode;
    private static String bankName;
    String customerName;
    String accountNumber;
    Customer(String customerName,String accountNumber){
        super(bankName,branchCode);
        this.customerName=customerName;
        this.accountNumber=accountNumber;
    }
    public void displayCustomerDetails(){
        System.out.println("Customer name: "+ customerName);
        System.out.println("Account Number:" +accountNumber);
    }
}

class Employee extends Bank{
    private static String bankName;
    private static String branchCode;
    String employeeName;
    String employeeId;
    Employee(String employeeName,String employeeId){
        super(bankName,branchCode);
        this.employeeName=employeeName;
        this.employeeId=employeeId;
    }
    public void displayEmployeeDetails(){
        System.out.println("Employee Name:" +employeeName);
        System.out.println("Employee Id : "+employeeId);
    }

}

public class Test {
    public static void main(String[] args) {
        Bank B=new Bank("Axis Bank","abcs");
        B.displayBankDetails();
        Customer C=new Customer("Sharvari","123456");
        C.displayCustomerDetails();
        Employee E=new Employee("Jhon","1345");
        E.displayEmployeeDetails();
    }
}
