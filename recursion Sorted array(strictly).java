class Recursion {

    public static boolean isSorted(int arr[], int idx) {

        // Base Case
        if(idx == arr.length - 1){
            return true;
        }

        // Check current and next element
        if(arr[idx] < arr[idx + 1]){

            return isSorted(arr, idx + 1);

        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 4};

        System.out.println(isSorted(arr, 0));
    }
}