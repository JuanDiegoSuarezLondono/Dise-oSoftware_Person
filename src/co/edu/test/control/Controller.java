
package co.edu.test.control;

import co.edu.test.logic.Person;


public class Controller {
    private Person person;
    
    public  Controller(){
        this.person=new Person();
               
    }
    public void SetGender(String newGender) {
        if (newGender.equalsIgnoreCase("f")) {
            this.person.setGender(true);
            
        }
        this.person.setGender(false);
        
        
    }
    public String getGender(){
        if (this.person.getGender()==true) {
            return "femenino";
            
        }
        return "masculino";
    }
    public void setName(String newName) {
        this.person.setName(newName);
    }
    public String getName(){
        return  this.person.getName();
    }
    
}
