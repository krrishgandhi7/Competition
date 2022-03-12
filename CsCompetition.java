import java.util.*;
public class CsCompetition
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Hello user, Welcome to our E - Library. Hope you enjoy your time here shopping.");
        
        String name = "";
        System.out.println("\nPlease enter your name :-"); //Krrish
        name = sc.nextLine();
        
        System.out.println("\n" +name+ " please enter your age:-"); //18 or 2
        int age = sc.nextInt();
        
        if (age>=18)
        {
            System.out.println("\n" +name+ " you are eligible to read books above the age of 18."+"\n"+ "If you already have an account please sign in, else sign up. Please choose an option from below:-");
        }
        else if (age<18)
        {
            System.out.println("\n" +name+ " you are eligible to read books under the age of 18." +"\n"+ "If you already have an account please sign in, else sign up. Please choose an option from below:-");
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
                    System.out.println("\n" +name+ " your password meets the rules. Please continue with the program."); //program ends
                }
                else if (pass2 != pass)
                {
                    System.out.println("\n" +name+ " your password does not meet the rules. Please re - start the process."); //program ends
                }
                break;
                
            case 3 :
                
                System.out.println("\n" +name+ " your program was terminated."); // if option 3 program ends
                System.exit(0);
                
            default :
                System.out.println("\n" +name+ " your selected option is invalid, Please choose an option from the given options above."); //program ends
        }              
            String book [] = new String [53];
        
        book[1]= "Beloved                                                    Toni Morrison";
        book[2]= "The Bluest Eye                                              Toni Morrison";
        book[3]= "Song of Solomon                                             Toni Morrison";
        book[4]= "Hard Times                                                 Charles Dickens";
        book[5]= "Oliver Twist                                                Charles Dickens";
        book[6]= "Great Expectations                                          Charles Dickens";
        book[7]= "David Copperfield                                           Charles Dickens";
        book[8]= "A Tale of Two Cities                                        Charles Dickens";
        book[9]= "It                                                          Stephen King";
        book[10]= "The Shining                                                Stephen King";
        book[11]= "The Stand                                                  Stephen King";  
        book[12]= "Harry Potter Books Set                                     JK Rowling";
        book[13]= "Fantastic Beasts and Where to Find Them                    JK Rowling";
        book[14]= "The Adventures of Tom Sawyer                               Mark Twain";
        book[15]= "The Adventures of Huckleberry Finn                         Mark Twain";
        book[16]= "Nineteen Eighty-Four                                       George Orwell";
        book[17]= "Animal Farm                                                George Orwell";
        book[18]= "Homage to Catalonia                                        George Orwell";
        book[19]= "The Great Gatsby                                           F. Scott Fitzgerald";
        book[20]= "The Curious Case of Benjamin Button                        F. Scott Fitzgerald";
        book[21]= "Five Little Pigs                                           Agatha Christie";
        book[22]= "A Murder is Announced                                      Agatha Christie";
        book[23]= "Murder on the Orient Express                               Agatha Christie";
        book[24]= "The ABC Murders                                            Agatha Christie";
        book[25]= "To Kill a Mockingbird                                      Harper Lee";
        book[26]= "Go Set a Watchman                                          Harper Lee";
        book[27]= "Emma                                                       Jane Austen";
        book[28]= "Pride and Prejudice                                        Jane Austen";
        book[29]= "Sense and Sensibility                                      Jane Austen";
        book[30]= "The Complete Adventures of Sherlock Holmes                 Arthur Conan Doyle";
        book[31]= "A Study in Scarlet                                         Arthur Conan Doyle";
        book[32]= "The Hound of the Baskervilles                              Arthur Conan Doyle";
        book[33]= "Charlie and the Chocolate Factory                          Roald Dahl";
        book[34]= "Matilda                                                    Roald Dahl";
        book[35]= "The BFG                                                    Roald Dahl";
        book[36]= "Macbeth                                                    William Shakespeare";
        book[37]= "Romeo and Juliet                                           William Shakespeare";
        book[38]= "The Tempest                                                William Shakespeare";
        book[39]= "Hamlet                                                     William Shakespeare";
        book[40]= "I Know Why the Caged Bird Sings                            Maya Angelou";
        book[41]= "Compilation of Poems                                       Maya Angelou";
        book[42]= "A Space Odyssey Series                                     Arthur C Clarke";
        book[43]= "The Sentinel                                               Arthur C Clarke";
        book[44]= "Childhood's End                                            Arthur C Clarke";
        book[45]= "A Short History of Nearly Everything                       Bill Bryson";
        book[46]= "Down Under                                                 Bill Bryson";
        book[47]= "Notes From a Small Island                                  Bill Bryson";
        book[48]= "The Body: A Guide for Occupants                            Bill Bryson";
        book[49]= "Jeeves in the Offing                                       P.G. Wodehouse";
        book[50]= "Carry on, Jeeves                                           P.G. Wodehouse";
        book[51]= "The Code of the Woosters                                   P.G. Wodehouse";
    
        int p [] = new int[53];
        
        p[1] = 350;
        p[2] = 400;
        p[3] = 375;
        p[4] = 299;
        p[5] = 250;
        p[6] = 300;
        p[7] = 250;
        p[8] = 1200;
        p[9] = 500;
        p[10] = 400;
        p[11] = 400;
        p[12] = 350;
        p[13] = 349;
        p[14] = 250;
        p[15] = 300;
        p[16] = 375;
        p[17] = 275;
        p[18] = 299;
        p[19] = 300;
        p[20] = 400;
        p[21] = 375;
        p[22] = 275;
        p[23] = 250;
        p[24] = 225;
        p[25] = 349;
        p[26] = 400;
        p[27] = 375;
        p[28] = 299;
        p[29] = 299;
        p[30] = 375;
        p[31] = 1080;
        p[32] = 300;
        p[33] = 375;
        p[34] = 399;
        p[35] = 299;
        p[36] = 250;
        p[37] = 450;
        p[38] = 350;
        p[39] = 200;
        p[40] = 275;
        p[41] = 225;
        p[42] = 375;
        p[43] = 300;
        p[44] = 340;
        p[45] = 550;
        p[46] = 450;
        p[47] = 450;
        p[48] = 450;
        p[49] = 450;
        p[50] = 250;
        p[51] = 350;
        
        System.out.println("\n\nHOME - \n\n1. MENU\n2. CHECKOUT\n3. EXIT");
        System.out.println("\n"+name+ " enter your choice :-  ");
        int choice = sc.nextInt(); 
        int ch2 = 0 ;
        int total = 0;
        int c = 0;
        int n = 0;
        int y = 0;
        
        switch(choice)
        {
            case 1: 
                
                System.out.println("MENU :- \n\n1. Bestselling\n2. Recommendations\n3. New Arrivals ");
                System.out.println("\n" +name+ " enter your choice :-");
                int choice1 = sc.nextInt();
                
                
                 
                System.out.println("4. Fiction\n5. Non-Fiction\n6. List\n7. Exit ");
                System.out.println("\n" +name+ " enter your choice :-");
                ch2 = sc.nextInt();        
                switch(choice1) 
            {
              
        
            
                    
                    case 1 :
                        
                        System.out.println("\nBest selling :-\n\n");
                        System.out.println("NAME :-                                                        AUTHOR :-                        PRICE :-");
                        System.out.println("1. "+book[1]+"                   "+" Rs. "+p[1]);
                        System.out.println("2. "+book[12]+"                      "+" Rs. "+p[12]);
                        System.out.println("3. "+book[17]+"                   "+" Rs. "+p[17]);
                        System.out.println("4. "+book[19]+"             "+" Rs. "+p[19]);
                        System.out.println("5. "+book[23]+"                 "+" Rs. "+p[23]);
                        System.out.println("6. "+book[40]+"                    "+" Rs. "+p[40]);
                        System.out.println("7. "+book[46]+"                     "+" Rs. "+p[46]);   
                        
                        y = 0;
                System.out.println("\n" +name+ " please enter the book number of the book which you would want to add to cart (1:1,12:2,17:3,19:4,23:5,40:6,46:7 please choose from one of these options).");
                n = sc.nextInt();
                if (n>51)
                {
                  System.out.println("\n" +name+ " please enter a vaild book number.");
                }
                else if (n<=51)
                {
                  System.out.println("\n" +name+ " your chosen book is valid.");
                }
                System.out.println("\n" +name+ " the book you have chosen is "+ book[n]);
                y = y + 1;
                total = 0;
                total = total + p[n];
                String b = "\n";
                b = b + book[n];
                b = b + "\n";
                System.out.println(name+ " you now have "+ y +" book/s in your cart.");
                System.out.println("\n\n1. Continue shopping\n2. Check out");
                c = sc.nextInt();
    switch(c)
    {
        case 1 :
            
        int i = 0; 
        while (i == 0)
    {
        System.out.println("\n" +name+ " please enter the book number of the book which you would want to add to cart and enter a number greater than 51 to head to check out.");
        n = sc.nextInt();
        if (n<=51)
        {
           System.out.println("\n" +name+ " the book you have chosen is "+ book[n] + p[n]);
           y = y + 1;
           total = total + p[n];
           b = b + book[n];
           b = b + "\n";
           System.out.println("\n" +name+ " you now have "+ y +" book/s in your cart");
        }
        else if (n>51)
        {
            i = 52;
            System.out.println("\n" +name+ " your total bill is " +total+ "rs." + "\n" +"Your chosen book is " +b);
        }
    }
    break;
    
    case 2 :
        
        System.out.println("\n" +name+ " your total bill is " +total+ "rs." + "\n" + "Your chosen book is " +b);
        break;
    }
        break;
                    
                    case 2 :
                        
                        System.out.println("\nRecommendations :-\n\n");
                        System.out.println("NAME :-                                                       AUTHOR :-                        PRICE :_");
                        System.out.println("1. "+book[13]+ "                      "+" Rs. "+p[13]);
                        System.out.println("2. "+book[19]+ "             "+" Rs. "+p[19]);
                        System.out.println("3. "+book[4]+"               "+"   Rs. "+p[4]);
                        System.out.println("4. "+book[50]+ "                  "+" Rs. "+p[50]);
                        System.out.println("5. "+book[37]+ "             "+" Rs. "+p[37]);
                        System.out.println("6. "+book[25]+ "                      "+" Rs. "+p[25]);
                        System.out.println("7. "+book[30]+ "              "+" Rs. "+p[30]);
                        
                        int z = 0;
                System.out.println("\n" +name+ " please enter the book number of the book which you would want to add to cart (13:1,19:2,4:3,50:4,37:5,25:6,30:7 please choose from one of these options).");
                int nn = sc.nextInt();
                if (nn>51)
                {
                  System.out.println("\n" +name+ " please enter a vaild book number.");
                }
                else if (nn<=51)
                {
                  System.out.println("\n" +name+ " your chosen book is valid.");
                }
                System.out.println("\n" +name+ " the book you have chosen is "+ book[nn]);
                z= z + 1;
                total = 0;
                total = total + p[nn];
                b = "\n";
                b = b + book[nn];
                b = b + "\n";
                System.out.println(name+ " you now have "+ z +" book/s in your cart.");
                System.out.println("\n\n1. Continue shopping\n2. Check out");
                c = sc.nextInt();
    switch(c)
    {
        case 1 :
            
        int i = 0; 
        while (i == 0)
    {
        System.out.println("\n" +name+ " please enter the book number of the book which you would want to add to cart and enter a number greater than 51 to head to check out.");
        nn = sc.nextInt();
        if (nn<=51)
        {
           System.out.println("\n" +name+ " the book you have chosen is "+ book[nn] + p[nn]);
           z = z + 1;
           total = total + p[nn];
           b = b + book[nn];
           b = b + "\n";
           System.out.println("\n" +name+ " you now have "+ z +" book/s in your cart");
        }
        else if (nn>51)
        {
            i = 52;
            System.out.println("\n" +name+ " your total bill is " +total+ "rs." + "\n" + "Your chosen book is " +b);
        }
    }
    break;
    
    case 2 :
        
        System.out.println("\n" +name+ " your total bill is " +total+ "rs." + "\n" + " Your chosen book is " +b);
        break;
    }
                        
                    break;
                    
                    case 3 :
                        
                        System.out.println("\nNew arrivals :-\n\n");
                        System.out.println("NAME :-                                                       AUTHOR :-                        PRICE :-");
                        System.out.println("1. "+book[41]+ "                    "+" Rs. "+p[41]);
                        System.out.println("2. "+book[12]+ "                      "+" Rs. "+p[12]);
                        System.out.println("3. "+book[30]+ "              "+" Rs. "+p[30]);
                        System.out.println("4. "+book[48]+ "                     "+" Rs. "+p[48]);
                        
                            int e = 0;
                System.out.println("\n" +name+ " please enter the book number of the book which you would want to add to cart (41:1,12:2,30:3,48:4 please choose from one of these options).");
                int t = sc.nextInt();
                if (t>51)
                {
                  System.out.println("\n" +name+ " please enter a vaild book number.");
                }
                else if (t<=51)
                {
                  System.out.println("\n" +name+ " your chosen book is valid.");
                }
                System.out.println("\n" +name+ " the book you have chosen is "+ book[t]);
                e = e + 1;
                total = 0;
                total = total + p[t];
                String bb = "\n";
                b = b + book[t];
                b = b + "\n";
                System.out.println(name+ " you now have "+ e +" book/s in your cart.");
                System.out.println("\n\n1. Continue shopping\n2. Check out");
                c = sc.nextInt();
    switch(c)
    {
        case 1 :
            
        int i = 0; 
        while (i == 0)
    {
        System.out.println("\n" +name+ " please enter the book number of the book which you would want to add to cart and enter a number greater than 51 to head to check out.");
        t = sc.nextInt();
        if (t<=51)
        {
           System.out.println("\n" +name+ " the book you have chosen is "+ book[t] + p[t]);
           e = e + 1;
           total = total + p[t];
           b = b + book[t];
           b = b + "\n";
           System.out.println("\n" +name+ " you now have "+ e +" book/s in your cart");
        }
        else if (t>51)
        {
            i = 52;
            System.out.println("\n" +name+ " your total bill is " +total+ "rs." + "\n" + "Your chosen book is " +b);
        }
    }
    case 2 :
        
        System.out.println("\n" +name+ " your total bill is " +total+ "rs." + "\n" + "Your chosen book is " +b);
        break;                        
     
        }
    }
}
switch (ch2)
{
     case 4 : 
                        
                        System.out.println("\nFiction :-\n\n");
                        System.out.println("NAME :-                                                        AUTHOR :-                       PRICE :-");                           
                        System.out.println("1. "+book[1]+ "                  "+" Rs. "+p[1]);
                        System.out.println("2. "+book[2]+ "                  "+" Rs. "+p[2]);
                        System.out.println("3. "+book[3]+ "                  "+" Rs. "+p[3]);
                        System.out.println("4. "+book[4]+ "                "+" Rs. "+p[4]);
                        System.out.println("5. "+book[5]+ "                "+ " Rs. "+p[5]);
                        System.out.println("6. "+book[6]+ "                "+" Rs. "+p[6]);
                        System.out.println("7. "+book[7]+ "                "+" Rs. "+p[7]);
                        System.out.println("8. "+book[8]+ "                "+" Rs. "+p[8]);
                        System.out.println("9. "+book[9]+ "                   "+" Rs. "+p[9]);
                        System.out.println("10. "+book[10]+ "                   "+" Rs. "+p[10]);
                        System.out.println("11. "+book[11]+ "                   "+" Rs. "+p[11]);
                        System.out.println("12. "+book[12]+ "                     "+" Rs. "+p[12]);
                        System.out.println("13. "+book[13]+ "                     "+" Rs. "+p[13]);
                        System.out.println("14. "+book[14]+ "                     "+" Rs. "+p[14]);
                        System.out.println("15. "+book[15]+ "                     "+" Rs. "+p[15]);
                        System.out.println("16. "+book[16]+ "                  "+" Rs. "+p[16]);
                        System.out.println("17. "+book[17]+ "                  "+" Rs. "+p[17]);
                        System.out.println("18. "+book[18]+ "                  "+" Rs. "+p[18]);
                        System.out.println("19. "+book[19]+ "            "+" Rs. "+p[19]);
                        System.out.println("20. "+book[20]+ "            "+" Rs. "+p[20]);
                        System.out.println("21. "+book[21]+ "                "+" Rs. "+p[21]);
                        System.out.println("22. "+book[22]+ "                "+" Rs. "+p[22]);
                        System.out.println("23. "+book[23]+ "                "+" Rs. "+p[23]);
                        System.out.println("24. "+book[24]+ "                "+" Rs. "+p[24]);
                        System.out.println("25. "+book[25]+ "                     "+" Rs. "+p[25]);
                        System.out.println("26. "+book[26]+ "                     "+" Rs. "+p[26]);
                        System.out.println("27. "+book[27]+ "                    "+" Rs. "+p[27]);
                        System.out.println("28. "+book[28]+ "                    "+" Rs. "+p[28]);
                        System.out.println("29. "+book[29]+ "                    "+" Rs. "+p[29]);
                        System.out.println("30. "+book[30]+ "             "+" Rs. "+p[30]);
                        System.out.println("31. "+book[31]+ "             "+" Rs. "+p[31]);
                        System.out.println("32. "+book[32]+ "             "+" Rs. "+p[32]);
                        System.out.println("33. "+book[33]+ "                     "+" Rs. "+p[33]);
                        System.out.println("34. "+book[34]+ "                     "+" Rs. "+p[34]);
                        System.out.println("35. "+book[35]+ "                     "+" Rs. "+p[35]);
                        System.out.println("36. "+book[36]+ "            "+" Rs. "+p[36]);
                        System.out.println("37. "+book[37]+ "            "+" Rs. "+p[37]);
                        System.out.println("38. "+book[38]+ "            "+" Rs. "+p[38]);
                        System.out.println("39. "+book[39]+ "            "+" Rs. "+p[39]);
                        System.out.println("41. "+book[41]+ "                   "+" Rs. "+p[41]);
                        System.out.println("42. "+book[42]+ "                "+" Rs. "+p[42]);
                        System.out.println("43. "+book[43]+ "                "+" Rs. "+p[43]);
                        System.out.println("44. "+book[44]+ "                "+" Rs. "+p[44]);
                        System.out.println("49. "+book[49]+ "                 "+" Rs. "+p[49]);
                        System.out.println("50. "+book[50]+ "                 "+" Rs. "+p[50]);
                        System.out.println("51. "+book[51]+ "                 "+" Rs. "+p[51]);
                        
                         int q = 0;
                System.out.println("\n" +name+ " please enter the book number of the book which you would want to add to cart (enter the numbers corresponding to the book you want).");
                int nnnn = sc.nextInt();
                if (nnnn>51)
                {
                  System.out.println("\n" +name+ " please enter a vaild book number.");
                }
                else if (nnnn<=51)
                {
                  System.out.println("\n" +name+ " your chosen book is valid.");
                }
                System.out.println("\n" +name+ " the book you have chosen is "+ book[nnnn]);
                q = q+ 1;
                total = 0;
                total = total + p[nnnn];
                b = "\n";
                b = b + book[nnnn];
                b = b + "\n";
                System.out.println(name+ " you now have "+ q +" book/s in your cart.");
                System.out.println("\n\n1. Continue shopping\n2. Check out");
                c = sc.nextInt();
    switch(c)
    {
        case 1 :
            
        i = 0; 
        while (i == 0)
    {
        System.out.println("\n" +name+ " please enter the book number of the book which you would want to add to cart and enter a number greater than 51 to head to check out.");
        nnnn = sc.nextInt();
        if (nnnn<=51)
        {
           System.out.println("\n" +name+ " the book you have chosen is "+ book[nnnn] + p[nnnn]);
           q = q + 1;
           total = total + p[nnnn];
           b = b + book[nnnn];
           b = b + "\n";
           System.out.println("\n" +name+ " you now have "+ q +" book/s in your cart");
        }
        else if (nnnn>51)
        {
            i = 52;
            System.out.println("\n" +name+ " your total bill is " +total+ "rs." + "\n" + "Your chosen book is " +d);
        }
    }  
    case 2 :
        
        System.out.println("\n" +name+ " your total bill is " +total+ "rs." + "\n" + " Your chosen book is " +d);
        break;
                        
                        case 5 :
                            
                            
                            System.out.println("\nNon - fiction :-\n\n");
                            System.out.println("NAME :-                                                       AUTHOR :-                        PRICE :-");     
                            System.out.println("1. "+book[40]+ "                    "+" Rs. "+p[40]);
                            System.out.println("2. "+book[45]+ "                     "+" Rs. "+p[45]);
                            System.out.println("3. "+book[46]+ "                     "+" Rs. "+p[46]);
                            System.out.println("4. "+book[47]+ "                     "+" Rs. "+p[47]);
                            System.out.println("5. "+book[48]+ "                     "+" Rs. "+p[48]);
                            
                            int yyyyy = 0;
                System.out.println("\n" +name+ " please enter the book number of the book which you would want to add to cart (40:1,45:2,46:3,47:4,48:5 please choose from one of these options).");
                int nnnnn = sc.nextInt();
                if (nnnnn>51)
                {
                  System.out.println("\n" +name+ " please enter a vaild book number.");
                }
                else if (nnnnn<=51)
                {
                  System.out.println("\n" +name+ " your chosen book is valid.");
                }
                System.out.println("\n" +name+ " the book you have chosen is "+ book[nnnnn]);
                y = yyyyy + 1;
                total = 0;
                total = total + p[nnnnn];
                b = "\n";
                b = b + book[nnnnn];
                b = b + "\n";
                System.out.println(name+ " you now have "+ yyyyy +" book/s in your cart.");
                System.out.println("\n\n1. Continue shopping\n2. Check out");
                c = sc.nextInt();
    switch(c)
    {
        case 1 :
            
        i = 0; 
        while (i == 0)
    {
        System.out.println("\n" +name+ " please enter the book number of the book which you would want to add to cart and enter a number greater than 51 to head to check out.");
        nnnnn = sc.nextInt();
        if (nnnnn<=51)
        {
           System.out.println("\n" +name+ " the book you have chosen is "+ book[nnnnn] + p[nnnnn]);
           y = yyyyy + 1;
           total = total + p[nnnnn];
           b = b + book[nnnnn];
           b = b + "\n";
           System.out.println("\n" +name+ " you now have "+ yyyyy +" book/s in your cart");
        }
        else if (nnnnn>51)
        {
            i = 52;
            System.out.println("\n" +name+ " your total bill is " +total+ "rs." + "\n" + "Your chosen book is " +b);
        }
    }
    
      case 2 :
        
    System.out.println("\n" +name+ " your total bill is " +total+ "rs." + "\n" + " Your chosen book is " +b);
}
        break;
                            
                            
                        case 6 :
                            
                            System.out.println("\nComplete list of books :-\n\n");
                            System.out.println("NAME :-                                                        AUTHOR :-                       PRICE :-");    
                            System.out.println("1. "+book[1]+ "                  "+" Rs. "+p[1]);
                        System.out.println("2. "+book[2]+ "                  "+" Rs. "+p[2]);
                        System.out.println("3. "+book[3]+ "                  "+" Rs. "+p[3]);
                        System.out.println("4. "+book[4]+ "                "+" Rs. "+p[4]);
                        System.out.println("5. "+book[5]+ "                "+ " Rs. "+p[5]);
                        System.out.println("6. "+book[6]+ "                "+" Rs. "+p[6]);
                        System.out.println("7. "+book[7]+ "                "+" Rs. "+p[7]);
                        System.out.println("8. "+book[8]+ "                "+" Rs. "+p[8]);
                        System.out.println("9. "+book[9]+ "                   "+" Rs. "+p[9]);
                        System.out.println("10. "+book[10]+ "                   "+" Rs. "+p[10]);
                        System.out.println("11. "+book[11]+ "                   "+" Rs. "+p[11]);
                        System.out.println("12. "+book[12]+ "                     "+" Rs. "+p[12]);
                        System.out.println("13. "+book[13]+ "                     "+" Rs. "+p[13]);
                        System.out.println("14. "+book[14]+ "                     "+" Rs. "+p[14]);
                        System.out.println("15. "+book[15]+ "                     "+" Rs. "+p[15]);
                        System.out.println("16. "+book[16]+ "                  "+" Rs. "+p[16]);
                        System.out.println("17. "+book[17]+ "                  "+" Rs. "+p[17]);
                        System.out.println("18. "+book[18]+ "                  "+" Rs. "+p[18]);
                        System.out.println("19. "+book[19]+ "            "+" Rs. "+p[19]);
                        System.out.println("20. "+book[20]+ "            "+" Rs. "+p[20]);
                        System.out.println("21. "+book[21]+ "                "+" Rs. "+p[21]);
                        System.out.println("22. "+book[22]+ "                "+" Rs. "+p[22]);
                        System.out.println("23. "+book[23]+ "                "+" Rs. "+p[23]);
                        System.out.println("24. "+book[24]+ "                "+" Rs. "+p[24]);
                        System.out.println("25. "+book[25]+ "                     "+" Rs. "+p[25]);
                        System.out.println("26. "+book[26]+ "                     "+" Rs. "+p[26]);
                        System.out.println("27. "+book[27]+ "                    "+" Rs. "+p[27]);
                        System.out.println("28. "+book[28]+ "                    "+" Rs. "+p[28]);
                        System.out.println("29. "+book[29]+ "                    "+" Rs. "+p[29]);
                        System.out.println("30. "+book[30]+ "             "+" Rs. "+p[30]);
                        System.out.println("31. "+book[31]+ "             "+" Rs. "+p[31]);
                        System.out.println("32. "+book[32]+ "             "+" Rs. "+p[32]);
                        System.out.println("33. "+book[33]+ "                     "+" Rs. "+p[33]);
                        System.out.println("34. "+book[34]+ "                     "+" Rs. "+p[34]);
                        System.out.println("35. "+book[35]+ "                     "+" Rs. "+p[35]);
                        System.out.println("36. "+book[36]+ "            "+" Rs. "+p[36]);
                        System.out.println("37. "+book[37]+ "            "+" Rs. "+p[37]);
                        System.out.println("38. "+book[38]+ "            "+" Rs. "+p[38]);
                        System.out.println("39. "+book[39]+ "            "+" Rs. "+p[39]);
                        System.out.println("40. "+book[40]+ "                   "+" Rs. "+p[40]);
                        System.out.println("41. "+book[41]+ "                   "+" Rs. "+p[41]);
                        System.out.println("42. "+book[42]+ "                "+" Rs. "+p[42]);
                        System.out.println("43. "+book[43]+ "                "+" Rs. "+p[43]);
                        System.out.println("44. "+book[44]+ "                "+" Rs. "+p[44]);
                        System.out.println("45. "+book[45]+ "                    "+" Rs. "+p[45]);
                        System.out.println("46. "+book[46]+ "                    "+" Rs. "+p[46]);
                        System.out.println("47. "+book[47]+ "                    "+" Rs. "+p[47]);
                        System.out.println("48. "+book[48]+ "                    "+" Rs. "+p[48]);
                        System.out.println("49. "+book[49]+ "                 "+" Rs. "+p[49]);
                        System.out.println("50. "+book[50]+ "                 "+" Rs. "+p[50]);
                        System.out.println("51. "+book[51]+ "                 "+" Rs. "+p[51]);   
                        
                         int j = 0;
                System.out.println("\n" +name+ " please enter the book number of the book which you would want to add to cart (enter the numbers corresponding to the book you want).");
                int m = sc.nextInt();
                if (m>51)
                {
                  System.out.println("\n" +name+ " please enter a vaild book number.");
                }
                else if (m<=51)
                {
                  System.out.println("\n" +name+ " your chosen book is valid.");
                }
                System.out.println("\n" +name+ " the book you have chosen is "+ book[m]);
                j = j + 1;
                total = 0;
                total = total + p[m];
                String o = "\n";
                o = o + book[m];
                o = o + "\n";
                System.out.println(name+ " you now have "+ j +" book/s in your cart.");
                System.out.println("\n\n1. Continue shopping\n2. Check out");
                int s = sc.nextInt();
    switch(s)
    {
        case 1 :
            
        i = 0; 
        while (i == 0)
    {
        System.out.println("\n" +name+ " please enter the book number of the book which you would want to add to cart and enter a number greater than 51 to head to check out.");
        m = sc.nextInt();
        if (m<=51)
        {
           System.out.println("\n" +name+ " the book you have chosen is "+ book[m] + p[m]);
           j = j + 1;
           total = total + p[m];
           o = o + book[m];
           o = o + "\n";
           System.out.println("\n" +name+ " you now have "+ j +" book/s in your cart");
        }
        else if (m>51)
        {
            i = 52;
            System.out.println("\n" +name+ " your total bill is " +total+ "rs." + "\n" + "Your chosen book is " +o);
        }
    }  
    
      case 2 :
        
    System.out.println("\n" +name+ " your total bill is " +total+ "rs." + "\n" + " Your chosen book is " +o);
}
        break;
                
                        case 7 :
                            
                        System.out.println("\n" +name+ " your program was terminated, Thank you for visting our E - Library. Visit Us Again !!!");
                        System.exit(0);
                        
                        default :
                        System.out.println("\n" +name+ " your selected option is invalid, Please choose an option from the given options above.");  
                    }
                }
}
}



    