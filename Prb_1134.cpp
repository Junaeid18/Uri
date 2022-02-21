#include <iostream>
using namespace std;
int main()
{
    int alc {0}, gas {0}, die {0}, input;
    cin>>input;
    while(input != 4){
        switch (input)
        {
        case 1: alc++;
            break;
        case 2: gas++;
            break;
        case 3: die++;
            break;
        default:
            break;
        }
        cin>>input;
    }
    cout<<"MUITO OBRIGADO"<<endl;
    cout<<"Alcool: "<<alc<<endl;
    cout<<"Gasolina: "<<gas<<endl;
    cout<<"Diesel: "<<die<<endl;

    return 0;
}