import java.util.Scanner;

public class Login extends Library {
        Scanner s=new Scanner(System.in);
        // Books b=new Books();
        String username;
        String password;




        void setData() {

            System.out.println("Enter Your Username:");
            username = s.next();
            System.out.println("Enter Your Password");
            password = s.next();
            if (!username.equals("abc") && !password.equals("181")) {
                try {
                    throw new Exception("The Username And Password Entered Is Invalid"
                            + " Please Try Again");
                } catch (Exception e) {
                    System.out.println(e);
                    setData();
                }
            } else {
                System.out.println("Welcome");
                Login l = new Login();

            }
        }

        }



