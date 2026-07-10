class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;

        int left =0;
        int right =0;

        while(right<n){
            if(arr[right]==0){
                right++;
            }
            else if(arr[right]!=0){
                int temp = arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
                right++;
            }
        }
        
    }
}