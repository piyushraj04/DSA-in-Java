import java.util.Scanner;

class Registration {
    String userName;
    String email;
    long phone;
    String passwprd;

    Registration(String userName, String email, long phone, String password) {
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.passwprd = password;
    }

    void registrationStatus(){
        System.out.println("User is successfully registered in the db server...!!!");
    }

    

}

public class MainClass1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your email:");
        String email = sc.next();
        System.out.println("Enter your Phone no.:");
        long phone = sc.nextLong();
        System.out.println("Enter your password:");
        String pw = sc.next();

        Registration rs = new Registration(name, email, phone, pw);
        rs.registrationStatus();
        sc.close();


    }
}