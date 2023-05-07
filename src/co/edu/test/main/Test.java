
package co.edu.test.main;

import co.edu.test.control.Controller;

public class Test {
    public static void main(String[] args) {
        Controller controller=new  Controller();
        
        controller.SetGender("M");
        controller.setName("pepe");
        
        System.out.println("nombre: " + controller.getName() + " genero: " + controller.getGender());
    }
    
}
