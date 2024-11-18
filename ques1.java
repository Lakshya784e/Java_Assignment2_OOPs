

public class ques1{
    public static void main(String args[]){
        int arr1[] = {1,4,7,9};
        int arr2[] = {2,3,5,6,8};
        int arr[] = new int[arr1.length+arr2.length];
        int l1 = 0;
        int l2 = 0;
        int k = 0;
        while(l1<arr1.length && l2<arr2.length){
            if(arr1[l1]<arr2[l2]){
                arr[k++] = arr1[l1++];
            }
            else{
                arr[k++] = arr2[l2++];
            }
        }
        while(l1<arr1.length){
            arr[k++] = arr1[l1++];
        }
        while(l2<arr2.length){
            arr[k++] = arr2[l2++];
        }
       for(int j = 0; j<arr.length; j++){
System.out.print(arr[j]);
        }
    }
}