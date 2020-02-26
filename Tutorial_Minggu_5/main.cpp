#include <bits/stdc++.h>

using namespace std;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
		
	int n;
	cin >> n;
	if (n <= 0) {
		cout << "-" << '\n';
		cout << "-" << '\n';
		cout << "-" << '\n';
		cout << "-" << '\n';
		cout << 0 << '\n';
		return 0;
	}
	vector<double> v(n);
	for (auto &e : v) cin >> e;
	cout << accumulate(v.begin(), v.end(), 0) / (double) n << '\n';
	vector<double> w = v;
	sort(w.begin(), w.end());
	if (n & 1) cout << w[(n + 1) / 2 - 1] << '\n';
	else cout << (w[n / 2] + w[n / 2 - 1]) / 2.0 << '\n';
	map<double, int> mp;
	for (auto &e : v) mp[e]++;
	int oc = 0;
	double modus = -1;
	for (auto &e : mp) {
		if (e.second > oc) {
			modus = e.first;
			oc = e.second;
		} else if (e.second == oc) {
			modus = min(modus, e.first);
		}
	}
	cout << modus << '\n';
	for (int i = 0; i < mp[modus]; i++) {
		v.push_back(modus);
	}
	int len = v.size();
	for (int i = 0; i < len; i++) {
		cout << v[i] << (i == len - 1 ? '\n' : ' ');
	}
	cout << len << '\n';

	return 0;
}