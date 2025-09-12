
public class Composer extends Thread
{
    private SimpleTune jingleBells;
    private MidiPlayer player1;
    private MidiPlayer player2;
    private MidiPlayer player3;
    private SimpleTune firstNote;
    private SimpleTune secondNote;
    private SimpleTune thirdNote;
    /**
     * Constructor for objects of class Composer
     */
    public Composer()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void jingleBells()
    {
        jingleBells = new SimpleTune();
        player1 = new MidiPlayer();
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
        jingleBells.addNote("F", 5);
        jingleBells.addNote("F", 5);
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
