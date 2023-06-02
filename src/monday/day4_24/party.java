package monday.day4_24;

public class party {
    public int teaParty(int tea, int candy) {

//        boolean good = tea >=5 && candy >=5;
//        boolean great = tea >= candy *2 || tea * 2 <= candy;
//
//
//        return ! good ? 0 : great ? 2 : 1;
//       // return tea < 5 || candy < 5 ? 0 : tea >= candy * 2 || tea * 2 <= candy ? 2 : 1;

        if( tea < 5 || candy <5) {
            return 0;
        } else if (tea == (2 * candy) || candy==(2 * tea)){
            return  2;
        }
        return 1;
        }


}
/*
if( tea < 5 || candy <5) {

        return 0;
        }

        if(tea == (2 * candy) || candy==(2 * tea)){
        return = 2;
        }
        return 1;

 */