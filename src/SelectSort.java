/**
 * Created by liyuanhua on 16/3/29.
 */
public class SelectSort {

    int[] array = {3,1,2,5,4};


    public static void sortExec(int[] array){

        for(int i = 0;i < array.length - 1;i++){
            int min = i;
            for(int j = i + 1;j < array.length;j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }

    }

    public static void main(String[] args){

        SelectSort ss = new SelectSort();

        ss.sortExec(ss.array);

        for(int i = 0; i < ss.array.length;i++){
            System.out.println(ss.array[i]);

        }

    }
}
