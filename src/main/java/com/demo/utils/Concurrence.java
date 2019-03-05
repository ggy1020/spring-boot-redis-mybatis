package com.demo.utils;

public class Concurrence {
        private long count = 0;
        private void add10K() {
            int idx = 0;
            while(idx++ < 100000000) {
                System.out.println(Thread.currentThread().getName()+"=================="+this.count);
                count += 1;
            }
        }
        public static long calc() throws InterruptedException {
            final Concurrence test = new Concurrence();
            // 创建两个线程，执行 add() 操作
            Thread th1 = new Thread(()->{
                test.add10K();
            });
            th1.setName("111111111");
            Thread th2 = new Thread(()->{
                test.add10K();
            });
            th2.setName("2222222");
            // 启动两个线程
            th1.start();
            th2.start();
            // 等待两个线程执行结束
            th1.join();
            th2.join();
            return test.count;
        }

}
