package JavaRush13;



public class Translate {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }
    public static class Dog implements Movable, Eat{
        public void move(){}
       public void eat(){}
    }
    public static class Cat implements Movable, Eat, Edible{
        public void move(){}
       public void beEaten(){}
        public void eat(){}
    }
    public static class Mouse implements Movable, Edible{
        public void move(){}
        public void beEaten(){}
    }
}
