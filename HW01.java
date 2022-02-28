public class HW01 {
   public static void main (String[] args){
       System.out.println(isEven(2));
       System.out.println(isEven(3));
       System.out.println(isEven(5));
       System.out.println(isEven(6));
       System.out.println(isEven(7));
       System.out.println(isEven(8));

      int[]numbers = {2,3,5,6,7,8};
      int res = sumOfArray(numbers);
         System.out.println(res);
      int[] arr1={2,3,5,6,7,8};
      int res0= sumOfArray(arr1);
         System.out.println(res0);

    }
      public static boolean isEven(int x) {
      return x % 2 == 0;
  }


      public static int sumOfArray ( int[] arr){
          int sum = 0;
          for (int v : arr) {
              sum = sum + v;

          }
          return sum;
      }
  }









