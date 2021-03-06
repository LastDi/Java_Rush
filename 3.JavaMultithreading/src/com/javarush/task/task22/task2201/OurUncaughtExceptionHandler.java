package com.javarush.task.task22.task2201;

import java.util.Arrays;

public class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        final String string = "%s : %s : %s";
        if (Solution.FIRST_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForFirstThread(t, e, string));
        } else if (Solution.SECOND_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForSecondThread(t, e, string));
        } else {
            System.out.println(getFormattedStringForOtherThread(t, e, string));
        }
    }

    protected String getFormattedStringForOtherThread(Thread t, Throwable e, String string) {
        String res = String.format(string, e.getClass().getSimpleName(), e.getCause(), t.getName());
        return res;

    }

    protected String getFormattedStringForSecondThread(Thread t, Throwable e, String string) {
        String res = String.format(string, e.getCause(), e.getClass().getSimpleName(), t.getName());
        return res;
    }

    protected String getFormattedStringForFirstThread(Thread t, Throwable e, String string) {
        String res = String.format(string, t.getName(), e.getClass().getSimpleName(), e.getCause());
        return res;
    }
}

