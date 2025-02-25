public class Interface2 {
        public static void main(String[] args) {
        Bicycle m = new Bicycle();
        m.changegear(4);
        m.speed(40);
        m.brake(20);
        System.out.println("Vehicle specs:");
        m.display();

        }
    }
    interface vehicle{
        void changegear(int n);
        void speed(int n);
        void brake(int n);
    }
    class Bicycle implements vehicle{
        int gear;
        int speed;
        public void changegear(int newgear){
             gear = newgear;
        }
        public void speed(int inc){
            speed = speed+inc;
        }
        public void brake(int dec){
            speed = speed - dec;
        }
        public void display(){
            System.out.println("gear:"+gear+"speed:"+speed);
        }
    }