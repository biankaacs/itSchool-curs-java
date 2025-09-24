package org.example.session32;

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class ConcurrencyDemo {

    //exemple 1 race condition
    static class UnsafeCounter{
        private int count = 0;
        public void increment(){count++;}
        public int getCount() {return count;}
    }

    static class SyncrinizedCounter{
        private int count = 0;
        public synchronized void increment(){count++;}
        public int getCount() {return count;}
    }

    static class AtomicCounter{
        private final AtomicInteger count = new AtomicInteger(0);
        public void increment(){count.incrementAndGet();}
        public int getCount() {return count.get();}
    }

    //example 2 deadlock
    static class DeadlockDemo{
        private final Object lockA = new Object();
        private final Object lockB = new Object();

        public void task1() throws InterruptedException {
            synchronized (lockA){
                sleep(100);
                synchronized (lockB){
                    System.out.println(Thread.currentThread().getName()+" required A and B");
                }
            }
        }

        public void task2() throws InterruptedException {
            synchronized (lockB){
                sleep(100);
                synchronized (lockA){
                    System.out.println(Thread.currentThread().getName()+" required B and A");
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        UnsafeCounter unsafe = new UnsafeCounter();
        Thread t1 = new Thread(() -> { for (int i = 0; i < 10000; i++) unsafe.increment();}, "Thread unsafe 1");
        Thread t2 = new Thread(() -> { for (int i = 0; i < 10000; i++) unsafe.increment();}, "Thread unsafe 2");
        t1.start();t2.start();t1.join();t2.join();
        System.out.println("Unsafe Counter results over 20000 execution: " + unsafe.getCount());

        SyncrinizedCounter syncrinizedCounter = new SyncrinizedCounter();
        Thread t3 = new Thread(() -> { for (int i = 0; i < 10000; i++) syncrinizedCounter.increment();}, "Thread sync 3");
        Thread t4 = new Thread(() -> { for (int i = 0; i < 10000; i++) syncrinizedCounter.increment();}, "Thread sync 4");
        t3.start();t4.start();t3.join();t4.join();
        System.out.println("Synchronized Counter results over 20000 execution: " + syncrinizedCounter.getCount());

        AtomicCounter atomicCounter = new AtomicCounter();
        Thread t5 = new Thread(() -> { for (int i = 0; i < 10000; i++) atomicCounter.increment();}, "Thread atomic 5");
        Thread t6 = new Thread(() -> { for (int i = 0; i < 10000; i++) atomicCounter.increment();}, "Thread atomic 6");
        t5.start();t6.start();t5.join();t6.join();
        System.out.println("Atomic Counter results over 20000 execution: " + atomicCounter.getCount());

        DeadlockDemo deadlockDemo = new DeadlockDemo();
        Thread d1 = new Thread(() -> {
            try { deadlockDemo.task1(); } catch (InterruptedException e) { throw new RuntimeException(e); }
        }, "Thread deadlock 1");
        Thread d2 = new Thread(() -> {
            try { deadlockDemo.task2(); } catch (InterruptedException e) { throw new RuntimeException(e); }
        }, "Thread deadlock 2");
        d1.start();d2.start();
        System.out.println("If you see this message the deadlock was avoided");
    }
}
