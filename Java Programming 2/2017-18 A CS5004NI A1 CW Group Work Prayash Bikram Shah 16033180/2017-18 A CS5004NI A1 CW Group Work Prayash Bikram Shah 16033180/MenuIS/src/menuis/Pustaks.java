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
public class Pustaks {
    private String name;
    private int ISBN;
    private String genre;
    private int year;
    private String edition;
    private String available;
    public Pustaks(String name, int ISBN, String genre, int year, String edition, String available) {
        this.name = name;
        this.ISBN = ISBN;
        this.genre = genre;
        this.year = year;
        this.edition = edition;
        this.available = available;
    }
    public Pustaks() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAvailable() {
        return available;
    }
    public void setAvailable(String available) {
        this.available = available;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getEdition() {
        return edition;
    }
    public void setEdition(String edition) {
        this.edition = edition;
    }      
}
