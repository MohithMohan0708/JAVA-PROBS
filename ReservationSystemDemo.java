class ReservationSystem{
    private static int availableseats=100;
    public synchronized void reserve(String personName,int requestedseats)
    {
        System.out.println("person name:"+personName);
        System.out.println("available seats:"+availableseats+"requestedseats:"+requestedseats);
        if(availableseats>=requestedseats)
        {
            System.out.println("Seats available reserve now");
            availableseats-=requestedseats;
            System.out.println("seats booked");

        }
        else
        {
            System.out.println("seats not available");
        }
        System.out.println(personName+" leaving");
    }

}

class Personthread extends Thread{
    private ReservationSystem reservationSystem;
    private String personName;
    private int requestedseats;
    public Personthread(ReservationSystem reservationSystem,String personName,int requestedseats) 
    {
        this.reservationSystem=reservationSystem;
        this.personName=personName;
        this.requestedseats=requestedseats;
    }
    public void run()
    {
        reservationSystem.reserve(personName,requestedseats);
    }
}



public class ReservationSystemDemo {
    public static void main(String args[])
    {
        ReservationSystem reservationSystem=new ReservationSystem();
        Personthread person1 =new Personthread(reservationSystem, "person-1", 5);
        Personthread person2= new Personthread(reservationSystem,"person-2",10);
        Personthread person3=new Personthread(reservationSystem,"person-3",100);
        person1.start();
        person2.start();
        person3.start();

    }
    
}
