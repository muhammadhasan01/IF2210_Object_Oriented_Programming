// Muhammad Hasan - 13518012
#include "WarungNasgor.hpp"
#include <iostream>

WarungNasgor::WarungNasgor(int uang, int nasi, int telur, int kecap) : WarungNasi(uang, nasi, telur) {
    this->kecap = kecap;
}

bool WarungNasgor::masak(int pesanan) {
    if (getNasi() >= pesanan && getTelur() >= pesanan && kecap >= pesanan) {
        int pendapatan = pesanan * 15000;
        setUang(getUang() + pendapatan);
        return true;
    }
    return false;
}