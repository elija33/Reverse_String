public class ReverseString{

    public static void main(String[] args) {

        String r = revers("eat");
        System.out.println(r);
    }

    public static String revers(String word){
        char[] words = new char[word.length()]; 
        int wordsIndex = 0;
        for(int i = word.length()-1; i>=0; i--){
            words[wordsIndex] = word.charAt(i);
            wordsIndex++;
        }

        String reverse = "";
        for(int i = 0; i<word.length(); i++){
            reverse = reverse + words[i];
        }
        return reverse;
    }
}