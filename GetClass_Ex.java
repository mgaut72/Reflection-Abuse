import java.util.LinkedList;
import java.util.List;

public class GetClass_Ex{

    public static void main(String [] args){

        /*
         * Ex. 1
         *
         * reflection happens at runtime, so we get LinkedList
         * note that its not a linked list of strings, because behind the
         * scenes, a linked list is just storing objects
         */
        List<String> shapes = new LinkedList<String>();
        shapes.add("square");
        shapes.add("triangle");

        System.out.println("shapes has type : "
                + shapes.getClass().getName());


        System.out.println("\n");

        /*
         * Ex. 2
         *
         * reflection occurs at runtime, so we get Integer
         */
        Object myNum = new Integer(8);

        System.out.println("myNum has type : "
                + myNum.getClass().getName());


        System.out.println("\n");

        /*
         * Ex. 3
         *
         * note that since x is not an object, this will fail, because there
         * is no associated class
         * /
        int x = 5;
        System.out.println("x has type : "
                + x.getClass().getName());


                */


    }
}


