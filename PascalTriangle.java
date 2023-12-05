

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    
    //Step 1: generate method generates the first numRows of Pascal's Triangle.

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

    // Step 2 : The outer loop iterates over each row
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

          // Step 3 :  inner loop calculates the value of each element in the row based on the sum of the two numbers
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    
                    //  Step 4 : The first and last elements in each row are always 1
                    row.add(1);
                } else {
                    
                    //  Step 5 : Calculate other elements by summ the two numbers above
                    int sum = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    row.add(sum);
                }
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        int numRows = 5;
        List<List<Integer>> result = pascalTriangle.generate(numRows);

        // Print the Pascal's Triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}

