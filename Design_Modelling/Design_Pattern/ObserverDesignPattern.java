import java.util.ArrayList;
import java.util.List;


interface Subject{
    void subscribe(Observer ob);
    void unsubscribe(Observer ob);
    void notifyChanges();

}
interface Observer {
    void notified();

    
}
class YoutubeChannel implements Subject{
    List<Observer> subscriber = new ArrayList<>();
    @Override
    public void subscribe(Observer ob){
        this.subscriber.add( ob);
    }
    @Override
    public void unsubscribe(Observer ob){
        this.subscriber.remove( ob);
    }
    @Override
    public void notifyChanges(){
        
        for(Observer ob: this.subscriber){
            ob.notified();
        }
    }




}
class Subscriber implements Observer{
    @Override
    public void notified(){
        System.out.println("new video uploaded: notification");
    }
}
public class ObserverDesignPattern {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();
        Subscriber sakshi  = new Subscriber();
        channel.subscribe(sakshi);
        channel.notifyChanges();
    }
    
}
