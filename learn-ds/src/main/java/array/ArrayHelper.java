package array;

/**
 * Hello world!
 *
 */
public class ArrayHelper {


    public int[] createAndInit(int size, int initWith) {
        int[] anArr = new int[size];

        for (int i = 0; i < size; i++) {
            anArr[i] = initWith;
        }

        return anArr;
    }

    public int[] addAtIndex(int[] arr, int elToAdd, int index) {
        int[] newArr = new int[arr.length + 1];

        for (int newArrCounter = 0, originalArrCounter = 0; newArrCounter < newArr.length; newArrCounter++) {
            if (newArrCounter == index) {
                newArr[newArrCounter] = elToAdd;
            } else {
                newArr[newArrCounter] = arr[originalArrCounter];
                originalArrCounter++;
            }
        }

        return newArr;
    }

    public int[] reverse(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[newArr.length - i - 1];
        }

        return newArr;
    }

    public int getMissing_1(int[] arr, int end_index) {

        int expectedSum = (end_index * (end_index + 1) / 2);
        int time_com = 0;
        int space_com = 0;

        int actual_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            time_com++;
            actual_sum = actual_sum + arr[i];
        }


        System.out.println("SingleMissing");
        System.out.println("Time_Com: " + time_com + " for Input size: " + arr.length);
        System.out.println("Sapce_com: " + space_com + " for Input size: " + arr.length);


        int missing_number = expectedSum - actual_sum;
        return missing_number;
    }

    public int[] getMissing_2(int[] arr, int start_index, int end_index) {
        int time_com = 0;
        int space_com = 0;
        int missing_number_count = end_index - start_index + 1 - arr.length;

        int[] missing_numbers = new int[missing_number_count];
        space_com = space_com + missing_number_count;
        int missing_number_found_increment = 0;
        int arrCounter = 0;

        for (int i = start_index; i <= end_index; i++) {
            time_com++;

            if (arr.length > arrCounter && arr[arrCounter] == i) {
                arrCounter++;
            } else {
                missing_numbers[missing_number_found_increment] = i;
                missing_number_found_increment++;
            }
        }

        System.out.println("MultipleMissing");
        System.out.println("Time_Com: " + time_com + " for Input size: " + (end_index - start_index + 1));
        System.out.println("Sapce_com: " + space_com + " for Input size: " + (end_index - start_index + 1));

        // for (int i = 0; i < missing_numbers.length; i++) {
        //     System.out.println(missing_numbers[i]);
        // }
        return missing_numbers;
    }
}
