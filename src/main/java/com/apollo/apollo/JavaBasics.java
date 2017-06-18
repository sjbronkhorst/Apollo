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


//This class explaines basic java syntax, java primitive types and using class variables/class methods


//This is the start of a class called JavaBasics
//the first word "public" is an access modifier, this means this class is available for use to all other classes in the project.
//second word "class" - tells Java we are defining a class.
//third word JavaBasics - name of the class we are creating, it is good practice to start class names with a capital letter and use "CamelCase"
public class JavaBasics {

    //the space between the first open curly bracket "{" and last closed bracket "}" is the scope of the class. If you click just after the open curly bracket Netbeans will highlight the corresponding closed bracket.
    //Only code written inside here is associated with the class.
//Lets define a few *class* variables:
    private static double doubleNumber; // stores double precision numbers - can store decimals
    private static int integerNumber; // stores integers - "whole" numbers only NO DECIMALS
    private static char character; // stores a single character;
    private static boolean trueOrFalse; // stores a boolean value - can be either true or false

    //P.S. It is good practice to start variable names with lowercase and write in camelCase to make them easier to read.
//EXPLANATION: 
    //private - an access modifier, the opposite of "public", now we are saying that these variable can only be accessesed from inside this class (JavaBasics). 
    // if we were to use public, other classes inside the package would have access to the variables and would be able to modify them.
    //static - by using this keyword we specify that the variables are *class* variables (belong to a class not an object - more on objects later)
    //third keyword (double/int/char/boolean) - the primitive data type of the variable. There are more of these primitive types, but these four are the most used.
    //Variables in Java must have a type. Variables cannot store data of other types unless the data is processed in a special way. E.G. a boolean can not store a number
    
    
    //**************************************************************************
    //Lets define a  *class* method:
    //the first word "public" is an access modifier, this means this method is available for use to all other classes in the project.
    //the second word "static" - specify that the method is a *class* method (belongs to a class not an object - more on objects later)
    // third word "void" - this means the method does not return (give us) any data when we call it.
    // Note the EMPTY round brackets after the method name - this method takes nothing as an input. Inputs are usually specified inside these round brackets.
    
    public static void assignValuesToVariables() {
        //the space between the open curly bracket "{" and closed bracket "}" is the scope of the method.
        //Only code written inside here is associated with the method.
        doubleNumber = 3.14159;
        integerNumber = 3;
        character = 'a';
        trueOrFalse = true;

        //Just to see when the method does something I will include a command line print here:
        //P.S. You can type "sout" and then press ctrl + space in Netbeans.
        System.out.println("The method did something . . .");

    }
    
    
    //We now create a main method that will run when we run the class:
    //P.S You can type "psvm" and then press ctrl + space in Netbeans.
    //The name "main" is a special/reserved method name that Java recognizes as the method to run.
    //Ask yourself what the blue modifier keywords tell us about this method?
    //You will notice that the round brackets for the main method arent empty. For now just accept this as standard part of a main method.
      
    public static void main(String[] args) {
        
        //From inside the main method we can access the class variables we created and give them some values:
        //Because our varibales are  class variables, we first call  the class (JavaBasics) and then the relevant variable name 
        //Try to do this from another class -  you will see that you cannot access these variables because they are private.
       
        JavaBasics.doubleNumber = 100;
        JavaBasics.character = 'z';
        JavaBasics.integerNumber = 90;
        JavaBasics.trueOrFalse = false;
        
        //Then print out their values to the command line:
        System.out.println("Original assigned variables : ");
        System.out.println(doubleNumber);
        System.out.println(character);
        System.out.println(integerNumber);
        System.out.println(trueOrFalse);
        
        
        
        //inside this main method we call our class method:
        JavaBasics.assignValuesToVariables();
        //Because our method is a class method, we first call  the class (JavaBasics) and then the method (assignValuesToVariables)
        //Note the empty round brackets.
        //Try to do this from another class -  you will see that you can access this method because it is public.
        
        //Then we will print our variables again:
        System.out.println("Variable values after method call : ");
        System.out.println(doubleNumber);
        System.out.println(character);
        System.out.println(integerNumber);
        System.out.println(trueOrFalse);
        
        //The method we called will change our variables.
        // You can now right click on the class name in the projects view on the left and click run.
        //When you are ready for slightly more advanced topics see the Person class.
        
        
    }
    
   

}
