public class Animal
{
    //1 Instance Variables
    public String type;
    public String sound;

    //2 Constructors
    public Animal (String type, String sound)
    {
        this.type = type;
        this.sound = sound;
    }

    //4 Getters
    public String getType()
    {
        return type;
    }
    public String getSound()
    {
        return sound;
    }

    //5 Setters
    public void setType(String type)
    {
        this.type = type;
    }
    public void setSound(String sound)
    {
        this.sound = sound;
    }

    //3 toString
    public String toString()
    {
        String output = "Old MacDonald had a farm. E-I-E-I-O." +
                        "\nAnd on that farm he had a " + type + ". E-I-E-I-O." +
                        "\nWith an " + sound + " " + sound + " here." +
                        "\nAnd an " + sound + " " + sound + " there." +
                        "\nHere an " + sound + "." +
                        "\nThere an " + sound + "." +
                        "\nEverywhere an " + sound + " " + sound + "." +
                        "\nOld MacDonald had a farm. E-I-E-I-O.";
        return output;
    }

}
