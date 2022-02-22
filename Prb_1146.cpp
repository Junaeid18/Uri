#include <iostream>
using namespace std;
int main()
{
    int x,start {1};
    cin>>x;
    if(x==0){
        cout<<endl;
    }else
    {
        while (x != 0)
        {
            while (start <= x)
            {
                cout<< start;
                (start < x)?cout<<" " : cout<<endl;
                ++start;
            }
            start = 1;
            cin>>x; 
        }
    }
    return 0;
}