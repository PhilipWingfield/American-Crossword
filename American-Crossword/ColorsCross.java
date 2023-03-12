import java.util.*;

/**
 * Creates a crossword where the hidden words are the names of colors.
 * 
 * @author (Filippos Ouingkfilnt) 
 * @version (12th December 2022)
 */
public class ColorsCross
{

    /**
     * Creates a testing crossword with words being the 
     * names of colors. Prints the crossword and its solution.
     */
    
      public static void main(String args[])
    {

        //arrays used in testing the methods of class Cross
        ArrayList<String> color;
        Cross     mCross;

        color = new ArrayList();
        
        color.add("йитяимо");
        color.add("цйяи");
        color.add("вяусо");
        color.add("хакасси");
        color.add("пяасимо");
        color.add("биокети");
        color.add("йоййимо");
        color.add("аспяо");
        color.add("яоф");
        color.add("поятойаки"); 
        color.add("лауяо");
        color.add("лпоямто");
        color.add("кади");
        color.add("йаже");
        color.add("асгли");
        
        mCross = new Cross(8,8);
        mCross.fillCrossFromArrayList(color);       
        
         //print 
         mCross.printCross();
         //print Solution
         mCross.printSolution();
         
    }

}
