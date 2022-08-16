//
// Created by hello on 8/13/22.
//

#include <iostream>
#include <unordered_map>
using namespace std;

//数组中查找最大元素
pair<int,char> findMax(int nums[26]){
    int maxf=-1;
    int idx=-1;
    for(int i=0;i<26;i++){
        if(nums[i]>maxf){
            maxf=nums[i];
            idx=i;
        }
    }
    return make_pair(maxf,idx+'A');
}

int characterReplacement(string s, int k) {
    int window[26];
    for(int i=0;i<26;i++)window[i]=0;  //初始化很重要
    int len=INT_MIN;
    int left=0,right=0;
    int maxf=-1;
    while (right<s.length()) {
        char c=s[right];
        int idx=c-'A';
        right++;
        int curlen=right-left;
        window[idx]++;
        maxf=max(maxf,window[idx]);   //最频繁出现的元素
        if(curlen-maxf<=k){
            len=len>right-left?len:(right-left);
        }
/*        "AAAA"
        2*/
        while (curlen-maxf>k &&left<=right){
            char d=s[left];
            int ix=d-'A';
            window[ix]--;
            pair<int,char> p= findMax(window);
            maxf=p.first;
            left++;
            curlen--;
        }
    }
    cout<<"len:"<<len<<endl;
    return len;
}

int main(){
//    int ans=characterReplacement("AAAA",2);
    int ans=characterReplacement("ABAA",0);
    cout<<"ans:"<<ans<<endl;
//    int ans=characterReplacement("AABABBA",1);
//    char c=1+'A';   //B
//    cout<<"c:"<<c<<endl;


}