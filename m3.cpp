//
// Created by hello on 8/13/22.
//

#include <iostream>
#include <unordered_map>
#include <string>
using namespace std;
int lengthOfLongestSubstring(string s) {
    if(s.length()==0)return 0;
    unordered_map<char,int>window;
    int left=0;
    int right=0;
    int len=INT_MIN;
    while (right<s.length()){
        char c=s[right];
        right++;
        window[c]++;
        // 判断左侧窗口是否要收缩
        while (window[c]>1){
            char d=s[left];
            // 进行窗口内数据的一系列更新
            window[d]--;

            left++;
        }
        len=len>right-left?len:(right-left);
    }
    return len;
}

int main(){
//   int ans= lengthOfLongestSubstring("abcabcbb");
//   int ans= lengthOfLongestSubstring("bbbbb");

}