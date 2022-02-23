#include <iostream>
using namespace std;
int main()
{
    int x,z,start {1},sum = 0;
    cin>>x;
    cin>>z;
    while (x >= z)
    {
        cin>> z;
    }
    sum += x;
    while(sum < z){
        sum += x;
        ++x;
        ++start;
    }
    cout<<start<<endl;
    return 0;
}