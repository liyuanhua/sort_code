/**
 * Created by liyuanhua on 16/3/30.
 */
public class BibleSort {

    static int [] array = {3,1,2,5,4};

    public static void sortExec(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args){

        sortExec(array);
        for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);

        }

    }
}
