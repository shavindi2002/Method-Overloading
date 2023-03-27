public class StrIn {
    void display(double a){
        System.out.println("Double!");
    }
    void display(String b){
        System.out.println("Srting!");
    }

    public static void main(String[] args) {
        StrIn s1 = new StrIn();
        s1.display("Gawesh");
        s1.display(78.98);

    }
}
