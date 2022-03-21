/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookDetailClasses;

/**
 *
 * @author Anar
 */
public class Book {
    private String name;
    private String ISBNnumber;
    private String info;
    private Author author;
    private Publisher publisher;

    public Book(String name, String ISBNnumber, String info, Author author, Publisher publisher) {
        this.name = name;
        this.ISBNnumber = ISBNnumber;
        this.info = info;
        this.author = author;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBNnumber() {
        return ISBNnumber;
    }

    public void setISBNnumber(String ISBNnumber) {
        this.ISBNnumber = ISBNnumber;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

   

    
    
    public void bookDetails(){
        System.out.println("Book name: "+getName()+"\nBook ISBN number: "+getISBNnumber()+"\nBook info: "+getInfo()+
                "\nAuthor name: "+getAuthor().getName()+"\nAuthor surname: "+getAuthor().getSurname()+"\nAuthor age: "+getAuthor().getAge()+
                "\nAuthor country: "+getAuthor().getCountry()+"\nPublisher name: "+getPublisher().getName()+
                "\nPublisher address: "+getPublisher().getAddress()+"\n--------------------------");
    }
}
