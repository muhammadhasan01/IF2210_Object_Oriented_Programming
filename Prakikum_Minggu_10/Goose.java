public class Goose {
  public String name;
  public int honk;

  public Goose() {
    this.name = "Horrible";
    this.honk = 1;
  }

  public Goose(String _name, int _honk) {
    this.name = _name;
    this.honk = _honk;
  }

  public void steal(String thing) {
    System.out.println(this.name + " steals " + thing);
  }

  public String toString() {
    String ret = "";
    ret += this.name;
    ret += " goose says";
    for (int i = 0; i < this.honk; i++) {
      ret += " honk";
    }
    return ret;
  }
}