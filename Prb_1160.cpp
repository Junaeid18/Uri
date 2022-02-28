#include <iostream>
using namespace std;
int main()
{
    int test_case,count {0};
    cin>>test_case;
    while(count < test_case){
        int year {1},sum1 {0},sum2 {0};
        double pa,pb,gr1,gr2,s1,s2;
        cin>>pa>>pb>>gr1>>gr2;
        s1 = pa + ((pa*gr1)/100) ;   sum1 = (int)s1;
        s2 = pb + ((pb*gr2)/100) ;   sum2 = (int)s2;
        while (sum1 <= sum2)
        {
            ++year;
            if(year >100){
                break;
            }
            pa = sum1;  pb = sum2;
            s1 = pa + ((pa*gr1)/100) ;   sum1 = (int)s1;
            s2 = pb + ((pb*gr2)/100) ;   sum2 = (int)s2;
        }
        ++count;
        (year <= 100)?cout<<year<<" anos."<<endl : cout<<"Mais de 1 seculo."<<endl;
    }
    return 0;
}