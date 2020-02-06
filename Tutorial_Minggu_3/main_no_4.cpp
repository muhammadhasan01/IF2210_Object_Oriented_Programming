// main.cpp
#include "A.hpp"
#include "B.hpp"

void func(A* a) {
	a -> setValue(888);
}

int main() {
  B b;
  b.setValue(10888);
  func(&b);
  b.print();
  return 0;
}
