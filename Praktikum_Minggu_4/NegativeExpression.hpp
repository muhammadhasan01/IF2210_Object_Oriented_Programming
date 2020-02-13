#ifndef _NEGATIVE_EXPRESSION_HPP_
#define _NEGATIVE_EXPRESSION_HPP_

#include "Expression.hpp"


class NegativeExpression : public UnaryExpression {
		Expression *x;
	public :
		NegativeExpression(Expression *x);
		int solve();
};

#endif
