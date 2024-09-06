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
    ListNode* removeNodes(ListNode* head) {
        
        struct ListNode* dummy = new ListNode;

        struct ListNode* curr = head, *t;
        
        t = dummy;

        vector<int> stack;

        int x;

        while(curr != NULL){
            x = curr->val;

            curr = curr->next;

            while(!stack.empty() && stack.back() < x){
                stack.pop_back();
            }
            stack.push_back(x);
        }
        
        for(int i : stack){
            t->next = new ListNode(i, NULL);
            t = t->next;
        }

        return dummy->next;
        
        
    }
};