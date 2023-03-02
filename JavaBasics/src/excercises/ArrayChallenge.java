package excercises;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
            int[] arr = {10,20,20,45,60};
            int sum= 0;
            double average;
            int largest = arr[0];
        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
            for(int i = 0; i<arr.length;i++) {
                sum += arr[i];
                if(largest<arr[i]) {
                    largest = arr[i];
                }
            }
            average = (double) sum/arr.length;
        System.out.println("Sum:"+sum);
        System.out.println("largest = " + largest);
        System.out.println("average = " + average);

    }
}
