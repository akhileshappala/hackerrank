    static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
      char  A[]=a.toLowerCase().toCharArray();
        char B[]=b.toLowerCase().toCharArray();
   Arrays.sort(A);
   Arrays.sort(B);

   return Arrays.equals(A,B);
        
    }
