#include <iostream>
using namespace std;
int main()
{
    int x, count {0}, num;
    cin>> x;
    while(count < x ){
        cin >> num;
        int sum {0}, div {1};
        while (div < num)
        {
            if(num % div == 0){
                sum += div;
            }
            ++div;
        }
        (num == sum)? cout<< num << " eh perfeito"<<endl : cout<< num << " nao eh perfeito"<<endl;
        ++count;
    }
    return 0;
}