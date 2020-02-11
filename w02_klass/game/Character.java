public class Character{
    private int x;
    private int y;

    String slogan = "";

    private String name;
    private CharacterType characterType;
    private Direction direction;

    // constructor
    public Character(final String name, final CharacterType characterType){
        this.name = name;
        this.characterType = characterType;

        this.x = 30;
        this.y = 30;

    }

    @Override
    public String toString(){
        return "My name is " + name + " and I am at x:" + x + " y:" + y + ". AND I SAY: " + slogan;
    }

}