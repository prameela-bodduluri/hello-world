import java.util.Scanner;

public class Addtwonames {
public static void main(String args[]){
    int a = 10;
    int b = 5;
    System.out.println(a+b);
    Scanner scan = new Scanner(System.in);
        System.out.println("enter firstname");
        String firstname = scan.nextLine();
        //Scanner scan1 = new Scanner(System.in);
        System.out.println("enter lastname");
        String lastname = scan.nextLine();
        //String firstname = "Prameela";
    //String lastname = "Bodduluri";
    System.out.println("fullname : " + firstname+ " " +lastname);
}
    
}
