import java.util.Arrays;

public class SelectionSortTestD {
    Integer[] a;
    
    public SelectionSortTestD(Integer[] a) {
        this.a = a;
    }

    public void swap(Integer[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void selectionSortDescending(Integer[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[max_idx]) {  
                    max_idx = j;
                }
                System.out.println(
                    "i = " + i +
                    "; j = " + j +
                    "; cur_max = " + a[max_idx] + 
                    "; " + Arrays.deepToString(a)
                );
            }
            swap(a, i, max_idx);
        }
    }

    public static void main(String[] args) {
        Integer[] a = {76, 6, 107, 92, 21, 23, 5, 9, 8, 8143};
        SelectionSortTestD sorter = new SelectionSortTestD(a);
        
        System.out.println("Array before sorting: " + Arrays.deepToString(a));
        
        sorter.selectionSortDescending(a);
        
        System.out.println("Array after sorting: " + Arrays.deepToString(a));
    }
}
