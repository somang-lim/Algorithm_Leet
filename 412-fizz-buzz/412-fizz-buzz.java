import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fb = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int num = i+1;
            if (num % 3 == 0 && num % 5 == 0) {
                fb.add("FizzBuzz");
                continue;
            }
            
            if (num % 3 == 0) {
                fb.add("Fizz");
                continue;
            }
            
            if (num % 5 == 0) {
                fb.add("Buzz");
                continue;
            }
            
            fb.add(num + "");
        }
        
        return fb;
    }
}