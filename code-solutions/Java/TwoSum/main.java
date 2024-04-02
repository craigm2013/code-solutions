import java.util.HashMap;
import java.util.Map;

class main{
    public static void main(String[] args){
        int[] input = {2,7,11,15};
        int[] result = twoSum(input, 9);
        System.out.println(result[0] + " " + result[1]);

        int[] input2 = {3,2,4};
        result = twoSum(input2, 6);
        System.out.println(result[0] + " " + result[1]);
    }

    static public int[] twoSum(int[] nums, int target){
        // Creates a static map, 
        // this will be used to check if the target value minus the current element exists
        // So we don't have to iterate through two elements to see if they add up to target
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    } 
}
