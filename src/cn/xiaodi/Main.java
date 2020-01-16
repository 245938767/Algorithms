package cn.xiaodi;

public class Main {
    public static void main(String[]args){
//        int[]a={5,4,6,9,8,7,3,5,7,5};
//        ShellSort shellSort=new ShellSort(a);
//        SelectSort selectSort=new SelectSort(a);
//        SortShow(a);
//        符号表的操作
        SearchThreesRank<String,String> searchThreesRank=new SearchThreesRank<>(10);
        searchThreesRank.put("1","1awdfa");
        searchThreesRank.put("2","2awdfa");
        searchThreesRank.put("3","3awdfsdffa");
        searchThreesRank.put("4","4awdfsdfa");
        searchThreesRank.put("5","5awsfdsdffa");
        searchThreesRank.put("6","6a66wdsdffa");
        searchThreesRank.put("7","7awdsdffa");
        searchThreesRank.put("8","8asfwdfa");
        searchThreesRank.put("9","9awdsffa");
        searchThreesRank.getAll();
        searchThreesRank.delete("5");
        searchThreesRank.delete("8");
        searchThreesRank.delete("3");
        System.out.println("删除后");
        searchThreesRank.getAll();
    }
    private static void SortShow(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
