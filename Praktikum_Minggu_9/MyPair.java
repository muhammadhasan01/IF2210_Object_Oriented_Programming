public class MyPair<K, V> {
  private K Key;
  private V Value;

  public MyPair(K Key, V Value) {
    this.Key = Key;
    this.Value = Value;
  }

  public K getKey() {
    return this.Key;
  }

  public V getVal() {
    return this.Value;
  }

  public void setKey(K Key) {
    this.Key = Key;
  }

  public void setVal(V Value) {
    this.Value = Value;
  }

  public boolean isEqual(MyPair<K, V> pair) {
    return (this.getKey() == pair.getKey() && this.getVal() == pair.getVal());
  }

  public int nearEQ(MyPair<K, V> pair) {
    K k1 = this.getKey();
    K k2 = pair.getKey();
    V v1 = this.getVal();
    V v2 = pair.getVal();
    if (k1 != k2 && v1 != v2) {
      return 0;
    } else if (k1 == k2 && v1 != v2) {
      return 1;
    } else if (k1 != k2 && v1 == v2) {
      return 2;
    } else {
      return 3;
    }
  }
}