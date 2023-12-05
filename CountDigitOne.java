
public class CountDigitOne {
    
    // Step 1 : countDigitOne method iterates through each number from 1 to n 

    public int countDigitOne(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            count += countOnes(i);
        }

        return count;
    }
    // Step 2 :  count the occurrences of the digit 1 in each number

    private int countOnes(int num) {
        // initallize count to zero
        int count = 0;

// Step 3 :  while loop to iterate through the digits of the number and increments the count whenever a digit is equal to 1.
        while (num > 0) {
            if (num % 10 == 1) {
                count++;
            }
            num /= 10;
        }

        return count;
    }
// Step 4 :  find the total number of digit 1 in the range 
    public static void main(String[] args) {
        CountDigitOne counter = new CountDigitOne();
        int n = 13;
        int result = counter.countDigitOne(n);

        System.out.println("Total number of digit 1 from 1 to " + n + ": " + result);
    }
}
