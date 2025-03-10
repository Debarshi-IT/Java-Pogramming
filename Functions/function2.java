public class function2 {
    public static void main(String[] args){
        Sum obj=new Sum();
        obj.SumTwoNum(4,10);
    }
    
}

class Sum{
    void SumTwoNum(int x, int y){
        int s=x+y;
        System.out.println("sum of two numbers: "+s);
    }
}