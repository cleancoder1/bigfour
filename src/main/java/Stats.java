import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.List;

public class Stats {

    public static void main(String[] args) {

        List<Double> doubles = new ArrayList<>();
        while (!StdIn.isEmpty()) {
            doubles.add(StdIn.readDouble());
        }
        Double mean = Double.valueOf(0);
        for (Double x : doubles) {
            mean = x + mean;
        }
        mean = mean / doubles.size();

        Double standardDeviation = Double.valueOf(0);
        for (Double sample : doubles) {
            standardDeviation += (sample - mean) * (sample - mean);
        }
        standardDeviation = Math.sqrt(standardDeviation / (doubles.size() - 1));
        System.out.println(mean);
        System.out.println("corrected standard deviation " + standardDeviation);
    }
}
