package com.basic.java.高并发.Future;

/**
 * @author Blse
 * @date 2019/4/3
 * @description 这种模式就相当于让你做一件事，做完后自动把结果给我，我不用去等待你完成这件事
 */
public class SyncInvoker {

    public static void main(String[] args) throws InterruptedException {
        FutureService service = new FutureService();
//        Future<String> submit = service.submit(new FutureTask<String>() {
//            @Override
//            public String call() {
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                return "FINISH";
//            }
//        });
        Future<String> submit = service.submit(new FutureTask<String>() {
            @Override
            public String call() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "FINISH";
            }
        },System.out :: println);
        System.out.println("=========");
        System.out.println("do thing");
        Thread.sleep(1000);
        System.out.println("=========");

    }

}
