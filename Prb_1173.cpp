#include <iostream>
using namespace std;
int main()
{
    int x[10], counter {0};
    cin >> x[0];
    cout<<"N["<<counter<<"] = "<< x[counter]<< endl;
    ++counter;
    while(counter < 10){
        x[counter] = x[counter-1] * 2;
        cout<<"N["<<counter<<"] = "<< x[counter]<< endl;
        ++counter;
    }
    return 0;
}