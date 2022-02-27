#include <iostream>
using namespace std;
int main()
{
    int x;
    cin>>x;
    while (x != 0)
    {
        int count {0},sum {0};
        if(x%2 != 0){
            ++x;
        }
        while (count < 5)
        {
            sum += x;
            x += 2;
            ++count;
        }
        cout<<sum<<endl;
        cin>>x;
    }
    return 0;
}