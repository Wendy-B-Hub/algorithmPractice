//
// Created by hello on 8/14/22.
//


#include <iostream>
#include <unordered_map>
using namespace std;
bool checkInclusion(string s1, string s2) {
    unordered_map<char,int>window,need;
    for(char c:s1){
        need[c]++;
    }
    int left,right=0;
    int flag=false;
    int len=0;
    int valid=0;
    while (right<s2.length()){
        char c=s2[right];
        right++;
        if(need.count(c)){
            window[c]++;
            if(window[c]==need[c]){
                valid++;
            }
        }
        while (right-left>=s1.size()){
            if(valid==need.size()){
                flag=true;
            }
            char d=s2[left];
            if(need.count(d)){
                if(window[d]==need[d]){
                    valid--;
                }
                window[d]--;
            }
            left++;
        }
    }
    return flag;
}
int main(){
    bool ans=checkInclusion("hello","ooolleoooleh");
//    bool ans=checkInclusion("abcdxabcde","abcdeabcdx");
//    bool ans=checkInclusion("ab","eidbaooo");
    if(ans){
        cout<<"true"<<endl;
    }else{
        cout<<"false"<<endl;
    }
    return 0;
}







































