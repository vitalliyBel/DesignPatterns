package DecoratorPattern;

public class AnExperiencedWitcher extends TheWitcherDecor{


    public AnExperiencedWitcher(TheWitcher witcher) {
        super(witcher);
    }


    @Override
    public String whatDoesTheWitcherLookLike(){

      return  super.whatDoesTheWitcherLookLike() + "white beard, scarred face";

    }
    @Override
    public String signsOfTheWitcher(){

        return super.signsOfTheWitcher() + "Quen" + "Yerden";

    }

    @Override
    public int basicStrength(){
        return super.basicStrength();

    }

    @Override
    public int basicDexterity(){
        return super.basicDexterity();
    }

}
