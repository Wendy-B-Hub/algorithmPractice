//
// Created by hello on 8/14/22.
//
//此时tmp是两个独立的变量，s的值改变不影响tmp;
//cout<<str<<endl;
//cout<<tmp<<endl;
#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;
vector<vector<string>> groupAnagrams(vector<string>& strs) {
    unordered_map<string,int>mp;
    vector<vector<string>>ans;
    int pos=0;
    for(auto str:strs){
        string tmp=str;
        sort(tmp.begin(),tmp.end());
        if(mp.count(tmp)){
            ans[mp[tmp]].push_back(str);
        }else{
            mp[tmp]=pos++;
            ans.push_back({str});
        }
    }
    return ans;
}
int main(){
    vector<string>v={"eat", "tea", "tan", "ate", "nat", "bat"};
    vector<vector<string>>v2=groupAnagrams(v);
    for (int i = 0; i < v2.size(); ++i) {
        for (int j = 0; j < v2[i].size(); ++j) {
            cout<<v2[i][j]<<" ";
        }
        cout<<endl;
    }
}







































