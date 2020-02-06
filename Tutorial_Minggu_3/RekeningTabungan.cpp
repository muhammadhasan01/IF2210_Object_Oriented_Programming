#include "RekeningTabungan.h"

RekeningTabungan::RekeningTabungan(double s, double b) : Rekening(s) {
	biayaTransaksi = b;
}

void RekeningTabungan::setBiayaTransaksi(double b) {
	biayaTransaksi = b;
}

double RekeningTabungan::getBiayaTransaksi() const {
	return biayaTransaksi;
}

void RekeningTabungan::simpanUang(double b) {
	Rekening::simpanUang(b);
	Rekening::setSaldo(Rekening::getSaldo() - biayaTransaksi);
}

bool RekeningTabungan::tarikUang(double b) {
	if (Rekening::tarikUang(b)) {
		Rekening::setSaldo(Rekening::getSaldo() - biayaTransaksi);
		return true;
	}
	return false;
}
