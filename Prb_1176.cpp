#include <iostream>
using namespace std;
unsigned long long int further(int num){
    int count {2};
    uint64_t f {1}, s {1},sum {0};
    while (count < num)
    {
        sum = f+s;
        f = s;
        s = sum;
        ++count;
    }
    return sum;
}
int main()
{
    int x,num,count {0},first {0}, second {1};
    uint64_t sum;
    cin>>x;
    while (count < x)
    {
        cin>> num;
        sum=0;
        (num == first)?sum=first:((num<=2)?sum=second:sum=further(num));
        cout<<"Fib("<<num<<") = "<<sum<<endl;
        ++count;
    }
    return 0;
}