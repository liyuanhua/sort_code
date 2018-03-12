/**
 * Created by liyuanhua on 16/3/29.
 */
public class QuickSort{

    public void sortExec(int[] array, int l, int r){

        if(l >= r)
            return;

        int i = l;
        int j= r;
        int p = array[l];

        while(i<j) {
            while (array[j] >= p && i < j) {
                j--;
            }
            while (array[i] <= p && i < j) {
                i++;
            }

            if(i<j){
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        array[l] = array[i];
        array[i] = p;

        sortExec(array, l, i-1);
        sortExec(array, i+1, r);

    }

    public static void main(String[] args){
        int[] array = {2,1,4,5,3};
        QuickSort qs = new QuickSort();

        qs.sortExec(array, 0, array.length-1);

        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}