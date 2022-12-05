package fizzbuzz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeArray.map;

public class twoSum {

    public static void main(String[] args) {

        int [] numbers=new int [] {2,3,7,4,8};
        int target =7;
        int [] result=getTwoSum(numbers, target);
        System.out.println(result[0] + " " +result[1]);
    }
    public static int[] getTwoSum(int [] numbers ,int target){
        HashMap<Integer ,Integer> vistedNumbers=new HashMap<>();
        for(int i=0 ;i<numbers.length ;i++){
        int delta=target - numbers[i];
        if(vistedNumbers.containsKey(delta)){
        return new int[] {i,vistedNumbers.get(delta)};
        }
        vistedNumbers.put(numbers[i] ,i);
        }
        return new int []{-1,-1} ;
    }

}
