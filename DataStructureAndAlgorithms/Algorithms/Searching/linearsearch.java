public class linearsearch {

    public static int linearsearch(int arr[], int target) {
        for(int i = 0; i < arr.length; i++) {
                if(arr[i] == target) {
                    return i;
                }
        }

            return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 5, 7, 9, 11};
        int result = linearsearch(arr, 9);
        System.out.println(result);
    }
}