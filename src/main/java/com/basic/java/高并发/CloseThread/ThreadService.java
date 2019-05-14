package com.basic.java.高并发.CloseThread;

/**
 * @author Blse
 * @date 2019/4/2
 * @description  模拟实现过期方法stop的功能
 *                比如在读取一个资源的时候，预期是30分钟，实际是1小时，这时候可以通过暴力的方式停止线程
 */
public class ThreadService {
    //执行线程
    private Thread executeThread;
    private boolean finished = false;

    public void execute(Runnable task) {
        executeThread = new Thread() {
            @Override
            public void run() {
                //创建一个守护线程来执行真正要执行的内容
                Thread runner = new Thread(task);
                runner.setDaemon(true);
                runner.start();
                try{
                    //这里用了join()，所以执行线程要等到守护线程执行完毕才会停止
                    runner.join();
                    finished = true;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        executeThread.start();
    }

    //强制关闭
    public void shutdown(long mills) {
        long currentTime = System.currentTimeMillis();
        //！finished说明守护线程还没执行完毕
        while (!finished) {
            //计算出实际运行实际，比较是否超时，如果超时就中断
            if ((System.currentTimeMillis() - currentTime) >= mills) {
                System.out.println("任务超时");
                executeThread.interrupt();
                break;
            }
            //即没被打断也没超时
            try {
                executeThread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("执行线程被打断");
                break;
            }
        }
        finished = false;
    }

}
