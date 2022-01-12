package DecoratorPattern;

public abstract class TheWitcherDecor implements TheWitcher {

    protected final TheWitcher witcher;

    public TheWitcherDecor(TheWitcher witcher) {
        this.witcher = witcher;
    }

    @Override
    public String whatDoesTheWitcherLookLike() {
        return witcher.whatDoesTheWitcherLookLike();
    }

    @Override
    public String signsOfTheWitcher(){

        return witcher.signsOfTheWitcher();

    }

    @Override
    public int basicStrength(){
        return witcher.basicStrength();

    }

    @Override
    public int basicDexterity(){
        return witcher.basicDexterity();
    }

}


