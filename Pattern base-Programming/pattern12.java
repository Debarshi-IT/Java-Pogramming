public class pattern12 {
    public static void main(String[]args){
        int i,j;
        for(i=1;i<=5;i++){
            // for spaces
            for(j=1;j<=5-i;j++){
                System.out.print("  ");
            }
            //for print value
            for(j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        for(i=1;i<=5;i++){
            
            // for spaces
            for(j=1;j<=5-i;j++){
                System.out.print("  ");
            }
            //for print value
            for(j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
