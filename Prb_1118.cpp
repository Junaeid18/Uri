#include <iostream>
#include <string>
#include <iomanip>
using namespace std;
int main()
{
    double score1,score2,avg,X;
    bool permit = true;
    while (permit)
    {   
        
        cin>> score1;
        while(score1<0 || score1>10){
            cout<<"nota invalida"<<endl;
            cin>> score1;
        }
        cin>> score2;
        while(score2<0 || score2>10){
            cout<<"nota invalida"<<endl;
            cin>> score2;
        }
        avg = (score1+score2)/2;
        cout<<"media = "<< setprecision(2) << fixed << avg << endl;
        cout<<"novo calculo (1-sim 2-nao)"<< endl;
        cin >> X;
        if(X == 2){
            permit = false;
        }else if (X <1 || X >2)
        {
            while (X <1 || X >2)
            {
                cout<<"novo calculo (1-sim 2-nao)"<< endl;
                cin >> X;
                if (X == 2){
                    permit = false;
                }
            }   
        }
    }
    
    return 0;
}