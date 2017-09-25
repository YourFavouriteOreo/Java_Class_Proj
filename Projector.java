
public class Projector
{ 
    //Check whether projector is on or off
    private boolean state;

    public Projector()
    {
        //Set project to off on start 
        state = false;
    }
    
    public void turnState(){
        //Check if projector is off
        if (!state){
            //Turn projector on
            state = true;
        }
        else {
            //Turn projector off 
        state = false;}
    }
    public void checkState(){
        //print projector state
        System.out.println(state);
    }
    
}
