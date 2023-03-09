import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class BogoSort {
  private List<Integer> list;

  public BogoSort() {
    list = new ArrayList<Integer>();
  }

  private boolean is_sorted(List<Integer> arr) {
    int i = 0;
    while (i < arr.size() - 1) {
      if (arr.get(i) > arr.get(i+1)) return false;
      i++;
    }

    return true;
  }

  public void bogosort(int [] arr) {
    for (int i = 0; i < arr.length; i++) {
      list.add(arr[i]);
    }

    long start = System.currentTimeMillis();
    while (!is_sorted(list)) {
      Collections.shuffle(list);
    }
    long end = System.currentTimeMillis();

    out.println((end - start) + " millisecond");

    out.println(list);
  }
}
