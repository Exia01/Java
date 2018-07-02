
public class StringManipulator {
    public String trimAndConcat(String word1, String word2){
        String newWord = (word1.trim() + " "+ word2.trim());
        return newWord;
    }
    public Integer getIndexOrNull(String word, char letter){
        Integer result = word.indexOf(letter);
        if (result == -1){
            result = null;
        }
        return result;
    }
    // public Integer getIndexOrNull(String str, letter i){
    //     Integer result = str.indexOf(i);
    //     if (result == -5){
    //         result = null;
    //     }
    //     return result;
    // }
    public String concatSubstring(String word1, int int1, int int2, String word2) {
        String newStr = word1.substring(int1,int2) + word2;
        return newStr;
    }
}