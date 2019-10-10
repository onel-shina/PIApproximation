package edu.gcccd.csis;

import java.util.Random;
public class Pi {
    public static void main(String[] args) {
        System.out.println(calculatePi());
    }

    public static double calculatePi() {
        int c = 0;
        int s = 0;
        double point;
        double estimatedPi;
        double actualPi = Math.PI;
        double error;
        double allowedError = 0.00000001; // allowed error between estimated Pi and the actual Pi //

        while (true) {
            Random random = new Random();
            double x = random.nextDouble(); // generate random x value //
            double y = random.nextDouble(); // generate random y value //
            s++; // increment number of points inside the square //
            point = (x * x) + (y * y); // Pythagorean theorem //
            if (point <= 1) { // If point is less than or equal to 1, point lies inside the circle //
                c++;// increment number of points inside the circle //
            }
            estimatedPi = 4 * ((double) c / (double) s); // estimating Pi value //
            error = Math.abs(actualPi - estimatedPi); //calculating error between estimatedPi and actualPi //
            if (error <= allowedError) { //if error is less than 0.00000001, break. //
                break;
            }
        }
        return estimatedPi;
    }
}