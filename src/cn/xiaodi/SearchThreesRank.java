package cn.xiaodi;

public class SearchThreesRank <Key extends Comparable<Key>,Value>{
    private Key[]keys;
    private Value[]values;
    private int N;
    public SearchThreesRank(int capacity){
        keys=(Key[])new Comparable[capacity];
        values=(Value[])new Comparable[capacity];
    }
    public int Size(){return N;}
    public int rank(Key key){
        int lo=0,hi=N-1;
        while(lo<=hi){
            int mid =lo+(hi-lo)/2;
        }
        return -1;
    }
}
