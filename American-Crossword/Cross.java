import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Creates a crossword where the hidden words are the names of teams, months, colours or yourarraylist.
 * 
 * @author (Filippos Ouingkfilnt) 
 * @version (12th December 2022)
 */

public class Cross
{            
    private char[][] crossword;
    private static  char EmptyBox = '_';
    private static  String GreekChar = "абцдефгхийклмнопястужвьы";
    private ArrayList<Word> words;
    private static Random RandomGener;
    
    public Cross(int noRows, int noCols)
    //Creates an american crossword with the given number of rows and columns.
    {
        crossword = new char[noRows][noCols];
        words = new ArrayList<Word>();
                
        // crossword = new ArrayList[noRows][noCols];
        // //crossword[0][0] = new ArrayList<String>();
        // for (int i = 0; i < noRows; ++i) 
        // {
            // for (int j = 0; j < noCols; ++j) 
            // {                            
                // crossword[i][j] = new ArrayList<String>();
            // }
        // }
                
        // ArrayList<String> Month = MonthArrayList();
        // fillCrossFromArrayList(Month);
                        
        // System.out.println(Arrays.deepToString(crossword));
        
    }    
    
    public boolean isLegal( String aWord,  int x,  int y,  char d)
    //Checks if a word can be placed at position (x, y) (x line , y column) and in the direction (horizontal or vertical) indicated by the fourth parameter. 
    //Check means either that there is no word in that point either the letters of the word match the l word can be inserted otherwise it returns 'false'.
    {
        if (d == 'H') 
        {
            if (x + aWord.length() > crossword.length) 
            {
                return false;
            }
            for (int i = 0; i < aWord.length(); ++i) 
            {
                if (crossword[x + i][y] != '_' && crossword[x + i][y] != aWord.charAt(i)) 
                {
                    return false;
                }
            }
            return true;
        }
        else {
            if (y + aWord.length() > crossword[0].length) 
            {
                return false;
            }
            for (int j = 0; j < aWord.length(); ++j) 
            {
                if (crossword[x][y + j] != '_' && crossword[x][y + j] != aWord.charAt(j)) 
                {
                    return false;
                }
            }
            return true;
        }
    }
    
    public Word findLegal( String aWord,  int x,  int y,  char d) 
    //Searches for a place that the given word can be placed and returns it.
    //Finds the fisrt position that you can place word if this is possible.
    //Searches for a suitable word placement, but if this is not possible returns "null".
    {
        for (int i = 0; i < crossword.length; ++i) 
        {
            for (int j = 0; j < crossword[i].length; ++j) 
            {
                if (isLegal(aWord, (x + i) % crossword.length, (y + j) % crossword[0].length, d)) 
                {
                    return new Word(aWord, (x + i) % crossword.length, (y + j) % crossword[0].length, d);
                }
            }
        }
        return null;
    }
    
    public Word findLegalInAllCross( String aWord) 
    //Finds the position the word can be placed in the whole crossword.
    //Check start form a random position (x,y) and random direction (horizontal or vertical)
    //If it finds a possible position for the word it returns the details about it otherwise if there is none found position returns "null".

    {
        int x = Cross.RandomGener.nextInt(crossword.length);
        int y = Cross.RandomGener.nextInt(crossword[x].length);
        char d = Cross.RandomGener.nextBoolean() ? 'H' : 'V';
         Word w = findLegal(aWord, x, y, d);
        if (w != null) 
        {
            return w;
        }
        if (d == 'H') 
        {
            d = 'V';
        }
        else 
        {
            d = 'H';
        }
        return findLegal(aWord, x, y, d);
    }
    
    public void placeWord( String aWord,  int x,  int y,  char d) 
    //Places the word at the position (x,y) and in the direction indicated by the fourth parameter d.
    //It also adds the word and its position to crossword puzzle.
    {
        if (d == 'H') 
        {
            for (int i = x; i < x + aWord.length(); ++i) 
            {
                crossword[i][y] = aWord.charAt(i - x);
            }
        }
        else 
        {
            for (int j = y; j < y + aWord.length(); ++j) 
            {
                crossword[x][j] = aWord.charAt(j - y);
            }
        }
    }
    
    public void fillRemaing() 
    //It fills in the blank spots of the crossword with random letters from the alphabet.
    {
        for ( char[] row : crossword) 
        {
            for (int j = 0; j < row.length; ++j) 
            {
                if (row[j] == '_') 
                {
                    row[j] = "абцдефгхийклмнопястужвьы".charAt(Cross.RandomGener.nextInt("абцдефгхийклмнопястужвьы".length()));
                }
            }
        }
    }
    
    public void fillCrossFromArrayList(ArrayList<String> wordList)
    //It uses the above methods to place on crossword "as many as possible" of the words that are in ArrayList.
    {
       resetCross();
       for ( String t : wordList) 
       {
            Word w = findLegalInAllCross(t);
            if (w != null) 
            {
                words.add(w);
                placeWord(w.getWord(), w.getX(), w.getY(), w.getDirection());
            }
       }
       fillRemaing();   
    }  
    
    public void printCross() 
    //Prints the crossword.
    {
        for (int i = 0; i < crossword.length; ++i) 
        {
            for (int j = 0; j < crossword[i].length; ++j) 
            {
                System.out.print(crossword[i][j]);
            }
            System.out.println();
        }
    }
    
        public void printSolution() 
    //Prints the crossword solution.
    {
        for ( Word w : words) 
        {
            System.out.println(w.getWordInfo());
        }
    }
    
    public void resetCross() 
    //Clears the crossword.
    {
        for (int i = 0; i < crossword.length; ++i) 
        {
            for (int j = 0; j < crossword[i].length; ++j) 
            {
                crossword[i][j] = '_';
            }
        }
        words.clear();
    }
    
    public char[][] getCross() 
    //Returns the crossword as a 2D array of characters.
    {
        return crossword;
    }
    
    public ArrayList<Word> getWords()
    //Returns the words from the crossword.
    {
        return words;
    }
    
    static
    //Generates a ranodm integer to be used as a random position.
    {
        Cross.RandomGener = new Random();
    }    

}