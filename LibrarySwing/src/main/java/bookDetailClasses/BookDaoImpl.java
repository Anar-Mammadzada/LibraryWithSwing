/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookDetailClasses;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Anar
 */
public class BookDaoImpl implements BookDaoInter{
    
    List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book b) {
        books.add(b);
    }

    @Override
    public void deleteBook(int id) {
        books.remove(id);
    }

    @Override
    public void updateBook(int id, Book b) {
        books.set(id, b);
    }

    @Override
    public void showBookDetails() {
        if(books.isEmpty()){
            System.out.println("There is no on the list.");
        }else{
             for(Book b: books){
             b.bookDetails();
        }
        
        }
    }
    
}
