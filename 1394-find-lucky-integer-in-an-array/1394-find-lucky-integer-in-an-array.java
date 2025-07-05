class Solution {
    public int findLucky(int[] arr) {
        int lucky = -1;
        int count = 1;
        Arrays.sort(arr);
        for(int i =1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else {
                if(count == arr[i-1]) {
                lucky = Math.max(lucky, arr[i-1]);
                }
                count = 1;
            }
        }
        if (count == arr[arr.length - 1]) {
            lucky = Math.max(lucky, arr[arr.length - 1]);
        }
        return lucky;
    }
}