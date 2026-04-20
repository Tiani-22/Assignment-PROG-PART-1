import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //create the input object
        Scanner input = new Scanner (System.in);
        // Declare the variable
        String userName;
        String password;
        String phoneNumber;
        String 
        do{
            System.out.println("----Menu----");
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1){
                System.out.print("Enter your first name: ");
                String firstName = input.nextLine();
                System.out.println(" ");

                System.out.print("Enter your last name: ");
                String lastName = input.nextLine();
                
                System.out.println(" ");

                System.out.print("Enter SA phone number");
                phoneNumber =input.nextLine();
                checkCellPhoneNumber(phoneNumber);

                System.out.println(" ");

                //Get the input
                System.out.print("Enter username");
                username = input.nextLine();
                checkUserName(username);

                System.out.println(" ");
                
                System.out.print("Enter password");
                password = input.nextLine();
                checkPasswordComplexity(password);
                
            }
            else if (choice == 2){
                System.out.print("Enter username: ");
                username = input.nextLine();

                System.out.println(" ");

                System.out.print("Enter password: ");
                password = input.nextLine();
                loginUser(username, password);
            }
            else if (choice == 3){
                System.out.println("Goodbye");
                break
            }
            else{
                System.out.println("Invalid choice!!")
            }

            System.out.println(" ");
        }while(choice == 3)        

    //validate the inputs
        if(username.length () >=5 && !username.contains("contains 5 characters with an underscore")){
            System.out.print("Username successfully captured");
        }else{
            System.out.print("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length");
        }

        if(password.length() == 12 && password.startsWith ("+27")){
            System.out.print("Password successfully captured");
        }else{
            System.out.print("Password is not correctly formatted;pleasw ensure that the password contains at least eight characters,a capital letter,a number and a special character");
        }
        if(phonenumber.length () == 12 && phonenumber.startsWith ("+27"))){
            System.out.print("Cell phone number successfully added");
        }else{
            System.out.print("Cell phone number incorrectly formatted or does not international code");
        }
    }
}
    public static void registerUser(){
        //create the input
        Scanner input = new Scanner(System.in);

        //Declare the variables
        String username = "Mmarona_22";
        String password = "passWo!22";
        String phoneNumber = "+27833415341";

        showUserLogin(username,password,phonenumber);
    }


    public static void loginUser(String username, String password){
        System.out.println("Mmarona_22");
        System.out.println("passWo!22");
        System.out.println("+27833415341");

    
        if(username.equals(username) && password.equals(password)) {
                System.out.println("Welcome < user first name>,<user last name > it s great to see you again");
        }else{
            System.out.println("Username or password incorrect please try again");
        }
    }

