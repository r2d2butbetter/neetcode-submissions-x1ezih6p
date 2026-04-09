class Solution {
public int[] dailyTemperatures(int[] temperatures) {
        // indx, temp;
        int[] results = new int[temperatures.length];

        Stack<int[]> stk = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {

            if (!stk.empty()) {
                while (temperatures[i] > stk.peek()[1]) {
                    int tempOld[] = stk.pop();
                    results[tempOld[0]] = i - tempOld[0];

                    if (stk.empty()) {
                        break;
                    }
                }
            }

            // push new after popping everything needed
            stk.push(new int[] { i, temperatures[i] });
        }

        return results;
    }
}
