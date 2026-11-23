class Solution {
    public void reverseString(char[] s) {

        Reverse(s , 0);
      
    }
    static int mid=0;
    public static void Reverse(char[] arr , int mid){
        if(arr.length%2==0){
            if(mid==(arr.length)/2){
                return;
            }
        }
        else{
            if(mid==(arr.length+1)/2){
                return;
            }
        }

        char temp=arr[mid];
        arr[mid]=arr[arr.length-1-mid];
        arr[arr.length-1-mid]=temp;
        Reverse(arr , mid+1);

    }
}
