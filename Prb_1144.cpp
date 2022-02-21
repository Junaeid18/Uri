#include <iostream>
using namespace std;
int main()
{
    int n {1}, line;
    cin >> line;
    while(n <= line){
        int l2 = n * n;
        int l3 = l2 * n;
        int l4 = l2 + 1;
        int l5 = l3 + 1;
        cout<< n << " "<< l2 <<" "<< l3 <<endl;
        cout<< n << " "<< l4 <<" "<< l5 <<endl;
        ++n;
    }


    return 0;
}