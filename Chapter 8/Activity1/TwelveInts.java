package Activity1;

public class TwelveInts {
    public static void main(String[] args) {
        int[] numbers = {12, 11, 10, 9, 8, 7, 1, 2, 3, 4, 5, 6};
        printftol(numbers);
        printltof(numbers);
    }

    static void printftol(int[] valuesArr){
        System.out.print("First To Last: ");
        for(int i = 0; i < valuesArr.length; i++){
            System.out.print(valuesArr[i] + " ");
        }
        System.out.println();
    } 

    static void printltof(int[] valuesArr){
        System.out.print("Last To First: ");
        for(int i = valuesArr.length-1; i >= 0; i--){
            System.out.print(valuesArr[i] + " ");
        }
        System.out.println();
    } 
}
