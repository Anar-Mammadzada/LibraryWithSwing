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
public class Author {
    private String name;
    private String surname;
    private int age;
    private String country;

    public Author(String name, String surname, int age, String country) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public void authorDetails(){
        System.out.println("Author's name: "+getName()+"\nAuthor's surname: "+getSurname()+"\nAuthor's age: "+getAge()+
                "\nAuthor's countryName: "+getCountry());
    }
    
}
