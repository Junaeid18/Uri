#include <iostream>
#include <string>
using namespace std;
int main()
{
    int start_day, ending_day, starting_hr,starting_min,starting_sec, ending_hr,ending_min,ending_sec;
    int result_sec,result_min,result_hr,result_day;
    string day,sign;

    cin>> day>> start_day;
    cin>> starting_hr>> sign >> starting_min >> sign >> starting_sec;

    cin>> day>> ending_day;
    cin>> ending_hr>> sign >> ending_min >> sign >> ending_sec;    

    if(starting_sec > ending_sec){
        ending_sec += 60;
        result_sec = ending_sec - starting_sec;
        starting_min += 1;
    }else{
        result_sec = ending_sec - starting_sec;
    }
    if(starting_min > ending_min){
        ending_min += 60;
        result_min = ending_min - starting_min;
        starting_hr += 1;
    }else{
        result_min = ending_min - starting_min;
    }
    if(starting_hr > ending_hr){
        ending_hr += 24;
        result_hr = ending_hr - starting_hr;
        start_day += 1;
    }else{
        result_hr = ending_hr - starting_hr;
    }

    result_day = ending_day - start_day;
    
    cout<< result_day << " dia(s)"<<endl;
    cout<< result_hr << " hora(s)"<<endl;
    cout<< result_min << " minuto(s)"<<endl;
    cout<< result_sec << " segundo(s)"<<endl;

    return 0;
}