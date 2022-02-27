#include <iostream>
using namespace std;
int main()
{
    int var {1},line;
    cin>>line;
    while(var < line*4){
        cout<<var<<" "<<var+1<<" "<<var+2<<" "<<"PUM"<<endl;
        var += 4;
    }
    return 0;
}