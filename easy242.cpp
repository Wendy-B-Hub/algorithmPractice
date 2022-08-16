//
// Created by hello on 8/14/22.
//
#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;
bool isAnagram(string s, string t) {
    unordered_map<char,int>mps,mpt;
    for(char c:s)mps[c]++;
    for(char c:t)mpt[c]++;
    for(char c:s){
        if(mpt[c]!=mps[c]){
            return false;
        }
    }
    return true;
}

int main(){
    bool ans=isAnagram("rat","car");
    cout<<ans<<endl;
}
