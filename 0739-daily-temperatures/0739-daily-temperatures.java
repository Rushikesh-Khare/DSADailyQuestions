class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //efficient way
        int[] stack = new int[temperatures.length];
        int[] ans = new int[temperatures.length];
        int top = 0;
        for(int i = 0; i < temperatures.length; i++){
            while(top > 0 && temperatures[i] > temperatures[stack[top]]){
                int idx = stack[top--];
                ans[idx] = i - idx; 
            }
            stack[++top] = i;
        }
        return ans;
        
    }
}