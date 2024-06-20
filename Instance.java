public class Instance {
    String Name = "Prameela";
    int Rollnum = 1;
    void display(){
        System.out.println(Name);
    }
    public static void main(String args[]){
        Instance inst = new Instance();
System.out.println(inst.Name);
System.out.println(inst.Name);
System.out.println(inst.Rollnum);
inst.display();
    }
}
