package JavaRush11;

public class Interface {
    public static void main(String[] args) {

    }

    public class Cat implements CanClimb, CanRun{
        public void climb(){};
        public void run(){};
    }

    public class Dog implements CanRun{
              public void run(){};
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanFly, CanRun{
        public void run(){};
        public void fly(){};
    }
    public interface CanFly{
        void fly();
    }
    public interface CanClimb{
        void climb();
    }
    public interface CanRun{
        void run();
    }
}
