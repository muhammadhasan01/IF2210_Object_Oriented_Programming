#include "Rekening.h"

Rekening::Rekening(double d) {
	if (d < 0) d = 0;
	saldo = d;
}

void Rekening::setSaldo(double d) {
	saldo = d;
}

double Rekening::getSaldo() const {
	return saldo;
}

void Rekening::simpanUang(double d) {
	saldo += d;
}

bool Rekening::tarikUang(double d) {
	if (saldo < d) return false;
	saldo -= d;
	return true;	
}