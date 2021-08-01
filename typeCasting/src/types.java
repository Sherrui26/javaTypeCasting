import java.util.*;

public class types {
    public static void main(String[] args){
        
        /*byte a = 127;
        short b = 32767;
        char c = 65535;
        int d = 2147483647;
        long e = 9223372036854775807L;
        float f; //3.40282347 x 10^38
        double g; //1.7976931348623157 x 10^308
        int z = (int) 1.2;
        System.out.println(z);*/
        
        ArrayList nokiaAL = new ArrayList();
        LinkedList phoneAL = new LinkedList();
        
        Smartphone a = new Smartphone("Nokia","Nokia 7 Plus",1300,260101);
        Smartphone b = new Smartphone("Samsung","Galaxy S8",900,220100);
        Smartphone c = new Smartphone("Xiaomi","Mi 10",1500,150031);
        Smartphone d = new Smartphone("Nokia","3310",1500,101001);
        Smartphone e = new Smartphone("Samsung","Galaxy Y",400,774101);
        Smartphone f = new Smartphone("Apple","iPhone 7",1100,316300);
        
        phoneAL.insertAtFront(f);
        phoneAL.insertAtFront(e);
        phoneAL.insertAtFront(d);
        phoneAL.insertAtFront(c);
        phoneAL.insertAtFront(b);
        phoneAL.insertAtFront(a);
        
        
       
        
    }
}
