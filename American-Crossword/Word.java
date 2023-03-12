import java.util.*;

/**
 *
 * @author (Filippos Ouingkfilnt)
 * @version (12 December 2022)
 */
public class Word
{
    private String Word;
    private int x;
    private int y;
    private char Direction;
    private String WordInfo;

    public Word (String newWord, int newX, int newY, char newDirection)
    //Creates a word with "position" and "direction" info.
    {
        Word = newWord;
        x=newX;
        y=newY;
        Direction = newDirection;
    }

    public char getDirection()
    //Returns Direction.
    {
        return Direction;
    }
    
    public String getWord()
    //Returns Word.
    {
        return Word;
    }
    
    public String getWordInfo()
    //Returns Word Info.
    {
        return (Word + " (" + x + "," + y + ") " + Direction);    
    }
    
    public int getX()
    //Returns X.
    {
        return x;
    }
    
    public int getY()
    //Returns Y.
    {
        return y;
    }
}