#include <iostream>
#include <numeric>
#include <iomanip>
using namespace std;
int main()
{
    int x,num1, num2 , den1,den2, count {0};
    char sign,divider;
    cin>> x;
    while(count < x ){
        cin >> num1 >> divider >> den1 >> sign>> num2>> divider >> den2 ;
        int caseno;
        (sign == '+')?caseno = 1:((sign == '-')?caseno=2:((sign == '*')?caseno=3:caseno = 4));
        switch(caseno){
            case 1:
                    {int a = (num1 * den2 + num2 * den1);
                    int b = den1 * den2;
                    int c = std::gcd(a,b);
                    int e = a / c;
                    int f = b / c;
                    cout << a <<"/" << b << " = " << e << "/" << f << endl;
                    break;}
            case 2:
                    {int a = (num1 * den2 - num2 * den1);
                    int b = den1 * den2;
                    int c = std::gcd(a,b);
                    int e = a / c;
                    int f = b / c;
                    cout << a <<"/" << b << " = " << e << "/" << f << endl;
                    break;}
            case 3:
                    {int a = (num1 * num2 );
                    int b = den1 * den2;
                    int c = std::gcd(a,b);
                    int e = a / c;
                    int f = b / c;
                    cout << a <<"/" << b << " = " << e << "/" << f << endl;
                    break;}
            case 4:
                    {int a = (num1 * den2);
                    int b = num2 * den1;
                    int c = std::gcd(a,b);
                    int e = a / c;
                    int f = b / c;
                    cout << a <<"/" << b << " = " << e << "/" << f << endl;
                    break;}
        }
        ++count;
    }

    return 0;
}
