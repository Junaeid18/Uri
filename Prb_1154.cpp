#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n,count {0},sum {0};
    cin>> n;
    while (n >= 0)
    {
        sum += n;
        ++count;
        cin>>n;
    }
    double avg = (double) sum/count;
    cout<<setprecision(2)<<fixed<<avg<<endl;
    return 0;
}