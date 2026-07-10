class Solution {
    public void sortColors(int[] arr) {
        int n =arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        
        while(mid<=high){
            if(arr[mid]==0){
            arr[mid]=arr[low];
            arr[low]=0;
            low++;
            mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                arr[mid]=arr[high];
                arr[high]=2;
                high--;
            }
        }  
    }
}