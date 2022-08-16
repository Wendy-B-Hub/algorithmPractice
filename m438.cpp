//
// Created by hello on 8/13/22.
//


#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

vector<int> findAnagrams(string s, string p) {
    vector<int>v1;
    if(p=="" || s=="")return v1;
    unordered_map<char,int>need,window;
    for(char c:p)need[c]++;
    int right=0,left=0;
    int valid=0;
    while (right<s.length()){
        char c=s[right];
        right++;
        if(need.count(c)){
            window[c]++;
            if(window[c]==need[c]){
                valid++;
            }
        }

        while (right-left>=p.size()){
            if(valid==need.size()){
                v1.push_back(left);
            }
            char d=s[left];
            if(need.count(d)){
                if(window[d]==need[d]){
                    valid--;
                }
                window[d]--;
            }
            left++;
        }
    }
    return v1;
}

int main(){
//    vector<int>v1=findAnagrams("cbaebabacd","abc");
    vector<int>v1=findAnagrams("abab","ab");
    for (int i = 0; i < v1.size(); ++i) {
        cout<<v1[i]<<endl;
    }
}