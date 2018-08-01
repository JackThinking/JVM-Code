package Chapter3;

/**
 * Created by Citrix on 2018/8/1.
 */

/*
* 这个例子做出来和书上的不一样，4mb的对象进入了老年代，之前的6mb则被回收了，没有像书上那样6mb进入老年代，4mb进入eden区
* */
public class TestAllocation {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];  // 出现一次Minor GC
    }


}
