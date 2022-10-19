

public class Main {
    public static void main(String[] args) {
     int[] array = {1,1,1,1,1,4,1,1,1,1,1,7,1,1,1,1,1};
     int target = 11;


        System.out.println(Solution.twoSum(array,target)[1]);

    }

class Solution {
    public static int[] twoSum(int[] array, int target) {

        java.util.ArrayList<Integer> string = new java.util.ArrayList<>();



        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j< array.length; j++) {


                if(array[i]+array[j] == target ){
                    string.add(i);
                    string.add(j);


                }


            }

        }
    int[] arr = string.stream().mapToInt(i -> i).toArray();
       return arr;
    }
}


}