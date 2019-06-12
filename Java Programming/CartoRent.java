
/**
 * Write a description of class CartoRent here.
 * 
 * @author (16033180, Prayash Bikram Shah) 
 * @date (18th Jan 2017)
 */
public class CartoRent extends Car
{
    private String rent_date;
    private String return_date;
    private int admin_fee;
    private int num_days;
    private int daily_rate;
    private int total_acc;
    private boolean loan;

    /**
     * Constructor for objects of class CartoRent
     */
    public CartoRent(String Description,int admin_fee,int daily_rate)
    {
        super(Description);
        this.admin_fee=admin_fee;
        this.daily_rate=daily_rate;
        rent_date = "";
        return_date="";
        num_days=0;
        total_acc=0;
        loan=false;
    }
    
    public int getadmin_fee()
    {
        return admin_fee;
    }
    
    public int getdaily_rate()
    {
        return daily_rate;
    }
    
    public String getrent_date()
    {
      return rent_date;
    }
    
    public String getreturn_date()
    {
       return return_date;
    }
    
    public int getnum_days()
    {
        return num_days;
    }
    
    public int gettotal_acc()
    {
        return total_acc;
    }

    public boolean getloan()
    {
        return loan;
    }
    
    public void setadmin_fee(int admin_fee){
     this.admin_fee=admin_fee;
    }
    
    public void setdaily_rate(int daily_rate){
     this.daily_rate=daily_rate;
    }

    public void rentcar(String CustomerName,String rent_date, String return_date, int days)
    {
        if(loan==true)
        {
            System.out.println("This car is not available as it is already rented in"+rent_date+" for "+num_days+".");
        }
        else
        {
            super.setCustomerName(CustomerName);
            this.rent_date=rent_date;
            this.return_date=return_date;
            num_days=days;
            total_acc=(daily_rate*num_days)+admin_fee;
            loan=true;
        }
    }
    public void returnCar()
    {
        if(loan==false)
        {
            System.out.println("The car is available and the rate for renting this car is Rs."+daily_rate+" per day Rs."+admin_fee+".");
        }
        else
        {
            super.setCustomerName(" ");
            rent_date=" ";
            return_date=" ";
            num_days=0;
            total_acc=0;
            loan=false;
        }
    }
    public void description()
    {
        String s=super.getdescription();
        System.out.println("Description of car: "+s);
        System.out.println("Total Cost: Rs."+total_acc);
    }
    public void displayevery()
    {
        super.display();
        System.out.println("Daily Rate: Rs."+daily_rate);
        System.out.println("Admin Fee: Rs."+admin_fee);
        if(loan==true)
        {
            System.out.println("Rental Date:"+rent_date);
            System.out.println("Return Date:"+return_date);
            System.out.println("Number of Days:"+num_days);
        }
    }
}
