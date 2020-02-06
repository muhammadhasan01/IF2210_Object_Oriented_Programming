#include "Vehicle.h"
#include "Bike.h"
#include "Car.h"

using namespace std;

int main() {
	Vehicle * v32 = new Vehicle(3, 2);
	Vehicle * v32_ = new Vehicle(*v32);
	Vehicle * v650 = new Vehicle(6, 50);
	Car * c48 = new Car(8);
	Car * c48_ = new Car(*c48);
	Car * c46 = new Car(6);
	Bike * b22 = new Bike();
	c46 -> drive();
	b22 -> show();
	b22 -> ride();
	delete b22;
	delete c46;
	delete c48;
	delete c48_;
	delete v650;
	delete v32;
	delete v32_;
	return 0;
}