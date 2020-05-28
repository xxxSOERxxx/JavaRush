package JavaRush5;

public class Friends {
    protected String name;
    protected int age;
//    protected String address;
    protected char sex;

    public Friends(String name) {
        this.name = name;
    }

    public Friends(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friends(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
