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
    ListNode* insertGreatestCommonDivisors(ListNode* head) {
        struct ListNode* curr = head;

        if(head == NULL || head->next == NULL){
            return head;
        }

        while(curr->next != NULL){
            struct ListNode* temp = new ListNode();
            int x = std::gcd(curr->val, curr->next->val);
            temp->val = x;
            temp->next = curr->next;
            curr->next = temp;

            curr = curr->next->next;
        }

        return head;
    }
};