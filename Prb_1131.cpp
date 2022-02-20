#include <iostream>
using namespace std;
int main()
{
    int score1,score2, win1 {0} ,win2 {0}, draw {0},permit,count {0};
    bool calc = true;
    while (calc)
    {
        cin>> score1 >> score2;
        ++count;
        (score1>score2)?++win1:((score2>score1)?++win2:++draw);
        cout<<"Novo grenal (1-sim 2-nao)"<<endl;
        cin>> permit;
        (permit == 2)?calc= false:calc= true;
    }
    cout<<count<<" grenais"<<endl;
    cout<<"Inter:"<<win1<<endl;
    cout<<"Gremio:"<<win2<<endl;
    cout<<"Empates:"<<draw<<endl;
    (win1>win2)?cout<<"Inter venceu mais"<<endl:((win2>win1)?cout<<"Gremio venceu mais"<<endl:cout<<"Não houve vencedor"<<endl);
    
    return 0;
}