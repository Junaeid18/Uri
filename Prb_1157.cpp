#include <iostream>
#include <cmath>
using namespace std;
int main()
{
    int n, i {1};
    cin>>n;
    while (i < n)
    {
        if(n%i == 0){
            cout<<i<<endl;
        }
        ++i;
    }
    cout<<n<<endl;
    return 0;
}