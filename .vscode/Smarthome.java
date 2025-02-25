import java.util.*;
public class Smarthome {
     final static class Device{
        Scanner in = new Scanner(System.in);
        final static int MAX_DEVICES = 50;
        int ID;
        String name;
        public void getDeviceinfo(){
            System.out.println("Enter device ID :");
            ID = in.nextInt();
            System.out.println("Enter device name:");
            name = in.nextLine();
           // System.out.print("Device ID:"+ID);
            //System.out.println("Device Name:"+name);
        } 
     }
        abstract static class  Devicetype{
        abstract String getDevicecatagory();
     }
     final static class Configuration{
        final static int MAX_POWER_LIMIT = 5000;

     }
     abstract static class lightdevice extends Devicetype{
        public String getDevicecatagory(){
            return "lightdevice";
        }
     }
     abstract static class fandevice extends Devicetype{
        public String getDevicecatagory(){
            return "fandevice";
        }
}
public static void main(String[] args) {
    Device m = new Device();
    m.getDeviceinfo();
    System.out.print(Configuration.MAX_POWER_LIMIT);
    Devicetype obj = new Devicetype();
    Smarthome.ligthdevice obj2 = new Smarthome.lightdevice();
} 
}
