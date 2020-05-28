package JavaRush5;

public class Person {
    public static void main(String[] args) {

    }

        protected String name;
        protected int age;
        protected String address;
        protected char sex;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getSex() {
        return sex;
    }
    public void setName(String name) {
                this.name = name;
    }
    public void setAge(int age) {
                this.age = age;
    }

    public void setSex(char sex) {
              this.sex = sex;
    }
}
