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
public class Context {
    public static BookDaoInter instanceBookDao(){
        return new BookDaoImpl();
    }
}
