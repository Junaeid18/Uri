#include <iostream>
using namespace std;
int main()
{
    int t,count {0};
    cin >> t;
    while (count < 1000)
    {
        int a {0};
        while (a < t && count < 1000)
        {
            cout<<"N["<<count<<"] = "<<a<<endl;
            ++a;
            ++count;
        }
        
    }

    return 0;
}