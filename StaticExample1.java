public class StaticExample1 {
    static int a = 12;
    static int b = 10;
    static int c ;
    static void Addition(){
         c = a+b;
        System.out.println(c);
    }
        static void Substraction(){
            int d = a-b;
            System.out.println(d);
        }
        static void Multiplication(){
            int e = a*b;
            System.out.println(e);
            Addition();
        }
}
    

