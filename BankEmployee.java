public class BankEmployee {
    int AccountNumber = 234;
    String Employeename = "Prameela";

    void display() {
        System.out.println(AccountNumber);
        System.out.println(Employeename);
    }

    static void staticDisplay() {
        int AccountNumber = 789;
        String Employeename = "Bavyans";
        System.out.println(AccountNumber);
        System.out.println(Employeename);
        System.out.println(" Display static method");

    }

}
