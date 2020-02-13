#include "AddExpression.hpp"
#include <iostream>

using namespace std;

AddExpression::AddExpression(Expression *x, Expression *y) : BinaryExpression(x, y) {
	this->x = x;
	this->y = y;
}

int AddExpression::solve() {
	return x->solve() + y->solve();
}