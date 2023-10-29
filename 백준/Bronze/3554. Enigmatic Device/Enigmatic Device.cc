#include <bits/stdc++.h>

#define fastio ios::sync_with_stdio(0), cin.tie(0), cout.tie(0)
using namespace std;
int arr[50001];

int main() {
    fastio;
    int n, m, op, l, r, sum;
    cin >> n;
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
    }
    cin >> m;
    for (int i = 0; i < m; ++i) {
        cin >> op >> l >> r;
        if (op == 1) {
            for (int j = l - 1; j <= r - 1; ++j) {
                arr[j] = (arr[j] * arr[j]) % 2010;
            }
        } else {
            sum = 0;
            for (int j = l - 1; j <= r - 1; ++j) {
                sum += arr[j];
            }
            cout << sum << "\n";
        }
    }
    return 0;
}