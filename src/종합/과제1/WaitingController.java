package 종합.과제1;

public class WaitingController {
    Waiting[] waitings = new Waiting[100];

    boolean doPost(String phone, int count){
        Waiting waiting = new Waiting();
        waiting.phone = phone;
        waiting.count = count;
        for(int i = 0; i < waitings.length; i++){
            if(waitings[i] == null){
                waitings[i] = waiting;
                return true;
            }
        }
        return false;
    }
    Waiting [] doGet() {return waitings;}
}
