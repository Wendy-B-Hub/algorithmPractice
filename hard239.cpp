//
// Created by hello on 8/14/22.
//

#include <iostream>
#include <vector>
#include <deque>
using namespace std;
class MyQue{
public:
    deque<int>deque;
    void pop(int val){
        if(!deque.empty()&&val==deque.front()){
            deque.pop_front();
        }
    }

    void push(int val){
        while (!deque.empty()&&val>deque.back()){
            deque.pop_back();
        }
        deque.push_back(val);
    }
    int front(){
       return deque.front();
    }
};
vector<int> maxSlidingWindow(vector<int>& nums, int k) {
    MyQue myQue;
    vector<int>v1;
    for(int i=0;i<k;i++){
        myQue.push(nums[i]);
    }
    v1.push_back(myQue.front());
    for(int i=k;i<nums.size();i++){
        myQue.pop(nums[i-k]);
        myQue.push(nums[i]);
        v1.push_back(myQue.front());
    }
    return v1;
}

int main(){
//    vector<int>v={1,3,-1,-3,5,3,6,7};
    vector<int>v={1};
    vector<int>res=maxSlidingWindow(v,3);
    for(int i=0;i<res.size();i++){
        cout<<res[i]<<"   ";
    }
    cout<<endl;
}











































