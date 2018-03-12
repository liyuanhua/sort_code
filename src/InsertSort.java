/**
 * Created by liyuanhua on 16/3/29.
 */
public class InsertSort {

    public int[] sortExec(int[] array){
        int len = array.length;
        int tmp;

        for(int i=1;i<len;i++){
            for(int j=i;j>0;j--){
                if(array[j] < array[j-1]){
                    tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }

        return array;
    }

    public static void main(String[] args){
        int[] array = {3,2,1,5,4,11,44,0,123};

        InsertSort is = new InsertSort();

        int[] res = is.sortExec(array);

        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }


    }
}
