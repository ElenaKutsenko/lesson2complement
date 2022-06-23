public class Main {
    public static void main(String[] args) {

        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = (a * (b + (c - d * e))) * Math.abs(-1);
        {
            System.out.println(result);
        }
        int a1 = 5, b1 = 7;
        a1 = a1 + b1 - (b1 = a1);
        {
            System.out.println(a1);
            System.out.println(b1);
        }
        double a2 = 567;
        double b2;
        b2 = Math.floor((a2/10)% 10);
        System.out.println(b2);


    }
}