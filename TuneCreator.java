//q47
public class TuneCreator
{
    private MidiPlayer player;
    private SimpleTune tune;
    public TuneCreator()
    {
        player = new MidiPlayer();
    }
    
    //q48
    public void createAndPlay()
    {
        tune = new SimpleTune();
        player = new MidiPlayer();
        
    }
}
