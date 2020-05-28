package JavaRush9;

public class GlubinaStack {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();

    }

    public static int getStackTraceDepth() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        int n = 0;
        for (StackTraceElement element : stackTraceElements)
        {
           n++;
        }
        System.out.println(n);
        return n;
    }
}
