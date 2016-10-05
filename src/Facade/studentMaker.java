/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author aashgar
 */
public class studentMaker {
    private static studentMaker aMaker;
    private Student itStudent;
    private Student engStudent;
    private studentMaker (){
        itStudent = new ITStudent();
        engStudent = new ENGStudent();
    }
    
    public static studentMaker getMaker(){
    if(aMaker == null)
        aMaker = new studentMaker();
    return aMaker;
    }
    
    public void showITStudent(){
        itStudent.show();
    }
    
    public void showENGTStudent(){
        engStudent.show();
    }
}
