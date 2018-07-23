// Create the method variance, which receives a list of integers as a parameter
// and then returns the **sample variance** of that list.
// You can check how a sample variance is calculated in Wikipedia,
// under "Population variance and sample variance".


// https://www.mathsisfun.com/data/standard-deviation.html
// NOTE: A Sample: divide by N-1 when calculating Variance

import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static double sum(ArrayList<Integer> list) {
        int total = 0;

        for (int num : list)
            total += num;

        return total;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return sum(list) / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double mean = average(list);

        double sum = 0;
        for (int data : list)
            sum += (Math.pow((data - mean), 2));

        double variance = sum / (list.size() - 1);

        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
