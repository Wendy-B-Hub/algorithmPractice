//
// Created by hello on 8/15/22.
//

#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;
vector<vector<string>> groupAnagrams(vector<string>& strs) {
    vector<vector<string>> ans;
    unordered_map<string, int> mp;
    int pos = 0;

    for(auto &str: strs){
        string tmp = str;
        sort(tmp.begin(), tmp.end());
        /*if(mp.find(tmp) != mp.end()) ans[mp[tmp]].push_back(str);*/
        if(mp.count(tmp))ans[mp[tmp]].push_back(str);
        else{
            mp[tmp] = pos++;
            cout<<mp[tmp]<<endl;
            ans.push_back({str});
        }
    }
    return ans;
}
int  main(){
    vector<string>v={"eat", "tea", "tan", "ate", "nat", "bat"};
    vector<vector<string>>v2=groupAnagrams(v);
    for (int i = 0; i < v2.size(); ++i) {
        for (int j = 0; j < v2[i].size(); ++j) {
            cout<<v2[i][j]<<" ";
        }
        cout<<endl;
    }
}
