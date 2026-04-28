class TrafficSignal extends Thread { 
    public void run() { 
    try { 
        while (true) { 
            System.out.println("RED Light - STOP"); 
            Thread.sleep(2000); 

            System.out.println("YELLOW Light - READY"); 
            Thread.sleep(2000); 

            System.out.println("GREEN Light - GO"); 
            Thread.sleep(2000); 
        }   
    } catch (InterruptedException e) { 
        System.out.println("Signal Interrupted"); 
    } 
    } 
} 
class Traffic { 
    public static void main(String[] args) { 
    TrafficSignal t = new TrafficSignal(); 
    t.start(); // starts a new thread 
    } 
} 