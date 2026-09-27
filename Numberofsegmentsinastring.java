class Solution {
    public int countSegments(String s) {
        
        int count=0;
        String [] arr=s.split(" ");
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]!=""){
                count++;
            }
        }
        if(s.length()==0){
            return 0;
        }
        else{
            return count;
        }
        
        
    }
}
