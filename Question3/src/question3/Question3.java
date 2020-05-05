package question3;
public class Question3 {
    public static void main(String[] args) {
        int total_players=16;
        int bowlers =4;
        int wkt_keeper=2;
        int players=11;
        int least_bowlers=3;
        int least_wkt_keeper=1;
        //Choosing 3 bowlers out of 4
        int f=1;
        for(int i=bowlers;i>0;i--){
        f=f*i;
        }
        int f1=1;
        int f3=1;
        for(int i=least_bowlers;i>0;i--){
        f1=f1*i;
        }
        int sol1=f/f1;
        //choosing 1 wicket keeper out of 2 so we have to factorial of 2;
        for(int i=wkt_keeper;i>0;i--){
        f3=f3*i;
        }
        int answer=sol1*f*f1*f3;
        System.out.println(answer);}}