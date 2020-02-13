#ifndef _ADD_EXPRESSION_HPP_
#define _ADD_EXPRESSION_HPP_

#include "Expression.hpp"


class AddExpression : public BinaryExpression {
		Expression *x;
		Expression *y;
	public :
		AddExpression(Expression *x, Expression *y);
		int solve();
};

#endif
