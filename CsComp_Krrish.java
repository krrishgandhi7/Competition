import java.util.*;
public class CsComp_Krrish
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Hello user, Welcome to our E - Library. Hope you enjoy your time here shopping.");
        
        String name = "";
        System.out.println("\n Please enter your name :-"); //Krrish
        name = sc.nextLine();
        
        System.out.println("\n" +name+ " please enter your age:-"); //18 or 2
        int age = sc.nextInt();
        
        if (age>=18)
        {
            System.out.println("\n" +name+ " you are eligible to read books above the age of 18."+"\n"+ "if you already have an account please sign in, else sign up. Please choose an option from below:-");
        }
        else if (age<18)
        {
            System.out.println("\n" +name+ " you are eligible to read books under the age of 18." +"\n"+ " If you already have an account please sign in, else sign up. Please choose an option from below:-");
        }
        System.out.println("\n1. Press 1 for Sign in\n2. Press 2 for Sign up\n3. Press 3 for Exit"); //1,2,3
        int menu = sc.nextInt();
        switch (menu)
        {
            case 1 : 
                String email = "";
                
                System.out.println("\n" +name+ " please enter your email:-");
                email = sc.next(); //Krrishgandhi06@gmail.com
                
                System.out.println("\n" +name+ " please enter your password (pin format):-");
                int password = sc.nextInt(); //2432424
                
                System.out.println("\n" +name+ " your email and password is valid, please continue with the program."); //program ends
                break;
                
            case 2 :
                String email2 = "";
                
                System.out.println("\n" +name+ " please enter your email:-");
                email2 = sc.next();  //Krrishgandhi06@gmail.com
                
                System.out.println("\n" +name+ " please enter your password (pin format):-");
                int pass = sc.nextInt(); //4432424 (if not same then) 
                
                System.out.println("\n" +name+ " please re - enter your password (pin format):-");
                int pass2 = sc.nextInt(); //4432424 or 32424234
                
                if (pass2 == pass)
                {
                    System.out.println("\n" +name+ " your password meets the rules. please continue with the program."); //program ends
                }
                else if (pass2 != pass)
                {
                    System.out.println("\n" +name+ " your password does not meet the rules. Please re - start the process."); //program ends
                }
                break;
                
            case 3 :
                
                System.out.println("\n" +name+ " your program was terminated."); // if option 3 program ends
                break;
                
            default :
                System.out.println("\n" +name+ " your selected option is invalid, Please choose an option from the given options above."); //program ends
        }
    }
}
