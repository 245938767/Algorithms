package cn.xiaodi;

public class Main {
    public static void main(String[]args){
        int[]a={5,4,6,9,8,7,3,5,7,5};
//        ShellSort shellSort=new ShellSort(a);
        SelectSort selectSort=new SelectSort(a);
        SortShow(a);
    }
    private static void SortShow(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
