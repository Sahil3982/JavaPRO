public class subarraymatch {
    static void subarraySum(int[] nums, int k) {
        int counter=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum=0;
                for (int l = i; l < j; l++) {

                    System.out.println(" "+l);
                    sum += nums[l];

                    System.out.println(sum);

                }
                if(sum==k)
                {
                    counter++;
                }
            }


        }
        System.out.println("->"+counter);

    }


    public static void main(String[] args) {
        int[] num = {1,2,3};
        int k=2;
        subarraySum(num,k);
    }
}