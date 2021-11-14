package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread{
    private Thread target;

    public LoggingStateThread(Thread target) {
        this.target = target;
    }

    @Override
    public void run() {
        State state = target.getState();
        System.out.println(state);
        State newState;
        while (target.getState() != State.TERMINATED) {
            newState = target.getState();
            if (newState != state) {
                state = newState;
                System.out.println(state);
            }
        }
        System.out.println(target.getState());
    }
}
