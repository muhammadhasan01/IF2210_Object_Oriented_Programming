#include "BunchOfKeys.hpp"

using namespace std;

BunchOfKeys::BunchOfKeys() {
	this -> n_keys = 0;
}

void BunchOfKeys::add() {
	this -> n_keys++;
}

void BunchOfKeys::shake() {
	int oc = this -> n_keys;
	if (oc <= 1) {
		cout << "Tidak terjadi apa-apa" << endl;
		return;
	}
	for (int i = 0; i < oc; i++) {
		cout << "krincing" << endl;
	}
}
