class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Method - 1 ######################
        // int[] distinctNum = new int[60];
        // int[] ansArray = new int[nums.length];
        // int product;

        // for(int num : nums){
        // distinctNum[num + 30] = distinctNum[num + 30] + 1;
        // }

        // int ind = 0;

        // for(int i = 0; i < nums.length; i++){
        // product = 1;
        // for(int j = 0; j < distinctNum.length; j++){
        // if((nums[i] + 30) == j){
        // if(distinctNum[j] - 1 > 0){
        // product = product * (int) Math.pow(j - 30, distinctNum[j] - 1);
        // }
        // }else{
        // product = product * (int) Math.pow(j - 30, distinctNum[j]);
        // }
        // }
        // ind++;
        // ansArray[i] = product;
        // }

        // return ansArray;

        // Method - 2 ######################(with prefix, postfix)
        int[] answers = new int[nums.length];

        int prefix = 1;
        int postfix = 1;

        for (int i = 0; i < nums.length; i++) {
            answers[i] = prefix;
            prefix = prefix * nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            answers[i] = answers[i] * postfix;
            postfix = nums[i] * postfix;
        }

        return answers;

    }
}