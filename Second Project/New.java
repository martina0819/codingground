public class New {

     public static void main(String []args){
        int [] a = {1,2,4,10,7};
        System.out.println("Output");
        System.out.println(maxDifference(a));
     }
     
     static int maxDifference(int[] a) {
         int max_diff = a[1] - a[0];
         
         for (int i = 0; i < a.length; i++) {
             
             for (int j = i + 1; j < a.length; j++) {
                 if (a[j] - a[i] > max_diff) {
                     max_diff = a[j] - a[i];
                 }
             }
         }
         return max_diff;
     }
}
