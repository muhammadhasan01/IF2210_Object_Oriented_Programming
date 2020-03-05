#include "Polinom.hpp"
#include <iostream>

using namespace std;

Polinom::Polinom() {
	this -> derajat = 0;
	for (int i = 0; i < MAX_LENGTH; i++)
		this -> koef[i] = 0;
}

Polinom::Polinom(int n) {
	this -> derajat = n;
	for (int i = 0; i < MAX_LENGTH; i++)
		this -> koef[i] = 0;
}

Polinom::~Polinom() {
	
}

Polinom::Polinom(const Polinom &p) {
	this -> derajat = p.derajat;
	for (int i = 0; i < MAX_LENGTH; i++)
		this -> koef[i] = p.koef[i];
}

Polinom& Polinom::operator=(const Polinom& p) {
  this -> derajat = p.derajat;
	for (int i = 0; i < MAX_LENGTH; i++)
    this -> koef[i] = p.koef[i];
  return *this;
}

int Polinom::getKoefAt(int idx) const {
	return this -> koef[idx];
}

int Polinom::getDerajat() const {
	return this -> derajat;
}

void Polinom::setKoefAt(int idx, int val) {
	this -> koef[idx] = val;
}

void Polinom::setDerajat(int drj) {
	this -> derajat = drj;
}

Polinom operator+(const Polinom& p1, const Polinom& p2) {
  Polinom res(p1.derajat);
  for (int i = 0; i <= p1.derajat; i++) {
    res.koef[i] = p1.koef[i] + p2.koef[i];
  }
  return res;
}

Polinom operator-(const Polinom& p1, const Polinom& p2) {
  Polinom res(p1.derajat);
  for (int i = 0; i <= p1.derajat; i++) {
    res.koef[i] = p1.koef[i] - p2.koef[i];
  }
  return res;
}

Polinom operator*(const Polinom& p, const int x) {
  Polinom res(p);
  for (int i = 0; i <= res.derajat; i++) {
    res.koef[i] *= x;
  }
  return res;
}

Polinom operator*(const int x, const Polinom& p) {
  Polinom res(p);
  for (int i = 0; i <= res.derajat; i++) {
    res.koef[i] *= x;
  }
  return res;
}

Polinom operator/(const Polinom& p, const int x) {
  Polinom res(p);
  for (int i = 0; i <= res.derajat; i++) {
    res.koef[i] /= x;
  }
  return res;
}

void Polinom::input() {
	for (int i = 0; i <= this -> derajat; i++) {
		int val;
    cin >> val;
		this -> koef[i] = val;
	}
}

void Polinom::printKoef() {
	for (int i = 0; i <= this -> derajat; i++) {
		cout << this -> koef[i] << endl;
	}
}

int Polinom::substitute(int x) {
	int ret = 0;
	int cur = 1;
	for (int i = 0; i <= this -> derajat; i++) {
		ret += (this -> koef[i]) * cur;
		cur *= x;
	}
	return ret;
}

Polinom Polinom::derive() {
	Polinom ret;
  ret.derajat = this -> derajat - 1;
	for (int i = 0; i <= ret.derajat; i++) {
		ret.koef[i] = (i + 1) * (this -> koef[i + 1]); 
	}
  if (ret.derajat == -1) ret.derajat = 0;
	return ret;
}

void Polinom::print() {
  if (derajat == 0) {
    cout << koef[0] << endl;
    return;
  }
  bool flag = true;
  for (int i = 0; i <= derajat; i++) {
    if (koef[i] != 0) {
      flag = false;
    }
  }
  if (flag) {
    cout << 0 << endl;
    return;
  }
  for (int i = 0; i <= derajat; i++) {
    int v = koef[i];
    if (i == 0) {
      if (v != 0) {
        cout << v;
        flag = true;
      } else {
        continue;
      }
    } else {
      if (v == 0) continue;
      if (v > 0 && flag) {
        cout << "+";
      }
      flag = true;
      cout << v;
      cout << "x^" << i;
    }
  }
	cout << endl;
}

