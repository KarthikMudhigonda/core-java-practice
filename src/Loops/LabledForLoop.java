package Loops;

public class LabledForLoop {
    public static void main(String[] args) {
        aa: //using label for outer and for loop
        for(int i=1;i<=3;i++){
            
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    break aa;
                }
                System.out.println(i+"   "+j);
            }
        }
    }
    
}
