public class Programmer extends Employee {
  Programmer() {
    super();
  }

  public int calculateSalary(int workHour) {
    int ret = (this.hasMarried ? 4000000 : 0);
    ret += Math.min(150, workHour) * 100000;
    ret += Math.max(0, workHour - 150) * 10000;
    return ret; 
  }
}