import java.util.*;
class Solution {
    public int mySqrt(int x) {
        long i, j ;
        for(i=0,j=1; i<=47000 && j<=47000; i++,j++){
            if((i*i)<= x && (j*j)>x){
                return (int) i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.mySqrt(x));
 
    } 
}