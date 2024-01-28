public class Solution {

        public int addDigits(int num) {
            int sum=0,sum1=0;
            while(num>0){
                num/=10;
                sum+=num;
                System.out.println(sum);

            }
            while(sum<0){
                sum%=10;
                sum1+=sum;
            }
            return sum1;
        }


    public static void main(String[] args) {
        int num=38;
        Solution s=new Solution();
        s.addDigits(num);

    }
}
