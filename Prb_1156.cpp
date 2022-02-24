#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    double sum {0};
    int a {1},b {1};
    while(a < 40){
        sum += (double) a/b;
        a += 2;
        b = b*2;
    }
    cout<<setprecision(2)<<fixed<<sum<<endl;

    return 0;
}