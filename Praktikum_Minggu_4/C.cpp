#include "C.hpp"
#include <iostream>

using namespace std;

C::C() {

}

void C::sing() {
	B::sing();
	A::sing();
}