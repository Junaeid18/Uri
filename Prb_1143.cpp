#include <iostream>
using namespace std;
int main()
{
    int n,line {1};
    cin>>n;
    while (line <= n)
    {
        int l2 = line * line;
        int l3 = l2 * line;
        cout<< line << " "<<l2 << " "<< l3 <<endl;
        ++line;
    }
    
    return 0;
}