#ifndef _TRIPLET_HPP_
#define _TRIPLET_HPP_

#include <iostream>

template<class T, class U, class V>
class Triplet {
private:
    T first;
    U second;
    V third;
public:
    Triplet() {}
    Triplet(T first, U second, V third) {
        this->first = first;
        this->second = second;
        this->third = third;
    }
    Triplet(const Triplet& tr) {
        this->first = first;
        this->second = second;
        this->third = third;
    }

    T getFirst() {
        return this->first;
    }
    U getSecond() {
        return this->second;
    }
    V getThird() {
        return this->third;
    }

    void setFirst(T first) {
        this->first = first;
    }
    void setSecond(U second) {
        this->second = second;
    }
    void setThird(V third) {
        this->third = third;
    }

    bool operator==(const Triplet& t) {
        return (this->first == t.first) && (this->second == t.second) && (this->third == t.third);
    }

    bool operator!=(const Triplet& t) {
        return (this->first != t.first) || (this->second != t.second) || (this->third != t.third);
    }
};

#endif
