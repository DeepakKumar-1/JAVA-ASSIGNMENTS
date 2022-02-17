package DiceCountAndLetterCombinations;

public class PhonePad {
    // Letter Combinations of Phone Number
    public static void main(String [] args){
        pad("12", "");
    }
    static void pad(String str, String ans){
        if(str.isEmpty()){
            System.out.print(ans + "  ");
            return;
        }
        int digit = str.charAt(0) - '0'; // This Will Convert '2' into 2
        for(int i = (digit - 1)*3 ; i < digit*3; i++){
            char ch = (char)('a' + i);
            pad(str.substring(1) , ans + ch);
        }
    }
}
