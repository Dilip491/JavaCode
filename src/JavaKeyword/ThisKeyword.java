package JavaKeyword;

public class ThisKeyword {


    static void car(){
        System.out.println("Car method is executed");
    }

    void bike(){
        System.out.println("Bike method is executed");
        this.car();
    }

    public static void main(String[] args) {
        int a=10;
        car();
        ThisKeyword tk=new ThisKeyword();
        tk.bike();


    }
}
