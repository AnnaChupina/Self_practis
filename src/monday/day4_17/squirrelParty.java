package monday.day4_17;

public class squirrelParty {
    public boolean squirrelPlay(int temp, boolean isSummer){
        int maxRange = isSummer ? 100 : 90;


      return temp >= 60 && temp <= maxRange;
    }
}
