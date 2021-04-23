package org.table;

import java.lang.reflect.InvocationTargetException;

public class Main {

    private static String CODE_CLASS_NAME = "org.table.array.TwoSum_0001";

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> runnerClass = Class.forName(CODE_CLASS_NAME);
        Runner runner = (Runner) runnerClass.getDeclaredConstructor().newInstance();
        runner.run();
    }
}
