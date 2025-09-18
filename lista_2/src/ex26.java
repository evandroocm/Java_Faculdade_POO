public class ex26 {
    public static void main(String[] args) {
        
        double i = 1;
        double x = 1;
        double armazem = 0;
        double s = 0;

        while(i<=99){
            System.out.println(i+"/"+x);
            armazem = i/x;
            i = i + 2;
            x++;
            s = s + armazem;
        }
        System.out.println(s);
    }
}
