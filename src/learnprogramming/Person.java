package learnprogramming;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Person {

    public String firstName;
    public String lastName;
    public int age;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }


    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age) { this.age = age;}

    public String getFirstName() {return firstName; }
    public String getLastName() {return lastName; }
    public int getAge(){return age;}
}
