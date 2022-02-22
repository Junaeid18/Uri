#include <iostream>
#include <limits>
using namespace std;
int main()
{
    int a, n, sum {0};
    cin>> a >> n;
    while(n <= 0){
        cin>>n;
    }
    while(n > 0){
        sum += a;
        ++a;
        n--;
    }
    cout<<sum<<endl;
    return 0;
}