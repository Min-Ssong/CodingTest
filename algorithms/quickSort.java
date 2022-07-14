package algorithms;

public class quickSort {    
    void sort(int data[], int start, int end){
        if ( start >= end ) {
            return;
        }

        int key = start;
        int i = start + 1;
        int j = end;
        int temp = 0;

        while (i <= j) {
            while(i <= end && data[i] <= data[key]) {
                i++;
            }
            while(j > start && data[j] >= data[key]) {
                j--;
            }
            if(i > j) {
                temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            }else{
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        sort(data, start, j - 1);
        sort(data, j + 1, end);
    }

    public static void main(String args[]){
        int data[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int n = data.length;

        quickSort quickS = new quickSort();
        quickS.sort(data, 0, n-1);

        for( int i = 0; i < data.length; i++ ) {
            System.out.print(data[i] + " ");
        }
    }
}
