#include "Complex.h"

using namespace std;

Complex::Complex() {
	this -> real = 0;
	this -> imaginer = 0;
}

Complex::Complex(int re, int im) {
	this -> real = re;
	this -> imaginer = im;
}

Complex::Complex(const Complex &comp) {
	this -> real = comp.real;
	this -> imaginer = comp.imaginer;
}

Complex::~Complex() {
	this -> real = this -> imaginer = 0;
}

int Complex::getReal() {
	return this -> real;
}

int Complex::getImaginer() {
	return this -> imaginer;
}

void Complex::setReal(int re) {
	this -> real = re;
}

void Complex::setImaginer(int im) {
	this -> imaginer = im;
}

Complex Complex::operator + (Complex const &comp) {
	Complex ret;
	ret.real = real + comp.real;
	ret.imaginer = imaginer + comp.imaginer;
	return ret;
}

Complex Complex::operator - (Complex const &comp) {
	Complex ret;
	ret.real = real - comp.real;
	ret.imaginer = imaginer - comp.imaginer;
	return ret;
}

Complex Complex::operator * (Complex const &comp) {
	Complex ret;
	ret.real = real * comp.real - imaginer * comp.imaginer;
	ret.imaginer = real * comp.imaginer + imaginer * comp.real;
	return ret;
}
