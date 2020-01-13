package cn.xiaodi;

public class SearchThreesRank <Key extends Comparable<Key>,Value>{
    private Key[]keys;
    private Value[]values;
    private int N;
    public SearchThreesRank(int capacity){
        keys=(Key[])new Comparable[capacity];
        values=(Value[])new Comparable[capacity];
    }
}
