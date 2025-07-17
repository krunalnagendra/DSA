class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int p = 0;
        for(int i=0; i<timeSeries.length-1; i++){
            if(timeSeries[i] + duration >= timeSeries[i+1]){
                p+=timeSeries[i+1]-timeSeries[i];
            }
            else{
                p+=duration;
            }
        }
        return p+duration;
    }
}