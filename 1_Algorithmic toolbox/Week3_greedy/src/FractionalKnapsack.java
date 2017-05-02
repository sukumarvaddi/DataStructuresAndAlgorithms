import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(double capacity, double[] values, double[] weights) {
    	Map<Double, Double> weightLookUpByPerUnitValue = new Hashtable<>();
    	Map<Double, Double> valueLookUpByWeight = new Hashtable<>();
        double returnValue = 0;
        int noOfItems = values.length;
        double[] valueToWeightRatioArray = new double[noOfItems];
        for(int i=0; i<noOfItems; i++){
        	double valueToWeightRatio = values[i]/weights[i];
        	valueToWeightRatioArray[i] = valueToWeightRatio;
        	valueLookUpByWeight.put(weights[i],values[i]);
        	weightLookUpByPerUnitValue.put(valueToWeightRatio, weights[i]);
        }
        Arrays.sort(valueToWeightRatioArray);
        for(int i = (noOfItems-1); i>=0; i--){
        	double weight = weightLookUpByPerUnitValue.get(valueToWeightRatioArray[i]);
        	double value = valueLookUpByWeight.get(weight);
        	double a = Math.min(weight, capacity);
        	returnValue+=a*valueToWeightRatioArray[i];
        	capacity = capacity-a;
        	
//        	if(weight < capacity){
//        		returnValue +=value;
//        		capacity = capacity-weight;
//        	}
//        	else if(capacity ==0){
//        		break;
//        	}
//        	else {
//        		returnValue+= capacity*valueToWeightRatioArray[i];
//        		capacity = 0;
//        	}
        }
        return returnValue;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        double[] values = new double[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
