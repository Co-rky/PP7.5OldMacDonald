public class Pig extends Animal
{
    //1 Instance Variables
    private boolean isPig;

    //2 Constructors
    public Pig (String type, String sound, boolean isPig)
    {
        super(type, sound);
        this.isPig = isPig;
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
    public boolean isPig()
    {
        return isPig;
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
    public void setIsPig(boolean isPig)
    {
        this.isPig = isPig;
    }

    //3 toString
}
