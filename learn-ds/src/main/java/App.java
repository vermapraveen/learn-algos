import array.ArrayHelper;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayHelper helper = new ArrayHelper();
        int[] testArray = helper.createAndInit(3, 1);

        for (int i = 3; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
        // int sizeOfArr = 10;
        // int initWith = -1;

        // App sut = new App();
        // int[] arr = sut.createAndInit(sizeOfArr, initWith);

        // int[] updatedArr = sut.addAtIndex(arr, 5, 2);
    }
}
