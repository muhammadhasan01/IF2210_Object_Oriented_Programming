#include "NegativeExpression.hpp"
#include <iostream>

using namespace std;

NegativeExpression::NegativeExpression(Expression *x) : UnaryExpression(x) {
	this->x = x;
}

int NegativeExpression::solve() {
	return -x->solve();
}