import java.util.HashMap;
import java.util.Map;

public class Game {
  public static void run(String[] hojun, String[] qila) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (String e : hojun) {
      Integer freq = map.get(e);
      map.put(e, (freq == null) ? 1 : freq + 1);
    }
    for (String e : qila) {
      Integer freq = map.get(e);
      if (freq != null && freq > 0) {
        map.put(e, freq - 1);
      }
    }
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      for (int i = 0; i < entry.getValue(); i++) {
        System.out.println(entry.getKey());
      }
    }
  } 
}