public class Login {
    public boolean checkUserName(String[] args){
        Scanner input = new Scanner(System.in);
        Boolean numOfChar = username.length() >= 5;
        
        Boolean hasUnderscore = false;
        
        for(int i = 0 ; index < username.length(); i++){
            String checkChar = String.valueOf(username.charAt(i));
            if(checkChar.equals("-")){
                hasUnderscore = true;
                break;
            }
        }
        
        if(!(numOfChar && hasUnderscore)){
            System.out.println("username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in lenght ");
        }else{
            System.out.println("Username is successfully captured");
        }
        
        return numOfChar && hasUnderscore;
        
        
    }
    public boolean checkPasswordComplexity(String[] args){
        //password must atleast have 8 chars,1 uppercase, 1 number, 1 special char
        Scanner input = new Scanner(System.in);

        String password;

        System.out.print("Enter a password");
        password = input.nextLine();

        System.out.println("Your password has" + password.length() + " characters");
        System.out.print("The fifth Character of the password is" + password.charAt(4));

        //flags
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasSpecialCase = false;

        //Initialise
        Boolean isLongEnough = password.length() >= 8;
        
        for(int i = 0; i < password.length(); i++) {
            char eachChar = password.charAt(i);
            
            if(Charater.isUpperCase(eachChar)){
                hasUpperCase = true;
            }
            
            if(!Charater.isDigit(eachChar)){
                hasNumber = true;
            }
            
            if(!Charater.isLetterOrDigit(eachChar)){
                hasSpecialCase = true;
            }
        }

        if(!(isLongEnough && hasUpperCase && hasNumber && hasSpecialCase)){
            System.out.print("password is not valid");
        }else{
            System.out.print("Password is valid");
        }

        return isLongEnough && hasUpperCase && hasNumber && hasSpecialCase;

    public boolean checkCellPhoneNumber() {
        Scanner input = new Scanner(System.in);
        String phoneNumber;

        System.out.println("Please enter SA phone number");
        System.out.println("Please use the format +27833415341 ,where 0 is a digit");
        phoneNumber = input.nextLine();

        phoneNumber = phoneNumber.length();
        if(phoneNumber.length() != 12)
            System.out.println("phonenumber is invalid");
          else
          {
                if(phonenumber.startsWith("+27") ** false)
                    System.out.print("phonenumber is invalid");
                else
                {
                    if(phonenumber.charAt(SA) != '-' || phoneNumber.charAt(3) != '-' ||  phoneNumber.charAt(3)  != '-')
                        System.out.print("phonenumber is invalid");
                        else
                        {
                            for(int i= 3; i c phonenumber.length(); i++)
                            {
                        }
                        }
                }
          }      
         
    }
    public String registerUser(String[] args){
        Scanner input = new Scanner (System.in);

        string username;

        //flags
        if(!checkUserName(username)){
            return = "Username is incorrectly formatted";
        }
        if(!checkPasswordComplexity( password)){
            return = "Password is not complex enough"
        }
        if(!checkPasswordComplexity()){
            return "Password does not meet complexity requirements.";
        }
            return = "User registered successfully";
    }

    public boolean loginUser(String username, String password, String enteredUsername, String enteredPassword ){
        if(username.equals(enteredUsername) && password.equals(enteredPassword)){
            System.out.println("")
        }

        //flags
        return username = ("Mmarona_22") && password ("passWo!22");
    }

    public String returnloginUser(boolean LoginSuccess) {
        Scanner input = new Scanner (System.in);

        //flag
        if(loginSuccess){
            return "A successful login. Welcome " + username;
        }else{
            return "A failled login. Username or password incorrect.";
        }

    }
    }

    //MAIN METHOD ( ALL TESTS HERE)
    public static void main (String[] args ){

        System.out.println(" ===== TESTING START ===== \n");

        //Username correctly formatted
        Login user1 = new Login("Mmarona_22", "passWo!22", "+27833415341");
        System.out.println("Username valid: " +user1.checkUserName()); //true
 
        //Username incorrectly formatted
        Login user2 = new Login("Mmarona_22!!!!", "passWo!22", "+27833415341" );
        System.out.println("Username valid: " +user2.checkUserName()); //false

        //Password correct
        System.out.println("Password is valid: " +user1.checkPasswordComplexity());//true

        //Password incorrect
        Login user3 = new Login ("Mmarona_22", "passWo!223", "+27833425341")
        System.out.println("Password valid: " +user3.checkPasswordComplexity());//true

        //Cell number correct
        System.out.println("Cell valid: " + user1.checkCellPhoneNumber())://true

        //Cell number incorrect
        Login user4 = new Login("Mmarona_22", "passWo!22","+0833425341");
        System.out.println("Cell valid:" = user4. checkCellPhoneNumber());//false

        //Registration success
        System.out.println("Register results: " user1.registered);
        //Registration failled (username)
        System.out.println("Register results: " user2.returnUser);
        //Registration failled (password)
        System.out.println("Register results: " user3.registerUser);
        //Registration failled (cell)
        System.out.println("Register result: " user4.registerUser);

     //login was successful
     boolean LoginSuccess = user1.loginUser("Mmarona_22", "passWo!22", "+27833415341");
         System.out.println("\nLogin succes: +loginSucess");
     System.out.println(user1. returnLoginStatus(loginSuccess));

     //login was not successful
     boolean loginFail = user.loginUser("Mmarona_22", "passWo!221111");
        System.out.println("\nLogin success: " + loginFail);
     System.out.println(user1.returnLoginStatus(loginFail));

        System.out.println("\n===== TESTING END =====");
    }
 }

