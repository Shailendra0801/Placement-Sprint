/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* modifiedList(vector<int>& nums, ListNode* head) {

        set<int> cmp;
        cmp.insert(nums.begin(), nums.end());

        struct ListNode* dummy = new ListNode;
        dummy->next = head;
        struct ListNode* i = head;
        struct ListNode* j = NULL;

        j = dummy;
        while(i != NULL){
            if(!(cmp.count(i->val))){
                j = i;
                i = i->next;
                
            }
            else{
                j->next = i->next;
                i = i->next;
            }
        }

        head = dummy->next;

        return head;
    }
};