package JavaRush9;

public class StackTrace {
    public static void main(String[] args) {
        System.out.println(method1());


    }

    public static String method1() {
        System.out.println(method2());
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        return stackTraceElements[2].getMethodName();
            }

    public static String method2() {
        System.out.println(method3());
        //напишите тут ваш код

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        return stackTraceElements[2].getMethodName();
    }

    public static String method3() {
        System.out.println(method4());
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        return stackTraceElements[2].getMethodName();
    }

    public static String method4() {
        System.out.println(method5());
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static int method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getLineNumber();
    }
}
