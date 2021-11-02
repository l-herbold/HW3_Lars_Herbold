public class Elevator{

    public static int current_Floor = 5;
    int dest_Floor;

    private Elv_States State = new Elv_States();

    public Elevator (int dest_floor)
    {
        this.dest_Floor = dest_floor;
        System.out.println("*** Destination floor is: "+ dest_Floor);
        State.current_state = State.Idle;
        while(current_Floor != dest_floor){
            if((State.current_state==State.Idle || State.current_state==State.Moving_up) && current_Floor < dest_floor)
                go_up();
            if((State.current_state==State.Idle || State.current_state==State.Moving_down) && current_Floor > dest_floor)
                go_down();
        }
        arrive_atFloor();
    }

    public void go_up(){
        System.out.println("Going up: " + current_Floor + "=>" + ++current_Floor);
        State.current_state= State.Moving_up;
    }

    public void go_down(){
        System.out.println("Going down: " + current_Floor + "=>" + --current_Floor);
        State.current_state= State.Moving_down;
    }

    private void arrive_atFloor() {
        State.current_state=State.Idle;
        System.out.println("Elevator arrived at Floor " + dest_Floor + "\nExit");
    }


}
