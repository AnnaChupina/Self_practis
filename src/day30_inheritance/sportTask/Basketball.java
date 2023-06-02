package day30_inheritance.sportTask;

public class Basketball extends Sport{
    public Basketball(String name, int numberOfPlayers, int numberOfReferee, String rules) {
        super(name, numberOfPlayers, numberOfReferee, rules);
    }
    public void jumpsToBusket(){
        System.out.println(getName() + " jumps near busket a lot");
    }
}
