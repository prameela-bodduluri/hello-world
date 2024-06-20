public class Methodoverloading {
    public static void main(String[] args) {
        int x = Method.addition(12, 24);
        float y = Method.addition(10,20,30);
        float z = x+y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

}
