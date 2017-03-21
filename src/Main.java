import java.util.Scanner;

/**
 * Created by cmitchell on 3/20/17.
 */
//setting main classs
public class Main {
//setting method  not to return and String
    public static void main(String[] args) {

//setting up the scanner
        Scanner scanner = new Scanner(System.in);
   //setting the new validator which i'm calling verify
        Validator verify = new Validator();
        //setting the print line to Please enter an age:
        System.out.println("Please enter an age: ");
        //
        String input = scanner.nextLine();
        //parse change type
        try {
            //trying to throw exception and giving the string if it passes as ookie dokie
           //double parse
            Double.parseDouble(input);
            if(verify.validateAge(input)){
                System.out.println("This is ookie dokie");
            }

        }
        catch(NumberFormatException rules){
            System.out.println("This is not a number");

        }

        catch(Exception play){

            System.out.println(play.getMessage());
        }

    }



}
