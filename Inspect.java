import java.lang.reflect.*;
import java.util.Scanner;
public class Inspect{

    @SuppressWarnings("unchecked")
    public static void main(String [] args) throws Exception{
        Scanner in = new Scanner(System.in);

        Class unknown = Class.forName(args[0]);

        // we created an instance of our unknown class
        Constructor cnstr = unknown.getConstructor();
        Object instance = cnstr.newInstance();

        /*
         * Lets look at the fields of the given class
         */
        Field[] fields = unknown.getDeclaredFields();

        System.out.println("Fields in " + unknown + " :");
        for(Field f : fields){
            f.setAccessible(true);
            System.out.println("\t" + f);
        }

        in.nextLine();

        System.out.println("Values of the Fields :");
        for(Field f : fields){
            System.out.println("\t" + f.getName() + " : " + f.get(instance));
        }


        in.nextLine();

        /*
         * Lets look at the methods of the given class
         */
        Method[] methods = unknown.getDeclaredMethods();


        System.out.println("Methods in " + unknown + " :");
        for(Method m : methods){
            System.out.println("\t" + m);
        }

        in.nextLine();

        /*
         * Does he really have that many toes? lets invoke that method!
         */
        System.out.println("Evaluating the methods in " + unknown + " :");
        for(Method m : methods){
            System.out.println("\t" + m.getName() + " : "
                    + m.invoke(instance, null));
        }
    }

}
