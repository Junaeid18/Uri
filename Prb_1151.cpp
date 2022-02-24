#include <iostream>
using namespace std;
int main()
{
    int n,start {0},one {0},two {1},sum;
    cin>>n;
    cout<<0;
    while (start < n-1)
    {
        cout<<" "<<two;
        sum = one+two;
        one = two;
        two = sum;
        ++start;
    }
    cout<<endl;

    return 0;
}