/**
 * Created by liyuanhua on 16/3/29.
 */
public class QuickSort {

    int[] array = {3,1,2,5,4};

    public static void sortExec(int[] array,int l,int r){

       if(l < r){

           int i = l;
           int j = r;
           int key = array[l];

           while(i < j){

               while(i < j && key < array[j]){
                   j--;
               }

               if(i < j){
                   array[i] = array[j];
                   i++;
               }

               while(i < j && key > array[i]){
                   i++;
               }

               if(i < j){
                   array[j] = array[i];
                   j--;
               }



           }

           array[i] = key;

           sortExec(array,l,j - 1);
           sortExec(array,j + 1,r);





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
