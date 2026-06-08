class Solution {
    public int totalWaviness(int num1,int num2){
        int count = 0;
        for(int i=num1; i<=num2; i++){
            if(isPeak(i) || isValley(i)){
                count++;
            }
        }
        return count;
    }
    public boolean isPeak(int num){
        String str = Integer.toString(num);
        for(int i=1; i<str.length()-1; i++){
            if(str.charAt(i) > str.charAt(i-1) && str.charAt(i) > str.charAt(i+1)){
                return true;
            }
        }
        return false;
    }
    public boolean isValley(int num){
        String str = Integer.toString(num);
        for(int i=1; i<str.length()-1; i++){
            if(str.charAt(i) < str.charAt(i-1) && str.charAt(i) < str.charAt(i+1)){
                return true;
            }
        }
        return false;
    }
}