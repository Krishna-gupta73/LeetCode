class Solution {
    public int removeDuplicates(int[] arr) {
        int low =0;
        int high=1;
        int cm=1;
        int n=arr.length;

        while(cm<n){
            if(arr[cm]==arr[cm-1]){
                cm++;
                continue;
            }
            arr[low+1]=arr[cm];
            low++;
            high++;
            cm++;
        }
        return high;
    }
}