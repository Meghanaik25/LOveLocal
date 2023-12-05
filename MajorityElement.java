
import java.util.ArrayList;
import java.util.List;

public class MajorityElement {


  // majorityElement method that takes an integer array as input and returns a list of elements that appear more than ⌊ n/3 ⌋ times.

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        int candidate1 = 0, count1 = 0;
        int candidate2 = 0, count2 = 0;

        // Step  1: Find  candidates
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Count the number of  candidates
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        //  Step 3 : Check if candidates appear more than ⌊n/3⌋ times
        
        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }

        return result;
    }

    public static void main(String[] args) {
        
        // Step 4 : main method demonstrates how to use this class with an example array. 
        
        MajorityElement majorityElementFinder = new MajorityElement();
        int[] nums = {3, 2, 3};
        List<Integer> result = majorityElementFinder.majorityElement(nums);

     //  Step 5 : prints the Elements
     
        System.out.println("Elements appearing more than ⌊ n/3 ⌋ times: " + result);
    }
}

