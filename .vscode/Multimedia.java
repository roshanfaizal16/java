public class Multimedia {
    public static void main(string_opration[] args) {
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
    void pause(string_opration a);
    void stop(double a);
}
class Audioplayer implements mediaplayer{
double speed;
string_opration subs;
  public void play(double playbackspeed){
      speed = playbackspeed;
  }
    public void pause(string_opration sub) {
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
