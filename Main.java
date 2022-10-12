import java.util.*;

class Main {
  // Given an array containing 0s, 1s and 2s, sort the array in-place. You should
  // treat numbers of the array as objects, hence, we can’t count 0s, 1s, and 2s
  // to recreate the array.

  // The flag of the Netherlands consists of three colors: red, white and blue;
  // and since our input array also consists of three different numbers that is
  // why it is called Dutch National Flag problem.

  // Example 1:

  // Input: [1, 0, 2, 1, 0]
  // Output: [0 0 1 1 2]
  // Example 2:

  // Input: [2, 2, 0, 1, 2, 0]
  // Output: [0 0 1 2 2 2 ]

  private static void dutchNationalFlag(int[] a) {
    int n = a.length;
    int low = 0;
    int high = n - 1;
    for (int i = 0; i <= high;) {
      if (a[i] == 0) {
        Main.swap(i, low, a);
        i++;
        low++;
      } else if (a[i] == 1) {
        i++;
      } else {
        Main.swap(i, high, a);
        high--;
      }
    }

  }

  private static void swap(int x, int y, int[] a) {
    int temp = a[x];
    a[x] = a[y];
    a[y] = temp;
  }

  public static void main(String[] args) {
    int[] result = new int[] { 1, 0, 2, 1, 0 };
    dutchNationalFlag(result);
    System.out.println(Arrays.toString(result));
    int[] result2 = new int[] { 2, 2, 0, 1, 2, 0 };
    dutchNationalFlag(result2);
    System.out.println(Arrays.toString(result2));
  }
}