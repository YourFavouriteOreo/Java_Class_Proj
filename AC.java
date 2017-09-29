
/**
 * Write a description of class AC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AC
{
    // instance variables - replace the example below with your own
    private int current_temp = 20;
    private boolean state = false;

    public AC()
    {
        
    }
    public void changeState() {
        if (!this.state) {
            this.state = true;
    }
    else {
        this.state = false;
    }
}
    public boolean checkState(){
        return this.state;
    }
    public int checktemp(){
        return this.current_temp;
    }
}
