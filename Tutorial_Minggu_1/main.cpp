// author : mhasan01
#include <iostream>
#include "A.hpp"

using namespace std;

int main() {
  A * x_1 = new A('1');
  A * x_2 = new A('2');
  A * xx_1 = new A(*x_1);
  *x_1 = *x_2;
  x_1->show();
  delete x_1;
  delete x_2;
  delete xx_1;
  return 0;
}