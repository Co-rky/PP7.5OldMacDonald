public class Cow extends Animal
{
    //1 Instance Variables
    private String name;

    //2 Constructors
    public Cow (String type, String sound, String name)
    {
        super(type, sound);
        this.name = name;
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
    public String getName()
    {
        return name;
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
    public void setName(String name)
    {
        this.name = name;
    }

    //3 toString
    public String toString()
    {
        String output = super.toString() +
                        "That cow's name was " + name;
        return output;
    }
}
