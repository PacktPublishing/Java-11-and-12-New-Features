package comparing_break_with_break_return_value;

import java.util.List;

public class Sample {
    int sum(int x, int y) {                   // return type of method is int
        int result = x + y;
        return result;                        // returns int value
    }

    void output(List<Integer> list) {         // return type of method is void
        if (list == null)
            return;                           // exit method without returning a value
        else {
            for (Integer i : list)
                System.out.println(i);
        }
        System.out.println("End of method");  // this doesn't execute if list is null
    }
}
