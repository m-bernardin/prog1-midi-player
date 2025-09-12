//q 46, q47
public class Composer extends Thread
{
    private SimpleTune jingleBells;
    private SimpleTune sunshineOfYourLove;
    private MidiPlayer player1;
    private MidiPlayer player2;
    private MidiPlayer player3;
    private SimpleTune firstNote;
    private SimpleTune secondNote;
    private SimpleTune thirdNote;
    private int i;
 
    /**
     * Constructor for objects of class Composer
     */
    public Composer()
    {
        
    }
    
    /**
     * PLays the song 'Jingle Bells' poorly, q48, q49
     */
    public void jingleBells()
    {
        jingleBells = new SimpleTune();
        player1 = new MidiPlayer();
        //q50
        jingleBells.setInstrument(3);
        jingleBells.addNote("E", 5);
        jingleBells.addNote("E", 5);
        jingleBells.addNote("E", 5);
        jingleBells.addNote("A1", 2);
        jingleBells.addNote("E", 5);
        jingleBells.addNote("E", 5);
        jingleBells.addNote("E", 5);
        jingleBells.addNote("A1", 2);
        jingleBells.addNote("E", 5);
        jingleBells.addNote("G", 5);
        jingleBells.addNote("C", 5);
        jingleBells.addNote("D", 5);
        jingleBells.addNote("E", 5);
        jingleBells.addNote("A1", 2);
        jingleBells.addNote("F", 5);
        jingleBells.addNote("F", 5);
        jingleBells.addNote("F", 5);
        jingleBells.addNote("A1", 2);
        jingleBells.addNote("F", 3);
        jingleBells.addNote("E", 5);
        jingleBells.addNote("E", 5);
        jingleBells.addNote("E", 5);
        jingleBells.addNote("A1", 2);
        jingleBells.addNote("D", 5);
        jingleBells.addNote("D", 5);
        jingleBells.addNote("C", 5);
        jingleBells.addNote("D", 5);
        jingleBells.addNote("G", 9);
        jingleBells.showNotes();
        jingleBells.getInstrument();
        player1.playTune(jingleBells);
    }
    
    /**
     * PLays the opening riff of 'Cream - Sunshine of your Love' poorly
     * Type "Yes" to hear it on every instrument 
     */
    public void sunshineOfYourLove(String instrumentSweep)
    {
        sunshineOfYourLove = new SimpleTune();
        player1 = new MidiPlayer();
        if(instrumentSweep == "Yes"){
            i=0;
            while(i<=14){
                sunshineOfYourLove.setInstrument(i);
                System.out.println("Instrument playing: " + i);
                //first time
                sunshineOfYourLove.addNote("D3", 2);
                sunshineOfYourLove.addNote("D3", 2);
                sunshineOfYourLove.addNote("C2", 2);
                sunshineOfYourLove.addNote("D3", 3);
                sunshineOfYourLove.addNote("A2", 4);
                sunshineOfYourLove.addNote("G#2", 4);
                sunshineOfYourLove.addNote("G2", 4);
                sunshineOfYourLove.addNote("D2", 2);
                sunshineOfYourLove.addNote("F2", 5);
                sunshineOfYourLove.addNote("D2", 2);
                sunshineOfYourLove.addNote("D2", 2);
        
                //2nd time
                sunshineOfYourLove.addNote("D3", 2);
                sunshineOfYourLove.addNote("D3", 2);
                sunshineOfYourLove.addNote("C2", 2);
                sunshineOfYourLove.addNote("D3", 3);
                sunshineOfYourLove.addNote("A2", 4);
                sunshineOfYourLove.addNote("G#2", 4);
                sunshineOfYourLove.addNote("G2", 4);
                sunshineOfYourLove.addNote("D2", 2);
                sunshineOfYourLove.addNote("F2", 5);
                sunshineOfYourLove.addNote("D2", 2);
                sunshineOfYourLove.addNote("D2", 2);

                player1.playTune(sunshineOfYourLove);
                i = ++i;
            }
        }
        else{
            
            sunshineOfYourLove.setInstrument(4);
        
            //first time
            sunshineOfYourLove.addNote("D3", 2);
            sunshineOfYourLove.addNote("D3", 2);
            sunshineOfYourLove.addNote("C2", 2);
            sunshineOfYourLove.addNote("D3", 3);
            sunshineOfYourLove.addNote("A2", 4);
            sunshineOfYourLove.addNote("G#2", 4);
            sunshineOfYourLove.addNote("G2", 4);
            sunshineOfYourLove.addNote("D2", 2);
            sunshineOfYourLove.addNote("F2", 5);
            sunshineOfYourLove.addNote("D2", 2);
            sunshineOfYourLove.addNote("D2", 2);
        
            //2nd time
            sunshineOfYourLove.addNote("D3", 2);
            sunshineOfYourLove.addNote("D3", 2);
            sunshineOfYourLove.addNote("C2", 2);
            sunshineOfYourLove.addNote("D3", 3);
            sunshineOfYourLove.addNote("A2", 4);
            sunshineOfYourLove.addNote("G#2", 4);
            sunshineOfYourLove.addNote("G2", 4);
            sunshineOfYourLove.addNote("D2", 2);
            sunshineOfYourLove.addNote("F2", 5);
            sunshineOfYourLove.addNote("D2", 2);
            sunshineOfYourLove.addNote("D2", 2);

            player1.playTune(sunshineOfYourLove);
            System.out.println("Instrument Played: " + i);
            }
        }
    
    public void cChord()
    {
        firstNote = new SimpleTune();
        secondNote = new SimpleTune();
        thirdNote = new SimpleTune();
        player1 = new MidiPlayer();
        player2 = new MidiPlayer();
        player3 = new MidiPlayer();
        firstNote.addNote("C", 15);
        secondNote.addNote("E", 15);
        thirdNote.addNote("G", 15);
        player1.playTune(firstNote);
        player2.playTune(secondNote);
        player3.playTune(thirdNote);        
    }
}
