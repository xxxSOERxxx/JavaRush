package JavaRush11;

public class HowClass {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
        System.out.println(getObjectType(new Object()));
    }


    public static String getObjectType(Object o) {

if (o instanceof Cat){
    return "Кот";
}
        if (o instanceof Tiger){
            return "Тигр";
        }
        if (o instanceof Lion){
            return "Лев";
        }
        if (o instanceof Bull){
            return "Бык";
        }
        if (o instanceof Pig){
            return "Свинья";
        }
        else
        return "Животное";
    }


    public static class Cat {
               }

    public static class Tiger {
           }

    public static class Lion {
           }

    public static class Bull {
           }

    public static class Pig {
           }
}
