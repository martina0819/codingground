public class New {

     public static void main(String []args){
        int [] a = {1,2,4,10,7};
        System.out.println("Output");
        System.out.println(maxDifference(a));
        
        String s1 = "sametest";
        String s2 = "sametest";
        String s3 = new String("sametest");
        String s4 = new String("sametest");
        String s5 = s1;
        
        System.out.println("s1 == s2? " + (s1 == s2)); //true, same references from String pool
        System.out.println("s3 == s4? " + (s3 == s4)); //false, two new references
        System.out.println("s5 == s1? " + (s5 == s1)); //true, hold the same reference
        System.out.println("s1 == s3? " + s1.equals(s3)); //true, literal is the same
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
