public abstract class Employee {
  public boolean hasMarried;

  public Employee() {
    this.hasMarried = false;
  }

  public void setHasMarried(boolean _hasMarried) {
    this.hasMarried = _hasMarried;
  }

  abstract int calculateSalary(int workHour);
}