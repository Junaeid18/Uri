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
    /* int line,num {1},line1 {1};
    cin>>line;
    //line = (line * 3) + line;
    while (line1 <= line )
    {
        cout<<num<<" "<<++num<<" "<<++num<<" "<<"PUM"<<endl;
        num += 2;
        ++line1;
    } */