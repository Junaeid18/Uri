#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n {1};
    double sum {0};
    while(n < 101){
        sum += (double)1/n;
        ++n;
    }
    cout<<setprecision(2)<<fixed<<sum<<endl;
    return 0;
}