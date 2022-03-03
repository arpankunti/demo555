public class canPackww {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if((bigCount<0)||(smallCount<0)||(goal<0)){return false;}

     int weightbigCount=5;
    int  weightsmallCount=1;
    if(((bigCount*weightbigCount)+(smallCount*weightsmallCount))==goal){
        return true;
    }
     if(((bigCount*weightbigCount)+(smallCount*weightsmallCount))>goal){
        if (weightbigCount*bigCount>goal){
            return false;
        }
        }
     for (int i=1;i<=5;i++){
         if((((bigCount*weightbigCount)+(smallCount*weightsmallCount))-goal)==i*weightbigCount||((((bigCount*weightbigCount)+(smallCount*weightsmallCount))-goal)==i*weightsmallCount)){
             return true;
         }
    }
    return false;

    }

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(2,1,5));
    }
}
