#include <iostream>
using namespace std;
int main()
{
    int x,y,count {0},start {1};
    cin>> x >> y;
    while (start < y+1)
    {
        while (count < x && start < y+1)
        {
            cout<<start;
            (count < x-1)?cout<<" ":cout<<endl;
            ++start;
            ++count;
        }
        count = 0;   
    }
    return 0;
}