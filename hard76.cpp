//
// Created by hello on 8/14/22.
//

#include <iostream>
#include <unordered_map>

using namespace std;
string minWindow(string s, string t) {
    if(t.length()>s.length())return "";
    unordered_map<char,int>need,window;
    for(char c:t){need[c]++;}
    int left=0,right=0;
    int valid=0;
    int len=INT_MAX,start=0;   //最小子串
    while (right<s.length()){
        char c=s[right];
        right++;
        if(need.count(c)){
            window[c]++;
            if(window[c]==need[c]){
                valid++;
            }
        }
        while (valid==need.size()){   //左边进行收缩
            if(len>right-left){
                len=right-left;
                start=left;
            }
            char d=s[left];
            if(need.count(d)){
                if(need[d]==window[d]){
                    valid--;
                }
                window[d]--;
            }
            left++;
        }
    }
    return len==INT_MAX?"":s.substr(start,len);
}
int main(){
//    string ans=minWindow("ADOBECODEBANC","ABC");
    string ans=minWindow("a","aa");
    cout<<"ans:"<<ans<<endl;
}


















































