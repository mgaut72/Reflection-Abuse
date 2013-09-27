public class SuperSecret{


    static String  secret = "I listen to Lady Gaga";

    static boolean amIAfraidOfTheDark = true;

    private int    numberOfToesIHavePerFoot;

    public SuperSecret(){
        numberOfToesIHavePerFoot = 4;
    }

    public int actualNumberOfToesIHave(){
        numberOfToesIHavePerFoot = 5;
        return numberOfToesIHavePerFoot;
    }

}
