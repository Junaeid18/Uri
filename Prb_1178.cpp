#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int count {0};
    double num;
    cin >> num;
    cout<<"N["<<count<<"] = "<<setprecision(4)<<fixed<<num<<endl;
    ++count;
    while (count < 100)
    {
        num = num/2;
        cout<<"N["<<count<<"] = "<<setprecision(4)<<fixed<<num<<endl; 
        ++count;
    }
    return 0;
}