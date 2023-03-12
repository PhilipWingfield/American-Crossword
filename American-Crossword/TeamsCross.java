import java.util.*;

/**
 * Creates a crossword where the hidden words are the names of teams.
 * 
 * @author (Filippos Ouingkfilnt) 
 * @version (12th December 2022)
 */
public class TeamsCross
{

    /**
     * Creates a testing crossword with words being the 
     * names of teams. Prints the crossword and its solution.
     */
    
      public static void main(String args[])
    {

        //arrays used in testing the methods of class Cross
        ArrayList<String> team;
        Cross     mCross;

        team = new ArrayList();
        
        team.add("����������");
        team.add("������������");
        team.add("���");
        team.add("������");
        team.add("��������");
        team.add("����");
        team.add("�������");
        team.add("���������");
        team.add("���");
        team.add("�����");
        team.add("����");
        team.add("�������");
        team.add("������������");
        team.add("�����");

        mCross = new Cross(15,20);
        mCross.fillCrossFromArrayList(team);       
        
         //print 
         mCross.printCross();

         //print Solution
         mCross.printSolution();
    }

}
