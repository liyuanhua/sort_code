/**
 * Created by liyuanhua on 16/3/29.
 */
public class InsertSort {

    int[] array = {3,1,2,5,4};

    public void sortExec(int[] array){

        for(int i = 1;i < array.length;i++){
            for(int j = i;j > 0 && array[j] < array[j-1];j--){
                int tmp = array[j];
                array[j] = array[j-1];
                array[j-1] = tmp;
            }

        }



    }


    public static void main(String[] args){

        InsertSort is = new InsertSort();

        is.sortExec(is.array);

        for(int i = 0; i < is.array.length;i++){
            System.out.println(is.array[i]);

        }

    }
}
