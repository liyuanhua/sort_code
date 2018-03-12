/**
 * Created by liyuanhua on 18/3/11.
 */
public class ShellSort {

    public int[] sortExec(int[] array){

        int len = array.length;
        int gap = len / 2;

        while(gap>0) {
            for(int i=gap;i<len;i++)
                for(int j=i;j>=gap;j-=gap) {
                    if (array[j] < array[j - gap]) {
                        int tmp = array[j - gap];
                        array[j - gap] = array[j];
                        array[j] = tmp;
                    }
                }
            gap = gap / 2;
        }

        return array;
    }


    public static void main(String[] args){
        int[] array = {3,2,1,5,4,11,44,0,123};

        ShellSort ss = new ShellSort();
        int [] res = ss.sortExec(array);

        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }

    }
}
