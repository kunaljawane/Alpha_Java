// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Arrays;

// class Result {

//     public static void goodSequence() throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//         int T = Integer.parseInt(bufferedReader.readLine().trim());

//         for (int t = 0; t < T; t++) {
//             String[] firstLine = bufferedReader.readLine().split(",");
//             int N = Integer.parseInt(firstLine[0].trim());
//             int M = Integer.parseInt(firstLine[1].trim());

//             int[] numbers = Arrays.stream(bufferedReader.readLine().split(","))
//                                   .mapToInt(Integer::parseInt)
//                                   .toArray();

//             boolean allDivisible = true;
//             for (int num : numbers) {
//                 if (num % M != 0) {
//                     allDivisible = false;
//                     break;
//                 }
//             }

//             // Calculate total non-empty subsequences
//             int totalNonEmptySubsequences = (1 << N) - 1;

//             // Output P/Q
//             if (allDivisible) {
//                 System.out.println("1/1");
//             } else {
//                 int gcd = gcd(0, totalNonEmptySubsequences);
//                 System.out.println("0/" + (totalNonEmptySubsequences / gcd));
//             }
//         }
//         bufferedReader.close();
//     }

//     // Helper method to calculate the greatest common divisor (GCD)
//     private static int gcd(int a, int b) {
//         if (b == 0) {
//             return a;
//         }
//         return gcd(b, a % b);
//     }
// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         Result.goodSequence();
//     }
// }
