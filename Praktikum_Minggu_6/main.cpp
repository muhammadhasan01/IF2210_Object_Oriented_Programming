// author : mhasan01
#include <bits/stdc++.h>

using namespace std;

int main() {
		
	int n, m;
	map<string, int> mp;

	cin >> n;
	for (int i = 0; i < n; i++) {
		string s;
		cin >> s;
		mp[s]++;
	}

	cin >> m;
	for (int i = 0; i < m; i++) {
		string s;
		cin >> s;
		mp[s]--;
	}

	for (auto& e : mp) {
		for (int i = 0; i < e.second; i++) {
			cout << e.first << endl;
		}
	}

	return 0;
}