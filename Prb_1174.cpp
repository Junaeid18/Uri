#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int count {0};
    double a[100];
    while (count < 100)
    {
        cin>>a[count];
        if(a[count] <= 10){
            cout<<"A["<<count<<"] = "<< setprecision(1) << fixed << a[count]<<endl;
        }
        ++count;        
    }
    return 0;
}