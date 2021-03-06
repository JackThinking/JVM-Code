package Chapter12;

/**
 * Created by Citrix on 2018-12-31.
 */
public class VolatileTest {
    /*
    * 得到的数字为112135，小于200000
    * */
    public static volatile int race = 0;

    public static void increase() {
        race++;
    }
    private static final int THREAD_COUNT = 20;
    public static void main(String[] args) throws Exception {
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {//静态内部类（接口）的方式重写run()方法
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println(race);
    }
}
