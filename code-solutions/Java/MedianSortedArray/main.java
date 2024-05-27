public class main {
    public static void main(String[] args){
    }
    
    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int arrayLength = nums1.length+nums2.length;
        int[] nums3 = new int[arrayLength];

        int nums1cont = 0;
        int nums2cont = 0;
        int counter = 0;
        while(nums1cont < nums1.length && nums2cont < nums2.length){
            System.out.println(nums3);
            if(nums1[nums1cont] <= nums2[nums2cont]){
                nums3[counter++] = nums1[nums1cont++];
            }
            else{
                nums3[counter++] = nums2[nums2cont++];
            }
        }
        while(nums1cont < nums1.length){
            nums3[counter++] = nums1[nums1cont++];
        }
        while(nums2cont < nums2.length){
            nums3[counter++] = nums2[nums2cont++];
        }
        System.out.println(Arrays.toString(nums3));
        if(counter % 2 == 0){
            float x = nums3[(counter/2)-1];
            float y = nums3[counter/2];
            return (x+y)/2;
        }
        else{
            return nums3[counter/2];
        }

    }
}
