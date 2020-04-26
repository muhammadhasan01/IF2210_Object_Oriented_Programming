// import java api jika diperlukan

public class MailServer implements EventChannel {
  // tambahkan properties jika perlu

  public MailServer() {
    // menginisiasi daftar subscriber
  }

  public void addSubscriber(String topic, Subscriber s) {
    // tambahkan s sebagai subscriber ke topic yang diberikan
  }

  public void sendEvent(String topic, Event event) {
    // untuk setiap subscriber s yang sudah subscribe ke topic yang diberikan,
    // panggil s.onEvent(event)
  }
}
