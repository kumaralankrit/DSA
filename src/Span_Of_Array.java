public class Span_Of_Array {
    public static void main(String[] args){
        int[] arr={23,43,56,67,23};

        for(int i=0; i<arr.length; i++){
        }
        int max= arr[0];
        int min= arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int Span= max-min;
        System.out.println(Span);
    }
}
