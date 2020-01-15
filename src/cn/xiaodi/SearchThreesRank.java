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
    private int rank(Key key){
        int lo=0,hi=N-1;
        while(lo<=hi){
            int mid =lo+(hi-lo)/2;
            int cmp=key.compareTo(keys[mid]);
            if(cmp>0){
                lo=mid+1;
            }else if(cmp<0){
                hi=mid-1;
            }else{
                return mid;
            }
        }
        return lo;
    }
    public Key getkey(Key key){
        if(isEmpty())return null;
        int i=rank(key);
        if(i<N && key.compareTo(keys[i])==0){
            return keys[i];
        }
        return null;
    }
    public Value get(Key key){
        if(!isEmpty())return null;
        int i=rank(key);
//        System.out.println("获取i的中间值为："+i+" key为"+keys[i]);
        if(i<N && key.compareTo(keys[i])==0){
//            System.out.println("获得成功！value值为"+values[i]);
            return values[i];

        }
        return null;
    }
    public  void put(Key key,Value value){
        int i=rank(key);
        if(i<N && key.compareTo(keys[i])==0){
            values[i]=value;
//            System.out.println("i是:"+i+"  n是"+N);
            return;

        }
//        System.out.println("进入赋值语句N:"+N);
        for(int k=N;k>i;k--){
            keys[k]=keys[k-1];values[k]=values[k-1];
        }
//        System.out.println("进入i："+i+"赋值语句");
        keys[i]=key;values[i]=value;
//        System.out.println("赋值成功key="+keys[i]+"  vlaue:"+values[i]);
        N++;

    }
    public void delete(Key key){
        int i=rank(key);
        if(i<N && key.compareTo(keys[i])==0){
            for(int k=i;k<N;k++){
                keys[k]=keys[k+1];values[k]=values[k+1];
            }
        }
        N--;
    }
    public boolean isEmpty(){return N>0;}
}
