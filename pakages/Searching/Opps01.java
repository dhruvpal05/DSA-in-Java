package Searching;
public class Opps01 {
    int a;
    double b;

    Opps01(){
        this.a = 0;
        this.b = 0;
    }
    Opps01(int a,int b){
        this.a = a;
        this.b = b;
    }


    public static void main(String[] args) {
        Opps01 box = new Opps01(2,3);
        System.out.println(box.a);
        System.out.println(box.b);
    }

    public class Opps02 extends Opps01{
        
    }
}
