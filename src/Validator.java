/**
 Imagine that you have a form on a website that asks users for their age. A user must be over 18 to agree to the website's terms of use. You need to handle situations where users provide bad or invalid data. Follow the instructions below to complete this exercise.

 Instructions

 Create a class named Validator. This class should have a method named validateAge() that accepts a String argument. The validateAge() method is used to validate the age a user provides.

 Ages must be numeric (not "twenty"), integers (not 34.7), over 18, and if greater than 115, the user is assumed to be lying.

 If all of the validations pass then the method returns true.

 If any of the validations fail the method throws an Exception with a message explaining what went wrong:

 Not numeric: Age must be a number.
 Not an integer: Age must be an integer.
 Less than 18: You must be over 18.
 Greater than 115: You appear to be lying about your age.
 You should also create a Main class that uses Scanner to prompt the user
 for their age and then validates the input using the Validator class.
 If the data provided is valid, print a message telling the user that their age was accepted.
 If the data entered is invalid, print out the message that was provided by the Exception.


 * Created by cmitchell on 3/20/17.
 */
//created class validator per instructions
public class Validator {


 //ValidateAge Method including boolean and adding the throw exception
    public boolean validateAge(String string) throws Exception {

// setting age
       int age = 0;
//adding parse going from integer to a string.
         age = Integer.parseInt(string);
//if age is less than 18 an exception will be throw
        if (age < 18) {
            throw new Exception("Get out of here you young buck!");
        }
//if age is greater than 114 exception will be thrown
        if (age > 114) {
            throw new Exception("You don't look like the oldest person in the world!");
        }

//if any decimals are inputed that would mean there is a double. We don't want doubles.
        if (string.contains(".")){
            throw new Exception("No decimals please");
        }
//if the user inputs are true then there will be no exception thrown.
        return true;
    }
}