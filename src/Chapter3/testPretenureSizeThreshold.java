package Chapter3;

/**
 * Created by Citrix on 2018/8/1.
 */
public class testPretenureSizeThreshold {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     * -XX:PretenureSizeThreshold=3145728
     */
    public static void main(String[] args) {
        byte[] allocation;
        allocation = new byte[4 * _1MB];  //直接分配在老年代中
    }


}
