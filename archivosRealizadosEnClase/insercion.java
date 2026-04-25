public class insercion {
    public static void main(String[] args) {
        int[] arr = {8,7,9,1};
        int n = arr.length;

        for (int i : arr){
            System.out.println(i);
        }
        for(int i = 1; i < n; i++){

            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        for (int i : arr){
            System.out.println(i);
        }
    }
}
