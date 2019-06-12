/**
 * Write a description of class Car here.
 * 
 * @author (16033180, Prayash Bikram Shah) 
 * @date (05th Apr 2017)
 */
public class Car
{
    String CustomerName;
    private String description;

    /**
     * Constructor for objects of class Car
     */
    public Car(String description)
    {
        CustomerName = "";
        this.description=description; 
        
    }
    
    public void setCustomerName(String CustomerName){
        this.CustomerName=CustomerName;
    }

    public String getCustomerName(){
        return CustomerName;
    }
    
    public String getdescription(){
        return description;
    }
    
    public void display(){
        System.out.println("Car Description :"+ description);
        if (CustomerName.trim().equals(""))
        {
            System.out.println(" ");
        }
        else
        {
            System.out.println("Client's Name: " + CustomerName);
        }
    }
}