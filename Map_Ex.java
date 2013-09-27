import java.util.*;
import java.lang.reflect.*;
class Map_Ex{

    private static Integer square(Integer x){
        return x*x;
    }

    private static Integer timesTwo(Integer x){ return x+x; }

    private static String allButFirst(String s){
        return s.substring(1);
    }

    @SuppressWarnings("unchecked")
    private static List map(String method, List lst){
        Method m = null;

        try{
            Class<?> c = Class.forName("Map_Ex");
            Class<?> type = lst.get(0).getClass();

            m = c.getDeclaredMethod(method, type);

            for(int i=0; i<lst.size(); i++){
                Object n = lst.remove(0);
                n = m.invoke(null, n);
                lst.add(n);
            }


        }
        catch(Exception e){
            System.out.println("couldnt use the method");
        }

        return lst;


    }



    @SuppressWarnings("unchecked")
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println("Original list");
        System.out.println(nums);

        in.nextLine();

        nums = map("square", nums);

        System.out.println("After calling map, with the Method \"square\"");
        System.out.println(nums);

        in.nextLine();

        System.out.println("After calling map, with the Method \"timesTwo\"");
        nums = map("timesTwo", nums);
        System.out.println(nums);

        System.out.println("\n\n\n");

        in.nextLine();

        List<String> strs = new LinkedList<>();
        strs.add("Clark");
        strs.add("slob");
        strs.add("struck");

        System.out.println("Original list");
        System.out.println(strs);

        in.nextLine();

        System.out.println("After calling map, with the Method \"allButFirst\"");
        strs = map("allButFirst", strs);
        System.out.println(strs);

    }



}
