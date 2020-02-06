#include "Box.hpp"
#include <iostream>

using namespace std;

int main() {
	Box *box_2 = new Box(2);
	Box *box_default = new Box();
	Box *box_1 = new Box(1);
	*box_default = *box_2;
	Box *copy_box = new Box(*box_1);
	box_2 -> peek();
	box_1 -> peek();
	delete box_2;
	delete box_1;
	delete copy_box;
	delete box_default; 

	return 0;
}