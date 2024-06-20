public class Staticvariable {
        static int a = 10;
        static String b = staticdisplay();
        static{
            System.out.println("static block " + a);
            
            System.out.println(b);
        }
        static String staticdisplay(){
            System.out.println("static display " + a);
            return "Prameela";
        }
        public static void main(String args[]){
            a = 30;
            System.out.println(" excute main method");
            System.out.println(a);
        }
    
        
    }
    

