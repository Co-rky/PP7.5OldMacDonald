public class Chick extends Animal
{
    //1 Instance Variables
    private int age;

    //2 Constructors
    public Chick (String type, int age)
    {
        super(type, "");
        if (age < 4)
        {
            this.sound = "peep";
        }
        else
        {
            this.sound = "cheep";
        }
        this.age = age;
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
    public int getAge()
    {
        return age;
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
    public void setAge(int age)
    {
        this.age = age;
    }

    //3 toString
}
