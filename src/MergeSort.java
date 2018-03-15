/**
 * Created by liyuanhua on 18/3/15.
 */
public class MergeSort {



    public void merge(int[] array, int left, int mid, int right){

        int[] tmp = new int[array.length];
        int i = left;
        int j = mid+1;
        int t = 0;

        while(i<=mid && j<= right) {
            if (array[i] <= array[j]) {
                tmp[t] = array[i];
                t++;
                i++;
            }
            else {
                tmp[t] = array[j];
                t++;
                j++;
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            tmp[t] = array[i];
            t++;
            i++;
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            tmp[t] = array[j];
            t++;
            j++;
        }

        t = 0;
        while(left <= right){
            array[left] = tmp[t];
            left++;
            t++;
        }

    }
    public void sort(int []arr){
        sort(arr,0,arr.length-1);
    }
    public void sort(int[] arr,int left,int right){
        if(left<right){
            int mid = (left+right)/2;
            sort(arr,left,mid);//左边归并排序，使得左子序列有序
            sort(arr,mid+1,right);//右边归并排序，使得右子序列有序
            merge(arr, left, mid, right);//将两个有序子数组合并操作
        }
    }
    public static void main(String[] args){
        int[] array = {1,2,4,5,6,1,2,3,7};

        MergeSort ms = new MergeSort();

//      ms.merge(array, 0, (array.length-1)/2, array.length-1);
        ms.sort(array);

        for(int i=0;i<array.length;i++)
            System.out.print(array[i]);
    }
}
