//
// Created by hello on 8/14/22.
//

#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;
bool containsDuplicate(vector<int>& nums) {
    unordered_map<int,int>mp;
    for (int i = 0; i < nums.size(); ++i) {
        if(mp.count(nums[i]))return true;
        mp[nums[i]]++;
    }
    return false;
}
int main(){
    vector<int>v1={1,1,3,3,4,3,2,4,2};
    bool ans=containsDuplicate(v1);
    cout<<ans<<endl;
}