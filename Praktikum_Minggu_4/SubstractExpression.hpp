#ifndef _SUBSTRACT_EXPRESSION_HPP_
#define _SUBSTRACT_EXPRESSION_HPP_

#include "Expression.hpp"


class SubstractExpression : public BinaryExpression {
		Expression *x;
		Expression *y;
	public :
		SubstractExpression(Expression *x, Expression *y);
		int solve();
};

#endif
