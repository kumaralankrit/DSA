public class SelectionSortAlgo {
    public static void main(String[] args) {
        int a[]={36,19,29,12,5};
        selectionSort(a);
    }

    private static void selectionSort(int[] a) {
        int min=0, temp=0;
        for(int i =0;i<a.length;i++){
            min=i;
            for(int j=i+1;j< a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
                temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
        }
        for(int i=0; i< a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
