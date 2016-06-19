public class AddDigits {
    public class Solution {
        public int addDigits(int num) {
            int temp = 0;
            boolean flag = false;
            while(flag || num!=0){
                temp = temp + num%10;
                num = num/10;
                if(temp>9 && num == 0) {
                    flag = true;
                    num = temp;
                    temp = 0;
          
                }
                else flag = false;
            }
            return temp;
        }
    }
}