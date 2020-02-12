package LawnCareCompany;

public class Employee{
    private String name;
    private int date;
    private String status;
    private int payRate;
    
    // List of customers
    Customer[] myCustomers;
    

    public Employee(String name,int date,String status, int payrate){
        this.name= name;
        this.date= date;
        this.status= status;
        this.payRate= payrate;
    }
    
}
