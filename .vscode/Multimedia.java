public class Multimedia {
    public static void main(String[] args) {
        Audioplayer m = new Audioplayer();
        m.play(1.34);
        m.pause("subtile with video");
        m.stop(5.34);
        System.out.println("Changes are updated:");
        m.display();
    }
}
interface mediaplayer{
    void play(double a );
    void pause(String a);
    void stop(double a);
}
class Audioplayer implements mediaplayer{
double speed;
String subs;
  public void play(double playbackspeed){
      speed = playbackspeed;
  }
    public void pause(String sub) {
        subs= sub;
    }
    public void stop(double time ) {
      speed  = time;
    }
    public void display(){
       System.out.println("playbacck speed updated to:"+speed);
       System.out.println("sub title added:"+subs);
       System.out.println("video stops at:"+speed);
    }
}
