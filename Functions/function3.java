public class function3 {
    public static void main(String[] args){
        factorial obj=new factorial();
        obj.fact(4);
    }
    
}

class factorial{
    void fact(int x){
        int s=1 ;
        for(int i=x; i>=1;i--){
            s=s*i;
        }
        System.out.println("Factorial of a numbers: "+s);
    }
}