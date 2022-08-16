//
// Created by hello on 8/13/22.
//


#include <iostream>
#include <unordered_map>
using namespace std;
bool checkInclusion(string s1, string s2) {
    if(s1.length()>s2.length())return false;
    unordered_map<char,int>need,window;
    for(char c:s1){
        need[c]++;
    }
    int left=0,right=0;
    int valid=0;
    while (right<s2.length()){
        char c=s2[right];
        right++;
        if(need.count(c)){
            window[c]++;
            if(window[c]==need[c]){
                valid++;
            }           //todo valid--
        }
        //判断做窗口是否进行收缩
        while (right-left>=s1.size()){  //每五个进行一次更新
            cout<<"right-left:"<<right-left<<endl;
            if(valid==need.size())return true;  // 在这里判断是否找到了合法的子串,这里注意valid==need.size()
            char d=s2[left];
            if(need.count(d)){   //进行窗口内数据的一系列更新
                if(need[d]==window[d]){
                    valid--;
                }
                window[d]--;
            }
            left++;
        }
    }
    return false;
}
int main(){

//    bool ans=checkInclusion("hello","ooolleoooleh");
    bool ans=checkInclusion("abcdxabcde","abcdeabcdx");
    if(ans){
        cout<<"true"<<endl;
    }else{
        cout<<"false"<<endl;
    }

}


























