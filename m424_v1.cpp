//
// Created by hello on 8/14/22.
//

#include <iostream>
#include <unordered_map>
using namespace std;
int characterReplacement(string s, int k) {
    int window[26]={0};
    int left=0,right=0;
    int maxlen=INT_MIN;
    int maxf=-1;
    while (right<s.length()){
        char c=s[right];
        window[c-'A']++;
        maxf=max(maxf,window[c-'A']);
        int curlen=right-left+1;
        if(curlen-maxf<=k){
            maxlen=curlen>maxlen?curlen:maxlen;
        }
        if(curlen-maxf>k){
            char d=s[left];
            left++;
            window[d-'A']--;
        }
        right++;
    }
    return maxlen;
}

int main(){
//    int ans=characterReplacement("ABAA",0);
//        int ans=characterReplacement("AAAA",2);
    int ans=characterReplacement("AABABBA",1);
    cout<<"ans:"<<ans<<endl;
    return 0;
}