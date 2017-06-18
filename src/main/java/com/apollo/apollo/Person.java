/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apollo.apollo;

/**
 *
 * @author SJ
 */

//This class explaines objects, object variables/methods and non-primitive types


//Create a class person
public class Person {
    
    //Define a few attributes of a person,
    //Lets assume that for our purposes a person only has three attribues:
    private int age; // age is just an integer number. No decimals
    private double weight; //for weight we require a more accurate representation than int
    private String name; //Wait... what? String? 
    // A String is a non-primitive type, it represents a string of characters. That is why String is spelled with a capital S.
    // String is more like the types that we will define ourselves. Having a String type has just become so handy that they (the Java gods) chose to build it into Java.
    
    
    //Note that we dropped the "static" modifier as we are now defining *Object* variables NOT *class* variables.
    
   //Now we define how we will interact with these variables.
   //The usual means of interaction is by using getter and setter methods
   //It is good practice to start a getter methods name with "get" and a setter methods name with "set", but this rule is often followed quite loosely.
   //getter methods get something, and setter methods set something.
   //Lets make a setter method to set a persons name (tell a Person Object what it's name is):
    
    public void setName(String input)
    {
     name = input;  
    }
    //Note the String nameInput in the round brackets. This is  placeholder for the input that we will give the method when we call it.
    
    //Another way to write this method is as follows, but it usually confuses beginners:
    
    public void setName2(String name)
    {
        this.name = name;
    }
    
        //The two methods above perform the exact same function, their names are just different because you can't have two exact same methods in Java.
    //The confusion usually comes in because it looks like we have two String variables with the name "name". 
    //To distinguish between the green "name" at the top of this class and the black input variable "name" we use "this."
    //See that the "name" behind "this." is green - this is the object variable that exists in the scope of the class Person (The String we defined waaay at the top ).
    // the black "name" on the other hand is only a placeholder for the input we will give the method and only exists inside the scope of the "setName2" method.
    // This format for setter methods is often used because it gives a more descriptive suggestion when using the setter method.     
    
    //If it is practical to do so*, methods may have more than one input for example:
       public void setAllAttributes(String name, int age, double weight)
    {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
     //* - For setter methods it usually is not practical, but for this example it is.
  
    
    
  //A getter method just returns (gives us) the value of a variable when we call it. Example:
    
    public String getName()
    {
        return name;
    }

    //Note how we used the "void" keyword for the setter - because it does not return anything.
    //we used "String" when defining the getter to tell Java that the method returns a String. We then HAVE to return a String and not anything else.
    
    //See if you can create setter/getter methods for weight and age. Or even add more attributes to the Person Object and create setters/getters for those.
    //In Netbeans you can auto generate getters and setters: Right Click -> Insert code
    
    //It is usually good to give an Object a "toString" method. We can use this method to quickly print a summary of the object.
    // A "toString" method is just a getter method that returns a String (just like our getName method).
    // All objects actually have a built in "toString" method, but you can't see it here.
    //We will now override that built in "toString" method to make it suit our needs.
    
    @Override
    public String toString()
    {
        return "Name : " + name + " Age : " + age + " Weight : " + weight;
    }
    
    
    //Now lets make some people!!!
    // By defining the Person class we have created a Person Type. We can now create Objects of Type Person and use them.
    
    //create a main method
    public static void main(String[] args)
    {
       // create some Objects of type Person.
        Person pietie = new Person();
        Person jannie = new Person();
        Person sannie = new Person();
        
        //Set their attributes using the getters and setters we created.
        pietie.setAllAttributes("Pietie", 6, 45.43);
        jannie.setAllAttributes("Jannie", 5, 22.3);
        sannie.setAllAttributes("Sannie", 6, 19.4);
        
        
        //Now print a summary of one of our people using their toString method:
        
        System.out.println(pietie.toString());
        
        
        //You don't have to explicitly tell the println method to print the String that the toString method returns. So the following works as well:
        
        System.out.println(sannie);
        
        //Now right click on this class in the package explorer and run.
        
        
        // At this point it would be useful to google "java constructor".
        //Keep in mind that all Objects already have an empty constructor, the default constructor, which was called when we said "new Person()"
    }
}


