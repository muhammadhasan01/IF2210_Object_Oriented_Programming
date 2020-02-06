#include "RekeningGiro.h"

RekeningGiro::RekeningGiro(double s, double b) : Rekening(s) {
	sukuBunga = b;
}

void RekeningGiro::setSukuBunga(double b) {
	sukuBunga = b;
}

double RekeningGiro::getSukuBunga() const {
	return sukuBunga;
}

double RekeningGiro::hitungBunga() {
	return sukuBunga * (Rekening::getSaldo());
}