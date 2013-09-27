import java.util.LinkedList;
import java.util.List;

public class GetClass_Ex{

    public static void main(String [] args){

        /*
         * Ex. 1
         */
        List<String> shapes = new LinkedList<String>();
        shapes.add("square");
        shapes.add("triangle");

        System.out.println("shapes has type : "
                + shapes.getClass().getName());


        System.out.println("\n");

        /*
         * Ex. 2
         */
        Object myNum = new Integer(8);

        System.out.println("myNum has type : "
                + myNum.getClass().getName());


        System.out.println("\n");

        /*
         * Ex. 3
         * /
        int x = 5;
        System.out.println("x has type : "
                + x.getClass().getName());


                */


    }
}


