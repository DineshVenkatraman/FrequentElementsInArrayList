public class Main {
    public static void main(String[] args) {
        FrequentElementsInArray objArray=new FrequentElementsInArray();
        int[] arr = {5, 8, 5, 7, 8, 10};
        int size = arr.length;
        objArray.countFrequency(arr, size);
    }
}