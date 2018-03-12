/**
 * Created by liyuanhua on 16/3/30.
 */
public class BibleSort {
    public int[] sortExec(int[] array){
        int len = array.length;
        for(int i=0;i<len-1;i++)
            for(int j=0;j<len-1-i;j++){
                if(array[j]>array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }

        return array;
    }

    public static void main(String[] args){
        int[] array = {2,1,4,5,3};
        BibleSort bs = new BibleSort();
        int[] res = bs.sortExec(array);

        for(int i=0;i<array.length;i++){
            System.out.println(res[i]);
        }

    }

}
