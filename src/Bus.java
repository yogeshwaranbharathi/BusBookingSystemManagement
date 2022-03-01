import java.util.*;

class CustomerDetails {

    public static void main(String[] args) {
        int total=0;
        List <BusDetails> bus = new ArrayList<>();
        List <BusBooking> bookings = new ArrayList<>();
        bus.add(new BusDetails("10010","Chennai to Nagapattinam",2,350,true));
        bus.add(new BusDetails("10100","Velankanni to Chennai",10,450,false));
        bus.add(new BusDetails("10001","Kolkata to Digha",15,100,true));
        int useropt = 1;
        Scanner sc = new Scanner(System.in);
        for (BusDetails b : bus) {
            b.BusDisplayinfo();
        }
        while (useropt == 1) {
            System.out.println("Press 1 for Booking \nPress 2 to exit");
            useropt = sc.nextInt();
            if(useropt == 1) {
                BusBooking book = new BusBooking();
                for(BusDetails d : bus){
                    if( d.getBusName().contains(book.bname)){
                        if(d.getCapacity()!=0){

                            int a= d.getCapacity();
                            int b=d.getFare();
                            bookings.add(book);
                            d.setCapacity(--a);
                            total+=b;
                            System.out.println("Booking is Confirmed, Happy Journey\n");
                            System.out.println("Your Route is "+d.Route);
                            System.out.println("Fare Rs."+d.Fare);
                            System.out.println("Bus Have A/C? " +d.AcNonAC);
                            System.out.println("BUS "+d.BusName+" Balance BusCapacity is "+d.getCapacity());
                            System.out.println("Total Amount RS."+total);
                        }else{
                            System.out.println("Sorry Bus is Full,Try Another Bus ");
                        }

                    }
                    //something here
                }


            }
            if(useropt > 2 ){
                System.out.println("Invalid No");

            }

            }
        }
    }



