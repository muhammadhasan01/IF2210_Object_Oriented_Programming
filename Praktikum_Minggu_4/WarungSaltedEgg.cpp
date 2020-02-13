#include "WarungSaltedEgg.hpp"
#include <iostream>

WarungSaltedEgg::WarungSaltedEgg(int uang, int nasi, int telur, int telurAsin, int ayam) : WarungNasi(uang, nasi, telur) {
	this->telurAsin = telurAsin;
	this->ayam = ayam;
}

bool WarungSaltedEgg::masak(int pesanan) {
	if (getNasi() >= pesanan && getTelur() >= pesanan && telurAsin >= 3 * pesanan && ayam >= pesanan) {
		int pendapatan = pesanan * 30000;
		setUang(getUang() + pendapatan);
		return true;
	}
	return false;
}