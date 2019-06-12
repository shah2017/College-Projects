
/**
 * Write a description of class CartoBuy here.
 * 
 * @author (16033180, Prayash Bikram Shah) 
 * @date (18th Jan 2017)
 */
public class CartoBuy extends Car
{
    
    private int price;
    private int reg_year;
    private int mlg;
    private boolean sold ;

    public CartoBuy(String desc,int price,int reg_year,int mlg)
    {
       super(desc);
       this.price=price;
       this.reg_year=reg_year;
       this.mlg=mlg;
       sold=false;
    }

    public int getprice()
    {
       return price;
    }
    public int getreg_year()
    {
       return reg_year;
    }
    public int getmlg()
    {
    return mlg;
    }
    public boolean getsold(){
    return sold;
    }
public void setprice(int cost)
    {
        if (sold==true)
        {
            System.out.println("Car is already sold" +price+". Car pric not negotiable.");
        }
        else
        {
            price=cost;
        }
}
public void  CartoBuy(String CustomerName)
{
    if (sold==true)
    {
        System.out.println("The Car is no longer available.");
    }
    else
    {
        super.setCustomerName(CustomerName);
        sold=true;
    }
}
public void display()
{
    super.display();
    if(sold==false)
    {
        System.out.println("Car Cost:"+price);
        System.out.println("Registration Year:"+reg_year);
        System.out.println("Mileage:"+mlg);
    }
}
}