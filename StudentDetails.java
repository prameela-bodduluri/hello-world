public class StudentDetails {
    public static void main(String[] args) {
        Constructor.Display();
        Constructor cons = new Constructor(1,"Aarya","Bhashyam");
        Constructor cons1 = new Constructor(2,"Bhayans","Bhashyam");
        System.out.println(cons.Rollnum +" "+cons.Name +" "+cons.School);
        System.out.println(cons1.Rollnum +" "+cons1.Name +" "+cons1.School);
    }
    
}
