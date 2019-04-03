1. 

public static String flip() {
    int r = Math.random() * 3;
    if (r < 2) {
        return "heads";
    }
    return "tails";
}

2.

public static Boolean arePermutations(int[] valuesOne, int[] valuesTwo) {
    boolean foundMatch = false;
    for (i = 0; i < valuesOne.length; i++) {
        for (k = 0; k < valuesOne.length; k++) {
            if(valuesOne[i] == valuesTwo[k]) {
                foundMatch = true;
            }
        }
        if (!foundMatch) {
            return false;
        }
        foundMatch = false;
    }
    return true;
}

3. 0, 1, 1