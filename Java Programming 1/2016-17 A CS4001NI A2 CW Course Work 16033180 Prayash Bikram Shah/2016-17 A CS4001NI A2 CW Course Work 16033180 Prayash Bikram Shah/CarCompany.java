/**
 * Write a description of class CarCompany here.
 * 
 * @author (16033180, Prayash Bikram Shah) 
 * @date (05th Apr 2017)
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Arrays;

public class CarCompany implements ActionListener {
    JFrame FRAME;
    JLabel label;
    
    private String description;
    private String name;
    private String dateofrent;
    private String dateofreturn;
    private int Price;
    private int Year;
    private int mileage;
    private int fee;
    private int rate;
    private int days;
    private int number;
    private int size;
    
    JTextField textfieldPrice;
    JTextField textfieldYear;
    JTextField textfieldmileage;
    JTextField textfielddescription;
    JTextField textfieldfee;
    JTextField textfieldrate;
    JTextField textfieldname;
    JTextField textfielddate;
    JTextField textfieldrdate;
    JTextField textfieldday;
    JTextField textfieldcar;
    
    JLabel labelPrice;
    JLabel labelYear;
    JLabel labelmileage;
    JLabel labeldescription;
    JLabel labelfee;
    JLabel labelrate;
    JLabel labelname;
    JLabel labeldate;
    JLabel labelrdate;
    JLabel labelday;
    JLabel labelCar;
    
    JButton buttoncartobuy;
    JButton buttoncartorent;
    JButton buttonbuycar;
    JButton buttonrentcar;
    JButton buttonreturncar;
    JButton buttondisplay;
    JButton buttonclear;
    
    ArrayList<Car> VechileList;
    
    public CarCompany(){
        FRAME = new JFrame("CarCompany");
        VechileList = new ArrayList<>();
        
        buttoncartobuy = new JButton("Add Car To Buy");
        buttoncartobuy.addActionListener(this);
        buttoncartobuy.setBounds(225,30,150,30);
        buttoncartobuy.setBackground(Color.ORANGE);
        FRAME.add(buttoncartobuy);

        labelPrice = new JLabel("Price:");
        labelPrice.setBounds(5,70,100,30);
        labelPrice.setForeground(Color.BLACK);
        FRAME.add(labelPrice);
        
        textfieldPrice = new JTextField();
        textfieldPrice.setBounds(5,100,100,30);
        FRAME.add(textfieldPrice);
        
        labelYear = new JLabel("Year Of Registration:");
        labelYear.setBounds(110,70,150,30);
        labelYear.setForeground(Color.BLACK);
        FRAME.add(labelYear);
        
        textfieldYear = new JTextField();
        textfieldYear.setBounds(110,100,180,30);
        FRAME.add(textfieldYear);
        
        labelmileage = new JLabel("Mileage:");
        labelmileage.setBounds(295,70,100,30);
        labelmileage.setForeground(Color.BLACK);
        FRAME.add(labelmileage);
        
        textfieldmileage = new JTextField();
        textfieldmileage.setBounds(295,100,100,30);
        FRAME.add(textfieldmileage);
        
        labeldescription = new JLabel("Description:");
        labeldescription.setBounds(400,70,100,30);
        labeldescription.setForeground(Color.BLACK);
        FRAME.add(labeldescription);
        
        textfielddescription = new JTextField();
        textfielddescription.setBounds(400,100,150,30);
        FRAME.add(textfielddescription);
        
        labelfee = new JLabel("Admin Fee:");
        labelfee.setBounds(555,70,100,30);
        labelfee.setForeground(Color.BLACK);
        FRAME.add(labelfee);
        
        textfieldfee = new JTextField();
        textfieldfee.setBounds(555,100,100,30);
        FRAME.add(textfieldfee);
        
        labelrate = new JLabel("Daily Rate:");
        labelrate.setBounds(660,70,100,30);
        labelrate.setForeground(Color.BLACK);
        FRAME.add(labelrate);
        
        textfieldrate = new JTextField();
        textfieldrate.setBounds(660,100,150,30);
        FRAME.add(textfieldrate);
        
        buttoncartorent = new JButton("Add Car To Rent");
        buttoncartorent.addActionListener(this);
        buttoncartorent.setBounds(385,30,150,30);
        buttoncartorent.setBackground(Color.ORANGE);
        FRAME.add(buttoncartorent);
        
        labelname = new JLabel("Customer Name:");
        labelname.setBounds(60,140,150,30);
        labelname.setForeground(Color.BLACK);
        FRAME.add(labelname);
        
        textfieldname = new JTextField();
        textfieldname.setBounds(60,170,150,30);
        FRAME.add(textfieldname);
        
        labeldate = new JLabel("Rental Date:");
        labeldate.setBounds(215,140,100,30);
        labeldate.setForeground(Color.BLACK);
        FRAME.add(labeldate);
        
        textfielddate = new JTextField();
        textfielddate.setBounds(215,170,100,30);
        FRAME.add(textfielddate);
        
        labelrdate = new JLabel("Return Date:");
        labelrdate.setBounds(320,140,100,30);
        labelrdate.setForeground(Color.BLACK);
        FRAME.add(labelrdate);
        
        textfieldrdate = new JTextField();
        textfieldrdate.setBounds(320,170,100,30);
        FRAME.add(textfieldrdate);
        
        labelday = new JLabel("Number of days:");
        labelday.setBounds(425,140,150,30);
        labelday.setForeground(Color.BLACK);
        FRAME.add(labelday);
        
        textfieldday = new JTextField();
        textfieldday.setBounds(425,170,150,30);
        FRAME.add(textfieldday);
        
        labelCar = new JLabel("Car Number:");
        labelCar.setBounds(580,140,100,30);
        labelCar.setForeground(Color.BLACK);
        FRAME.add(labelCar);
        
        textfieldcar = new JTextField();
        textfieldcar.setBounds(580,170,120,30);
        FRAME.add(textfieldcar);
        
        buttonbuycar = new JButton("Buy Car");
        buttonbuycar.addActionListener(this);
        buttonbuycar.setBounds(225,220,150,30);
        buttonbuycar.setBackground(Color.ORANGE);
        FRAME.add(buttonbuycar);
        
        buttonrentcar = new JButton("Rent Car");
        buttonrentcar.addActionListener(this);
        buttonrentcar.setBounds(385,220,150,30);
        buttonrentcar.setBackground(Color.ORANGE);
        FRAME.add(buttonrentcar);
        
        buttonreturncar = new JButton("Return Car");
        buttonreturncar.addActionListener(this);
        buttonreturncar.setBounds(170,260,150,30);
        buttonreturncar.setBackground(Color.ORANGE);
        FRAME.add(buttonreturncar);
        
        buttondisplay = new JButton("Display All");
        buttondisplay.addActionListener(this);
        buttondisplay.setBounds(330,260,150,30);
        buttondisplay.setBackground(Color.ORANGE);
        FRAME.add(buttondisplay);
        
        buttonclear = new JButton("Clear");
        buttonclear.setBounds(490,260,100,30);
        buttonclear.addActionListener(this);
        buttonclear.setBackground(Color.ORANGE);
        FRAME.add(buttonclear);
        
        FRAME.setLayout(null);
        FRAME.setSize(800,700);
        FRAME.setVisible(true);
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FRAME.getContentPane().setBackground(Color.BLUE);

   }
    public static void main(String[] args){
        new CarCompany();
   }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttoncartobuy){
            cartobuy();
        }
        else if (e.getSource() == buttoncartorent){
            cartorent();
        }
        else if (e.getSource() == buttonbuycar){
            carTobuy();
        }
        else if (e.getSource() == buttonrentcar){
            rentcar();
        }
        else if (e.getSource() == buttonreturncar){
            returncar();
        }
        else if (e.getSource() == buttondisplay){
            display();
        }
        else if (e.getSource() == buttonclear){
            clear();
        }
   }    
    public void cartobuy(){
        try{
            String description = textfielddescription.getText();
            int Price = Integer.parseInt(textfieldPrice.getText());
            int Year = Integer.parseInt(textfieldYear.getText());
            int mileage = Integer.parseInt(textfieldmileage.getText());
            
            if(Price !=0 && Year !=0 && mileage !=0 && !description.isEmpty()){
                VechileList.add(new CartoBuy(description,Price,Year,mileage));
                JOptionPane.showMessageDialog(FRAME,
                "Values Inserted.",
                "Success Message.",
                JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(FRAME,
                "Check entered values.",
                "Error Message.",
                JOptionPane.ERROR_MESSAGE);
            }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(FRAME,
            "Check entered values.",
            "Error Message.",
            JOptionPane.ERROR_MESSAGE);
        }
   }
   public void cartorent(){
        try{ 
        String description = textfielddescription.getText();
        int fee = Integer.parseInt(textfieldfee.getText());
        int rate = Integer.parseInt(textfieldrate.getText());
        
        if(fee !=0 && rate !=0 && !description.isEmpty()){
            VechileList.add(new CartoRent(description,fee,rate));
            JOptionPane.showMessageDialog(FRAME,
            "Values Inserted.",
            "Success Message.",
            JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(FRAME,
            "Check Your Entry",
            "Error Message",
            JOptionPane.ERROR_MESSAGE);
        }
        }
        catch (NumberFormatException nfe){
        JOptionPane.showMessageDialog(FRAME,
        "Check Your Entry",
        "Error Message",
        JOptionPane.ERROR_MESSAGE);
       }
   }
   public int getCarNumber(){
        int number = 0;
        int size = VechileList.size();
        try{
            number = Integer.parseInt(textfieldcar.getText());
            if (number >=0 && number < size){
                return number;
            } else{
                JOptionPane.showMessageDialog(FRAME,
                "Invalid Car Number",
                "Error Message.",
                JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(FRAME,
            "Invalid Entry",
            "Error Message.",
            JOptionPane.ERROR_MESSAGE);
        }
        return 0;
   }
   public void carTobuy(){
    String name = textfieldname.getText();
    if (VechileList.get(getCarNumber()) instanceof CartoBuy) {
        CartoBuy carTobuy = (CartoBuy) VechileList.get(getCarNumber());
        carTobuy.CartoBuy(name);
        }
    }
   public void rentcar(){
        
         String name = textfieldname.getText();
         String dateofrent = textfielddate.getText();
         String dateofreturn = textfieldrdate.getText();
         int days = Integer.parseInt(textfieldday.getText());
            if (VechileList.get(getCarNumber()) instanceof CartoRent){
               CartoRent carTorent = (CartoRent) VechileList.get(getCarNumber());
               carTorent.rentcar(name,dateofrent,dateofreturn,days);
              }else{
                JOptionPane.showMessageDialog(FRAME,
                "Check entered values.",
                "Error Message.",
                JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(FRAME,
                "You Successfully rented the car.",
                "Success Message.",
                JOptionPane.INFORMATION_MESSAGE);

        }
   public void returncar(){
    if(VechileList.get(getCarNumber()) instanceof CartoRent){
        CartoRent carTorent = (CartoRent) VechileList.get(getCarNumber());
        carTorent.returnCar();
    }
   }
   public void display(){
    for(Car cars : VechileList){
        System.out.println("Car Number: " + VechileList.indexOf(cars));
        if(cars instanceof CartoRent){
            CartoRent cartorent = (CartoRent)cars;
            cartorent.display();
        }
        if(cars instanceof CartoBuy){
            CartoBuy cartobuy = (CartoBuy)cars;
            cartobuy.display();
        }
    }
   }
   public void clear(){
    textfieldcar.setText("");
    textfieldday.setText("");
    textfieldrdate.setText("");
    textfielddate.setText("");
    textfieldname.setText("");
    textfieldrate.setText("");
    textfieldfee.setText("");
    textfieldmileage.setText("");
    textfielddescription.setText("");
    textfieldPrice.setText("");
    textfieldYear.setText("");;
    }
}
