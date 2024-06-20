public class Employee {
    static int AccountNumber = 123;
    static String Employeename = "Aaryahi";
    public static void main(String[] args) {
        //int AccountNumber = 567;
        //String Employeename = "Bavyans";
        System.out.println(AccountNumber);
        System.out.println(Employeename);
        BankEmployee BE = new BankEmployee();
        System.out.println(BE.AccountNumber);
        System.out.println(BE.Employeename);
        BE.display();
        BankEmployee.staticDisplay();


    }
    
}
