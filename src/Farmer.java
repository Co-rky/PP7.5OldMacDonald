public class Farmer
{
    //1 Instance Variables
    private String locationOfSinging;

    //2 Constructors
    public Farmer(String locationOfSinging)
    {
        this.locationOfSinging = locationOfSinging;
    }

    //4 Getters
    public String getLocationOfSinging()
    {
        return locationOfSinging;
    }

    //5 Setters
    public void setLocationOfSinging(String locationOfSinging)
    {
        this.locationOfSinging = locationOfSinging;
    }

    //6 Brain
    public String singVerse(Animal[] farm)
    {
        String output = "";
        String cowName = "";
        for(Animal i : farm)
        {
            if (i.getType().equals("cow"))
                cowName += " named " + ((Cow)i).getName();
            output += "\nOld MacDonald had a farm. E-I-E-I-O." +
                      "\nAnd on that farm he had a " + i.getType() + cowName + ". E-I-E-I-O." +
                      "\nWith an " + i.getSound() + " " + i.getSound() + " here." +
                      "\nAnd an " + i.getSound() + " " + i.getSound() + " there." +
                      "\nHere an " + i.getSound() + "." +
                      "\nThere an " + i.getSound() + "." +
                      "\nEverywhere an " + i.getSound() + " " + i.getSound() + "." +
                      "\nOld MacDonald had a farm. E-I-E-I-O.\n";
            cowName = "";
        }
        return output;
    }

    //3 toString
}
