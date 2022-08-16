//
// Created by hello on 8/13/22.
//


#include <iostream>
#include <string>
#include <unordered_map>
using namespace std;

string minWindow(string s, string t) {
    unordered_map<char,int>need,window;
    for(char c:t){
        need[c]++;
//        cout<<need[c]<<endl;
    }
    cout<<need.count(190)<<endl;
        int left=0;
        int right=0;
        int valid=0;
        int len=INT_MAX;   //记录最短的长度
        int start=0;
    while (right < s.size()) {
        char c = s[right];   // // c 是将移入窗口的字符
        right++;    //   扩大窗口
        if (need.count(c)) {   //这个字母在子串里面
            window[c]++;    //那么窗口对应的字母就自增
            if (window[c] == need[c]){  //对于某个字母，如果窗口中个数=所需的个数
                valid++;  //目前满足条件的个数
            }
        }
        //判断左侧窗口是否要收缩
        //找到了所需要的所有字母，并且满足个数
        while (valid == need.size()) {   //开始缩小窗口
            cout<<"test left"<<endl;
            if (right - left < len) {   // // 在这里更新最小覆盖子串
                cout<<"test len"<< len<<endl;
                start = left;   //start记录slow值，不会因为每次自增slow而丢失数据
                len = right - left;   //important!! 这里的fast是自增后，保证了substr(start,len)可以取到最后一位
            }
            char t = s[left];   // t 是将移出窗口的字符
            left++;
            if (need.count(t)) {   //被丢弃的t如果是need中的话
                if (need[t] == window[t]) {  //是不是所需要的数据,代码处理的技巧
                    valid--;
                }
                window[t]--;   //那么窗口中对应的减少
            }
        }
    }
    return len ==INT_MAX?"":s.substr(start,len);
    }

int main(){
//    string ans=minWindow("ADOBECODEBANC","ABC");
    string ans=minWindow("ADOBECODEBANC","ABC");
    cout<<ans<<endl;
    return 0;
}










































