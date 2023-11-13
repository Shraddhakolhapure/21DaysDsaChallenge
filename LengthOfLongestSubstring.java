import java.util.HashMap;

class LengthOfLongestSubstring{
    public int lengthOfLongestSubstring(String s) {
        // Create a hashmap to store the last index of each character in the string
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        
        // Initialize variables for the start of the substring and the result
        int start = 0;
        int maxLength = 0;
        
        // Iterate through the string
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
            // If the character is already in the substring, update the start index
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }
            
            // Update the last index of the character in the map
            charIndexMap.put(currentChar, end);
            
            // Update the maximum length if needed
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args)
    {
        String s=new String("shraddha");
        LengthOfLongestSubstring p=new LengthOfLongestSubstring();
        System.out.println(p.lengthOfLongestSubstring(s));
    }
}



//another method
/*class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Assuming ASCII characters (0-127)
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);

        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the substring, update the start index
            if (charIndex[currentChar] != -1) {
                start = Math.max(start, charIndex[currentChar] + 1);
            }

            // Update the last index of the character in the array
            charIndex[currentChar] = end;

            // Update the maximum length if needed
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
 */