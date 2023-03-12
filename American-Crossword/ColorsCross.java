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
        
        color.add("�������");
        color.add("����");
        color.add("�����");
        color.add("�������");
        color.add("�������");
        color.add("�������");
        color.add("�������");
        color.add("�����");
        color.add("���");
        color.add("���������"); 
        color.add("�����");
        color.add("�������");
        color.add("����");
        color.add("����");
        color.add("�����");
        
        mCross = new Cross(8,8);
        mCross.fillCrossFromArrayList(color);       
        
         //print 
         mCross.printCross();
         //print Solution
         mCross.printSolution();
         
    }

}
