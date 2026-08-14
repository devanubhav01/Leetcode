/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 int count_of_nodes(struct ListNode *head){
    int count=0;
    if(head==NULL){
        count=0;
    }
    struct ListNode *ptr=NULL;
    ptr=head;
    while(ptr!=NULL){
        count++;
        ptr = ptr->next;
    } 
    return count;
 }
struct ListNode* middleNode(struct ListNode* head) {
    int z=count_of_nodes(head);
    int position=z/2;
    int v=0;
    struct ListNode dummy;
    dummy.next=head;
    struct ListNode *prev=&dummy;
    struct ListNode *curr=head;
    
    while(v<position){
          prev->next=curr->next;
          struct ListNode *temp=curr;
          curr=curr->next;
          free(temp);
          v++;
    }
    return dummy.next;

}