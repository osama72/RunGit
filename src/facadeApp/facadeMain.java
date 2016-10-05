/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadeApp;

import Facade.studentMaker;

/**
 *
 * @author aashgar
 */
public class facadeMain {
    public static void main(String[] args) {
        studentMaker amMaker = studentMaker.getMaker();
        amMaker.showENGTStudent();
        amMaker.showITStudent();
    }
    
}
