#include <iostream>
using namespace std;
int main()
{
    int n,sum {0};
    cin >> n;
    sum = n;
    while (n-1 > 0)
    {
        sum = sum * (n-1);
        n--;
    }
    cout<<sum<<endl;



    return 0;
}