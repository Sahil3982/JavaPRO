public class longestsubaaray {
    static void subarray(int[] nums) {
        int min=nums[0];
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
            for (int i = 0,j=0; i < nums.length; i++) {
                if (min+j==nums[i]){
                    count++;

            }
                j++;

        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] num = {100,4,200,1,3,2};
        subarray(num);
    }
}