#include "Car.h"
#include <iostream>

Car::Car(Fuel t_fuel) {
	fuel = t_fuel;
	gear = ac_power = on = 0;
}

Fuel Car::getFuel() {
	return fuel;
}

int Car::getGear() {
	return gear;
}

int Car::getAcPower() {
	return ac_power;
}

bool Car::getOn() {
	return on;
}

void Car::fillingFuel(Fuel t_fuel, int amount_int_liter) {
	if (fuel != t_fuel) throw t_fuel;
	cout << "Berhasil isi bensin sebanyak " << amount_int_liter << " liter" << endl;
}

void Car::changeGear(int t_gear) {
	if (MIN_GEAR > t_gear || MAX_GEAR < t_gear)
		throw t_gear;

	gear = t_gear;
	cout << "Berhasil mengubah gigi menjadi gigi " << gear << endl;

}

void Car::changeAcPower(int t_ac_power) {
	if (MIN_AC > t_ac_power || MAX_AC < t_ac_power)
		throw t_ac_power;

	ac_power = t_ac_power;
	cout << "Berhasil mengubah power ac menjadi " << ac_power << endl;
}

void Car::start() {
	if (on) throw on;
	on = true;
	cout << "Berhasil melakukan starter mobile" << endl;
}

void Car::service(Fuel t_fuel, int amount_in_liter, int t_gear, int t_ac_power) {
	try {
		start();
		fillingFuel(t_fuel, amount_in_liter);
		changeGear(t_gear);
		changeAcPower(t_ac_power);
	} catch (bool e1) {
		cout << "Mobil sudah menyala" << endl;
	} catch (int e2) {
		cout << "Input angka diluar range" << endl;
	} catch (Fuel e3) {
		cout << "Bensin tidak sesuai" << endl;
	}
}