#include "Bike.h"
#include "Car.h"
#include <iostream>

using namespace std;

void dr(Vehicle *v) {
	v -> drive();
}

int main() {
	Car *c44 = new Car(4);
	Car *c10 = new Car(10);
	Bike *b_def = new Bike();
	Vehicle *vc22 = new Vehicle(*b_def);
	delete b_def;
	dr(c10);
	vc22 -> clean();
	c44 -> drive();
	vc22 -> park();
	delete c10;
	delete vc22;
	delete c44;

	return 0;
}