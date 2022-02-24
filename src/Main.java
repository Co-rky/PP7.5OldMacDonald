public class Main
{
    public static void main (String[] args)
    {
        Animal pig = new Pig("pig", "oink", true);
        Animal cow = new Cow("cow", "moo", "Kevin");
        Animal chickYoung = new Chick("chickYoung", 2);
        Animal chickOld = new Chick("chickOld", 5);
        Farmer farmer = new Farmer("Farm in Kansas");

        Animal[] Farm = {pig, cow, chickYoung, chickOld};
        farmer.singVerse(Farm, 0);
        farmer.singVerse(Farm, 1);
        farmer.singVerse(Farm, 2);
        farmer.singVerse(Farm, 3);
    }
}
