package com.avacre.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadPoolExecutorexecuteExample1 {
	public static void main(String[] args) {
		Task task1 = new Task("t1");
		Task task2 = new Task("t2");
		Task task3 = new Task("t3");
		System.out.println("Starting threads");
		ThreadPoolExecutor tExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		tExecutor.execute(task1); // start task1
		tExecutor.execute(task2); // start task2
		tExecutor.execute(task3); // start task3
		tExecutor.shutdown(); // shutdown worker threads
		System.out.println("Threads started, main ends\n");
	}
}

class Task implements Runnable {
	private final int sleepTime;
	private final String threadName;

	public Task(String name) {
		threadName = name;
		sleepTime = 5000;
	}

	public void run() {
		System.out.printf("%s going to sleep for %d milliseconds.\n", threadName, sleepTime);
		try {
			Thread.sleep(sleepTime); // put thread to sleep
		} catch (InterruptedException ex) {
			Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
		}
		System.out.printf("%s done sleeping\n", threadName);
	}
}