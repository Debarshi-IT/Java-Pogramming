import java .util.*;
public class array4 {
    public static void main(String[] args) {
         
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row size:");
        int r=sc.nextInt();
        System.out.println("enter colume size:");
        int c=sc.nextInt(); 
        int[][] arr=new int[r][c];
        int i,j;
        System.out.println("enter the values:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Please enter the search element: ");
        int x=sc.nextInt();
        System.out.println("index of 2D array is:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(arr[i][j]==x)
                System.out.println("("+i+","+j+")");
            }
           // System.out.println();
        }
        
        
   }    
}
