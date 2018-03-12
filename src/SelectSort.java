/**
 * Created by liyuanhua on 16/3/29.
 */

public class SelectSort {

    public int[] sortExec(int[] array){
        int len = array.length;
        for(int i=0; i<len; i++){
            int min = i;
            for(int j=min+1; j<len; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
        return array;
    }
    public static void main(String[] args){
        int[] array = {3,1,2,5,4,2,11,87,12};

        SelectSort ss = new SelectSort();
        int[] res = ss.sortExec(array);

        for(int i=0; i<res.length; i++)
            System.out.println(res[i]);

    }
}