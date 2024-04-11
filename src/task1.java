import java.util.*;


public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double loopCounter = 0;
        double firstOccurance = 0;

        int [] dataPoints = new int [100];


        Random rnd = new Random();



        // random number generation
        for (int i = 0; i < dataPoints.length; i ++ ){

            dataPoints[i] = rnd.nextInt(100);

        }
        // blank space addition
        for (int i = 0; i < dataPoints.length; i ++){

            System.out.print(dataPoints[i]+" | ");

        }





        System.out.println();
        System.out.println("The total of the array is "+safeinput.sum(dataPoints));
        System.out.println("The average of all the numbers in the array is "+safeinput.getAverage(dataPoints));

        int userInput = safeinput.getRangedInt(in,"Please enter your locus", 1, 100);
        // first occurance
        for (int i = 0; i < dataPoints.length; i ++){
            loopCounter += 1;
            if (userInput == dataPoints[i]){

                firstOccurance = loopCounter;

                break;
            }

        }
        int max = safeinput.max(dataPoints);
        int min = safeinput.min(dataPoints);
        System.out.println("The minimum in the array is "+min+" the max found is "+max);
        System.out.println("The average in the array is "+safeinput.getAverage(dataPoints));

        if (safeinput.contains(dataPoints, userInput)){
            System.out.println("Your number was found successfully in the array!");
            System.out.println("Your inputted number was found " + safeinput.occuranceScan(dataPoints, userInput) + " times in the array.");
            System.out.println("The first time your number was found is " + firstOccurance);
        }
        else {
            System.out.println("Your number was not found in the array.");
        }

    }

}
