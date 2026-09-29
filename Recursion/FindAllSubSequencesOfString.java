package Recursion;
import java.util.*;

/*
Problem: Find all possible sub Sequences of a String.

Pattern: Recursion.

Time Complexity: O(2^n).
Space Complexity: O(2^n) auxiliary space.
*/

public class FindAllSubSequencesOfString{
    public static List<String> findingSubSequences(List<String> li, StringBuilder sb, String str, int index){
        if(index >= str.length()){
            li.add(sb.toString());
            return li;
        }

        sb.append(str.charAt(index));
        findingSubSequences(li, sb, str, index+1);
        sb.deleteCharAt(sb.length()-1);
        findingSubSequences(li, sb, str, index+1);

        return li;
    }
    public static List<String> subSequences(String str){
        StringBuilder sb = new StringBuilder();
        List<String> li = new ArrayList<>();

        int index = 0;
        findingSubSequences(li,sb,str,index);
        Collections.sort(li);
        return li;
    }

    public static void main(String[] args){
        String str = "abc";
        List<String> res = subSequences(str);

        for(String s : res){
            System.out.print(s + " ");
        }
    }
}