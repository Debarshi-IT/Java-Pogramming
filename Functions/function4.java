public class function4 {
    public static void main(String[] args){
        Multiply obj=new Multiply();
        obj.MultiplyTwoNum(4,10);
    }
    
}

class Multiply{
    void MultiplyTwoNum(int x, int y){
        int s=x*y;
        System.out.println("Multiply of two numbers: "+s);
    }
}