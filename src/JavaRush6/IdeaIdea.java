package JavaRush6;

public class IdeaIdea {
           public static class Idea  {
            public String getDescription(){
                return ("aaa");
            }
        }
            public static void main(String[] args) {
            printIdea(new Idea());
        }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
         }
     }


