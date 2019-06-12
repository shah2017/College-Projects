/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuis;

/**
 *
 * @author Shah
 */
import java.awt.*;
import static java.awt.PageAttributes.ColorType.COLOR;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

public class MenuInfo implements ActionListener {

    JFrame Frame;
    private JLabel labelName;
    private JLabel labelISBN;
    private JLabel labelGenre;
    private JLabel labelYear;
    private JLabel labelEdition;
    private JLabel labelAvailable;
    private JLabel labelSearch;

    private JTextField txtName;
    private JTextField txtISBN;
    private JTextField txtGenre;
    private JTextField txtYear;
    private JTextField txtSearch;

    private JComboBox cmbEdition;

    private JRadioButton radYes;
    private JRadioButton radNo;

    private JButton btnAddToTable;
    private JButton btnClear;
    private JButton btnRemove;
    private JButton btnExit;
    private JButton btnSearch;

    private JTable Table;

    private JScrollPane Pane;

    private JPanel panTextField;
    private JPanel panButtons;
    private JPanel panSearch;

    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenuItem menuOpen;
    private JMenu menuHelp;

    private DefaultTableModel model;

    private ArrayList<Pustaks> BookList;

    public MenuInfo() {
        Frame = new JFrame("Pustakalaya System");
        Frame.setSize(950, 600);
        Frame.setBackground(Color.red);
        Frame.setLayout(null);

        menuBar = new JMenuBar();
        Frame.setJMenuBar(menuBar);

        menuFile = new JMenu("File");
        menuBar.add(menuFile);

        menuOpen = new JMenuItem("Open");
        menuOpen.addActionListener(this);
        menuFile.add(menuOpen);

        menuHelp = new JMenu("Help");
        menuBar.add(menuHelp);

        panTextField = new JPanel();
        panTextField.setBounds(10, 230, 385, 265);
        panTextField.setBorder(BorderFactory.createLoweredBevelBorder());;
        panTextField.setLayout(null);
        Frame.add(panTextField);

        labelName = new JLabel("Name: ");
        labelName.setBounds(15, 10, 84, 25);
        labelName.setFont(new Font("Tahoma", Font.PLAIN, 17));
        panTextField.add(labelName);

        labelISBN = new JLabel("ISBN Number: ");
        labelISBN.setBounds(15, 50, 120, 25);
        labelISBN.setFont(new Font("Tahoma", Font.PLAIN, 17));
        panTextField.add(labelISBN);

        labelGenre = new JLabel("Genre: ");
        labelGenre.setBounds(15, 90, 120, 25);
        labelGenre.setFont(new Font("Tahoma", Font.PLAIN, 17));
        panTextField.add(labelGenre);

        labelYear = new JLabel("Year: ");
        labelYear.setBounds(15, 130, 120, 25);
        labelYear.setFont(new Font("Tahoma", Font.PLAIN, 17));
        panTextField.add(labelYear);

        labelEdition = new JLabel("Edition: ");
        labelEdition.setBounds(15, 170, 120, 25);
        labelEdition.setFont(new Font("Tahoma", Font.PLAIN, 17));
        panTextField.add(labelEdition);

        txtName = new JTextField();
        txtName.setBounds(180, 10, 160, 27);
        panTextField.add(txtName);

        txtISBN = new JTextField();
        txtISBN.setBounds(180, 50, 160, 27);
        panTextField.add(txtISBN);

        txtGenre = new JTextField();
        txtGenre.setBounds(180, 90, 160, 27);
        panTextField.add(txtGenre);

        txtYear = new JTextField();
        txtYear.setBounds(180, 130, 160, 27);
        panTextField.add(txtYear);

        cmbEdition = new JComboBox();
        cmbEdition.setBounds(180, 170, 160, 27);
        cmbEdition.setBackground(Color.decode("#dedddc"));
        panTextField.add(cmbEdition);

        cmbEdition.addItem("1st Edition");
        cmbEdition.addItem("2nd Edition");
        cmbEdition.addItem("3rd Edition");
        cmbEdition.addItem("4th Edition");

        radYes = new JRadioButton("Yes");
        radYes.setBounds(180, 210, 60, 20);
        panTextField.add(radYes);

        radNo = new JRadioButton("No");
        radNo.setBounds(250, 210, 60, 20);
        panTextField.add(radNo);

        ButtonGroup radBG = new ButtonGroup();
        radBG.add(radYes);
        radBG.add(radNo);
        radYes.setSelected(true);

        labelAvailable = new JLabel("Available: ");
        labelAvailable.setBounds(15, 210, 120, 25);
        labelAvailable.setFont(new Font("Tahoma", Font.PLAIN, 17));
        panTextField.add(labelAvailable);

        panButtons = new JPanel();
        panButtons.setBounds(405, 230, 250, 190);
        panButtons.setBorder(BorderFactory.createLoweredBevelBorder());
        panButtons.setLayout(null);
        Frame.add(panButtons);

        btnAddToTable = new JButton("Add To Table");
        btnAddToTable.addActionListener(this);
        btnAddToTable.setBounds(50, 10, 160, 30);
        btnAddToTable.setBackground(Color.decode("#dedddc"));
        panButtons.add(btnAddToTable);

        btnRemove = new JButton("Remove");
        btnRemove.addActionListener(this);
        btnRemove.setBounds(50, 50, 160, 30);
        btnRemove.setBackground(Color.decode("#dedddc"));
        panButtons.add(btnRemove);

        btnClear = new JButton("clear");
        btnClear.setBounds(50, 90, 160, 30);
        btnClear.addActionListener(this);
        btnClear.setBackground(Color.decode("#dedddc"));
        panButtons.add(btnClear);

        btnExit = new JButton("Exit");
        btnExit.addActionListener(this);
        btnExit.setBounds(50, 130, 160, 30);
        btnExit.setBackground(Color.decode("#dedddc"));
        panButtons.add(btnExit);

        panSearch = new JPanel();
        panSearch.setBounds(665, 230, 255, 100);
        panSearch.setLayout(null);
        panSearch.setBorder(BorderFactory.createLoweredBevelBorder());
        Frame.add(panSearch);

        labelSearch = new JLabel("Search: ");
        labelSearch.setBounds(10, 10, 120, 25);
        labelSearch.setFont(new Font("Tahoma", Font.PLAIN, 17));
        panSearch.add(labelSearch);

        txtSearch = new JTextField();
        txtSearch.setBounds(80, 10, 160, 27);
        panSearch.add(txtSearch);

        btnSearch = new JButton("Search");
        btnSearch.addActionListener(this);
        btnSearch.setBounds(80, 45, 160, 30);
        btnSearch.setBackground(Color.decode("#dedddc"));
        panSearch.add(btnSearch);
        BookList = new ArrayList();

        String Columns[] = {"Name", "ISBN No.", "Genre", "Year", "Edition", "Available"};

        model = new DefaultTableModel(new Object[][]{}, Columns);
        Table = new JTable(model);
        JScrollPane Pane = new JScrollPane(Table);
        Pane.setBounds(10, 20, 913, 200);
        Pane.setBackground(Color.decode("#dedddc"));
        Frame.add(Pane);

        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new MenuInfo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAddToTable) {
            AddToTable();
        } else if (e.getSource() == btnRemove) {
            Remove();
        } else if (e.getSource() == btnClear) {
            Clear();
        } else if (e.getSource() == btnExit) {
            Exit();
        } else if (e.getSource() == btnSearch) {

            int ISBN = Integer.parseInt(txtSearch.getText());

            Search(ISBN);
        } else if (e.getSource() == menuOpen) {
            Open();
        }
    }

    public void AddToTable() {
       try {
            String Name = txtName.getText();
            int ISBN = 0;
            ISBN = Integer.parseInt(txtISBN.getText());
            String Genre = txtGenre.getText();
            int Year = 0;
            Year = Integer.parseInt(txtYear.getText());
            String Edition = cmbEdition.getSelectedItem().toString();
            String Available = "";
            if (radYes.isSelected()) {
                Available = radYes.getText();
            } else if (radNo.isSelected()) {
                Available = radNo.getText();
            }

                Object[] value = {Name, txtISBN.getText(), Genre, txtYear.getText(), Edition, Available};
                model.addRow(value);
                Pustaks pustak = new Pustaks(Name, ISBN, Genre, Year, Edition, Available);
                BookList.add(pustak);

       } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error!!! Enter values");
        }

    }

    public void Remove() {
//       model.setRowCount(0);
        int selectRow = Table.getSelectedRow();
        model.removeRow(selectRow);
    }

    public void Open() {
        if (Desktop.isDesktopSupported()) {
            //opens file inside src and inside file help.pdf
                File file = new File("src/files/help.pdf");
                Desktop openAbout = Desktop.getDesktop();
                if (file.exists()) {
                    try {
                        openAbout.open(file);
                    } catch (IOException ex) {
                        
                    }
                }else{
                    JOptionPane.showMessageDialog(Frame, "", "", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(Frame, "", "", JOptionPane.ERROR);
            }
//
//        try {
//            Runtime.getRuntime().exec(new String[]{"/usr/bin/open", "Users/Shah/Desktop/Coursework.docx"});
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error");
//        }
    }

    public static ArrayList<Pustaks> sortArrays(ArrayList<Pustaks> books) {
     int index = -1;
     for (int a = 0; a < books.size() - 1; a++) {
            index = a;
            for (int b = a + 1; b < books.size(); b++) {
                if (books.get(a).getISBN() > books.get(b).getISBN()) {
                    index = b;
                }
            }
            Pustaks tempPustak = books.get(a);
            books.set(a, books.get(index));
            books.set(index, tempPustak);
        }
        return books;
    }

    public Pustaks getPustaks(int ISBN) {
        int index= 0;
        int mindex = BookList.size() - 1;
        BookList = sortArrays(BookList);
        while (index<=mindex) {
            int midIndex=(index + mindex)/2;
            int tempISBN=0;
            tempISBN=BookList.get(midIndex).getISBN();
            if (tempISBN==ISBN) {
                return BookList.get(midIndex);
            } else if (tempISBN < ISBN) {
                index= midIndex + 1;
            } else if (tempISBN > ISBN) {
                mindex =midIndex - 1;
            }
        }
        return null;
    }

    public void Exit() {
        System.exit(0);
    }

    public void Search(int ISBN) {

        model.setRowCount(0);
        Pustaks tempPustakList = getPustaks(ISBN);
        Object obj[] = {tempPustakList.getName(), tempPustakList.getISBN(), 
            tempPustakList.getGenre(), tempPustakList.getYear(), tempPustakList.getEdition(),tempPustakList.getAvailable()};
        model.addRow(obj);
    }

    public void Clear() {
        txtName.setText("");
        txtGenre.setText("");
        txtYear.setText("");
        txtISBN.setText("");
        txtSearch.setText("");
        radYes.setSelected(true);
        cmbEdition.setSelectedItem("");
    }

}