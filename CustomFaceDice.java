package DiceCountAndLetterCombinations;

import java.util.ArrayList;

public class CustomFaceDice {
    public static void main(String[] args) {
        System.out.println(dice("", 8, 8));
    }

    static ArrayList<String> dice(String p, int target, int face) {
        if (target == 0) {
//            System.out.println(p);
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(dice(p + i, target - i, face));
        }
        return list;
    }
}
