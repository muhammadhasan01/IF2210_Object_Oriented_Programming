// Muhammad Hasan - 13518012
#include "Bottle.hpp"
#include <bits/stdc++.h>

using namespace std;

int Bottle::numOfBottle = 0;

Bottle::Bottle() : id(numOfBottle + 1) {
	this -> height = 10.00;
	this -> radius = 10.00;
	this -> waterHeight = 0.00;
	numOfBottle++;
}

Bottle::Bottle(float height, float radius) : id(numOfBottle + 1) {
	this -> height = height;
	this -> radius = radius;
	this -> waterHeight = 0.00;
	numOfBottle++;
}

Bottle::Bottle(const Bottle& bottle) : id(bottle.id) {
	this -> height = bottle.height;
	this -> radius = bottle.radius;
	this -> waterHeight = bottle.waterHeight;
}

Bottle::~Bottle() {

}

int Bottle::getId() const {
	return this -> id;
}

float Bottle::getWaterVolume() const {
	int hgt = this -> waterHeight;
	int rds = this -> radius;
	return PI * rds * rds * hgt;
}

float Bottle::getBottleVolume() const {
	int hgt = this -> height;
	int rds = this -> radius;
	return PI * rds * rds * hgt;
}

void Bottle::setHeight(float height) {
	if (height < this -> waterHeight) {
		this -> waterHeight = height;
	}
	this -> height = height;
}

void Bottle::addWater(float waterVolume) {
	float rds = this -> radius;
	float waterHeight = waterVolume / (PI * rds * rds);
	this -> waterHeight += waterHeight;
	if (this -> waterHeight > this -> height) {
		this -> waterHeight = this -> height;
	}
}

void Bottle::substractWater(float waterVolume) {
	float rds = this -> radius;
	float waterHeight = waterVolume / (PI * rds * rds);
	this -> waterHeight -= waterHeight;
	if (this -> waterHeight < 0) this -> waterHeight = 0;
}


float Bottle::getWaterHeightIfVolume(float waterVolume) const {
	float rds = this -> radius;
	float alas = PI * rds * rds;
	return (waterVolume / alas);
}

void Bottle::pourWaterTo(Bottle& other) {
	float ords = other.radius;
	float ohgt = other.height;
	float owtr = other.waterHeight;
	float VolumeNeed = PI * ords * ords * (ohgt - owtr);
	float hgt = this -> waterHeight;
	float rds = this -> radius;
	float waterVolume = PI * rds * rds * hgt;
	float heightNeed = VolumeNeed / (PI * rds * rds);
	other.addWater(waterVolume);
	this -> waterHeight -= heightNeed;
	if (this -> waterHeight < 0) {
		this -> waterHeight = 0;
	}
}