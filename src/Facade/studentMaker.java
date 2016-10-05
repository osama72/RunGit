package Facade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aashgar
 */
public class studentMaker {
    private static studentMaker aMaker;
    private Student studentIT;
    private Student engStudent;
    private studentMaker (){
        studentIT = new ITStudent();
        engStudent = new ENGStudent();
    }
    
    public static studentMaker getMaker(){
    if(aMaker == null)
        aMaker = new studentMaker();
    return aMaker;
    }
    
    public void viewITStudent(){
        studentIT.show();
    }
    
    public void viewENGTStudent(){
        engStudent.show();
    }
}
