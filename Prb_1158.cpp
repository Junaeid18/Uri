#include <iostream>
using namespace std;
int main()
{
    int test_case,a,b, i {0};
    cin>>test_case;
    while (i < test_case)
    {
        cin>>a>>b;
        if(a%2 == 0){
            a += 1;
        }
        int sum {0}, count {0};
        while(count < b){
            sum += a;
            a += 2;
            ++count;
        }
        cout<<sum<<endl;
        ++i;
    }
    
    return 0;
}