public class p15 {
    public static void main(String[] args) {
        //question30
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print( n+ " ");
               n--;
            }
            System.out.println();
            n+=5;
        }
    }
}


/* OUTPUT:
5 4 3 2 1  
5 4 3 2 1  
5 4 3 2 1  
5 4 3 2 1  
5 4 3 2 1 
*/  
