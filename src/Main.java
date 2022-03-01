public class Main
{
    public static void main (String[] args)
    {
        Animal pig = new Pig("pig", "oink", true);
        Animal cow = new Cow("cow", "moo", "Beth");
        Animal chickYoung = new Chick("chick", "", 2);
        Animal chickOld = new Chick("chicken", "", 5);
        Farmer farmer = new Farmer("Farm in Kansas");

        Animal[] Farm = {pig, cow, chickYoung, chickOld};
        System.out.println(farmer.singVerse(Farm));

    }
}
