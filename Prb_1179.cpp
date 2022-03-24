//Not solved
#include <iostream>
using namespace std;
int main()
{
    int a1[5],a2[5],count {0},num,c1 {0},c2 {0};
    while (count < 15)
    {
        cin>>num;
        if(num % 2 == 0 & c1 < 5){
            a1[c1] = num;
            ++c1;
            if(c1 == 4){
                for (int i : a1)
                {
                    cout<<"par["<<i<<"] = "<< a1 <<endl;
                }
                c1 = 0;  
            }
        }else{
            a2[c2] = num;
            ++c2;
            if(c2 == 4){
                for (int i : a2)
                {
                    cout<<"par["<<i<<"] = "<< a2 <<endl;
                }
                c2 = 0;
            }
        }
    }
    
    

    return 0;
}