class main{
    public static void main(String[] args){
        
    }
    
    public int removeDuplicates(int[] nums) {
        // index == 1 as first element and always unique hence, never needs removed
        int index = 1;

        
        for (int i = 1; i < nums.length; i++) {
                // If current element is not equal to prev element, means we've encountered new element
                if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}