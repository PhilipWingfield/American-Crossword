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
      //From the subject that you've picked add as many words as you like in the cells "���� 1..." and pick in newCross(x,y) how many x columns and how many y rows you want your crossword to have.
    {

        //arrays used in testing the methods of class Cross
        ArrayList<String> yoursubject;
        Cross     mCross;

        yoursubject = new ArrayList();
        
        yoursubject.add("���� 1");
        yoursubject.add("���� 2");
        yoursubject.add("���� 3");
        yoursubject.add("���� 4");
        yoursubject.add("���� 5");
        yoursubject.add("���� 6");
        yoursubject.add("���� 7");
        yoursubject.add("���� 8");
        yoursubject.add("���� 9");
        yoursubject.add("���� 10");
        
        mCross = new Cross(10,10);
        mCross.fillCrossFromArrayList(yoursubject);       
        
         //print 
         mCross.printCross();
         //print Solution
         mCross.printSolution();
         
    }

}

