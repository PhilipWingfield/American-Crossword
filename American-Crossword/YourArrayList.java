import java.util.*;

/**
 * Creates a crossword where the hidden words are the names of yoursubjects.
 * 
 * @author (Filippos Ouingkfilnt) 
 * @version (12th December 2022)
 */
public class YourArrayList
{

    /**
     * Creates a testing crossword with words being the 
     * names of yoursubjects. Prints the crossword and its solution.
     */
    
      public static void main(String args[])
      //From the subject that you've picked add as many words as you like in the cells "кенг 1..." and pick in newCross(x,y) how many x columns and how many y rows you want your crossword to have.
    {

        //arrays used in testing the methods of class Cross
        ArrayList<String> yoursubject;
        Cross     mCross;

        yoursubject = new ArrayList();
        
        yoursubject.add("кенг 1");
        yoursubject.add("кенг 2");
        yoursubject.add("кенг 3");
        yoursubject.add("кенг 4");
        yoursubject.add("кенг 5");
        yoursubject.add("кенг 6");
        yoursubject.add("кенг 7");
        yoursubject.add("кенг 8");
        yoursubject.add("кенг 9");
        yoursubject.add("кенг 10");
        
        mCross = new Cross(10,10);
        mCross.fillCrossFromArrayList(yoursubject);       
        
         //print 
         mCross.printCross();
         //print Solution
         mCross.printSolution();
         
    }

}

