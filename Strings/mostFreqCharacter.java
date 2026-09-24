package Strings;
import java.util.*;

/*
Problem: Find the most occuring character from the string, 
if any two characters occur the same no of times then return the
lexicographically smaller character.

Pattern: Frequency count/HashMap.

Time Complexity: O(n).
Space Complexity: O(1) auxiliary space.
*/

public class mostFreqCharacter {
    public static char findMostFreqCharacter(String str){
        Map<Character,Integer> map = new HashMap<>();

        for(int i=str.length()-1;i>=0;i--){
            char curr = str.charAt(i);
            map.put(curr,map.getOrDefault(curr, 0) + 1);
        }

        int mostFreq = 0;
        char ans = '0';

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            char currChar = entry.getKey();
            int currFreq = entry.getValue();

            if(currFreq > mostFreq){
                mostFreq = currFreq;
                ans = currChar;
            } else if(currFreq == mostFreq){
                if(currChar < ans){
                    ans = currChar;
                    mostFreq = currFreq;
                }
            }
        }

        return ans;
    }


    public static void main(String[] args){
        String str = "testsample";
        System.out.println(findMostFreqCharacter(str));
        
        String str2 = "output";
        System.out.println(findMostFreqCharacter(str2));
    }
}
