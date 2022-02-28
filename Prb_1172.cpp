#include <iostream>
using namespace std;
int main()
{
    int arr[10], i {0};
    while(i < 10){
        cin>>arr[i];
        (arr[i] <= 0)?cout<<"X["<<i<<"] = "<<1<<endl : cout<<"X["<<i<<"] = "<<arr[i]<<endl;
        ++i;
    }
    return 0;
}