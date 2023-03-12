import java.util.*;

/**
 * Creates a crossword where the hidden words are the names of months.
 * 
 * @author (Filippos Ouingkfilnt) 
 * @version (12th December 2022)
 */
public class MonthCross
{
    /**
     * Creates a testing crossword with words being the 
     * names of months. Prints the crossword and its solution.
     */
    public static void main(String[] args)
    {

        //arrays used in testing the methods of class Cross
        ArrayList<String> month;
        Cross     mCross;

        month = new ArrayList();
        month.add("����������");
        month.add("�����������");
        month.add("�������");
        month.add("��������");
        month.add("�����");
        month.add("�������");
        month.add("�������");
        month.add("���������");
        month.add("�����������");
        month.add("���������");
        month.add("���������");
        month.add("����������");

        mCross = new Cross(15,10);
        mCross.fillCrossFromArrayList(month);        
        //print
        mCross.printCross();
    
        //print Solution
        mCross.printSolution();
    
    }
    
}
