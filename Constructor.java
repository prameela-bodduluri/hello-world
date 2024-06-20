public class Constructor {
    int Rollnum;
    String Name;
    String School = "Bhashyam";
    static void Display(){
        System.out.println("Print student details");
    }
    Constructor( int StudentRollnum , String StudentName, String StudentSchool){
       Rollnum = StudentRollnum;
       Name = StudentName;
       School = StudentSchool;
    }
}
    

