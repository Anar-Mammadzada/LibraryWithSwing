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
public interface BookDaoInter {
    
    public void addBook(Book b);
    
    public void deleteBook(int id);
    
    public void updateBook(int id, Book b);
    
    public void showBookDetails();
}
