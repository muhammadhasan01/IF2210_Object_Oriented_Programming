// import java api jika diperlukan
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MailServer implements EventChannel {
  // tambahkan properties jika perlu
  HashMap<String, List<Subscriber>> subscriber;

  public MailServer() {
    // menginisiasi daftar subscriber
    subscriber = new HashMap<String, List<Subscriber>>();
  }

  public void addSubscriber(String topic, Subscriber s) {
    // tambahkan s sebagai subscriber ke topic yang diberikan
    List<Subscriber> curList = subscriber.get(topic);
    if (curList == null) {
      curList = new ArrayList<Subscriber>();
      subscriber.put(topic, curList);
    }
    curList.add(s);
  }

  public void sendEvent(String topic, Event event) {
    // untuk setiap subscriber s yang sudah subscribe ke topic yang diberikan,
    // panggil s.onEvent(event)
    List<Subscriber> curList = subscriber.get(topic);
    if (curList == null) {
      curList = new ArrayList<Subscriber>();
      subscriber.put(topic, curList);
    }
    for (Subscriber s : curList) {
      s.onEvent(event);
    }
  }
}
