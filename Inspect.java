/*
 * This class uses reflection to explore the methods and fields of
 * a given class, even if they are private
 */
import java.lang.reflect.*;
import java.util.Scanner;
public class Inspect{

    @SuppressWarnings("unchecked")
    public static void main(String [] args) throws Exception{

        Class unknown = Class.forName("SuperSecret");

        // we created an instance of our unknown class
        Constructor cnstr = unknown.getConstructor();
        Object instance = cnstr.newInstance();

        /*
         * Lets look at the fields of the given class
         */
        Field[] fields = unknown.getDeclaredFields();

        System.out.println("Fields in " + unknown + " :");
        for(Field f : fields){
            f.setAccessible(true);  // make the field public, no matter what
            System.out.println("\t" + f);
        }


        System.out.println("Values of the Fields :");
        for(Field f : fields){
            System.out.println("\t" + f.getName() + " : " + f.get(instance));
        }



        /*
         * Lets look at the methods of the given class
         */
        Method[] methods = unknown.getDeclaredMethods();


        System.out.println("Methods in " + unknown + " :");
        for(Method m : methods){
            System.out.println("\t" + m);
        }


        /*
         * This comment doesn't make sense if you are just reading this code
         * Does he really have that many toes? lets invoke that method!
         */
        System.out.println("Evaluating the methods in " + unknown + " :");
        for(Method m : methods){
            System.out.println("\t" + m.getName() + " : "

                    /* invode the method m from the instance of our class
                     * called "instance", with no extra parameters, hence the
                     * null argument
                     */
                    + m.invoke(instance, null));
        }
    }

}
