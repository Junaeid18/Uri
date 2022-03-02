#include <iostream>
using namespace std;
int main()
{
    int x[20], count {19};
    while(count >= 0){
        cin>>x[count];
        count--;
    }
    count = 0;
    while(count < 20){
        cout<<"N["<<count<<"] = "<<x[count]<<endl;
        ++count;
    }
    return 0;
}