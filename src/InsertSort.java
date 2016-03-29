/**
 * Created by liyuanhua on 16/3/29.
 */
public class InsertSort {

    public void sortExec(int[] array){

        for(int i = 1;i < array.length;i++){
            for(int j = i;array[i] < array[j];j--){
                int tmp = array[i];
                array[i] = array[j];
                array[j] = array[i];
            }

        }



    }


    public static void main(String[] args){

        QuickSort qs = new QuickSort();

        qs.sortExec(qs.array,0,qs.array.length - 1 );

        for(int i = 0; i < qs.array.length;i++){
            System.out.println(qs.array[i]);

        }

    }
}
