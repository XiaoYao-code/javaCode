package code421;

/*public class LinkListMerge {*/
    //合并两有序单链表
/*
    LinkNode* LinkListMerge(LinkNode* head1, LinkNode* head2)
    {
        if(head1 == NULL)
        {
            return head2;
        }
        if(head2 == NULL)
        {
            return head1;
        }
        LinkNode* cur;
        if(head1->data > head2->data)
        {
            cur = head2;
            head2 = head2->next;
        }
        else
        {
            cur = head1;
            head1 = head1->next;
        }
        LinkNode* tail = cur;
        while(head1 != NULL && head2 != NULL)
        {
            if(head1->data <= head2->data)
            {
                tail->next = head1;
                head1 = head1->next;
            }
            else
            {
                tail->next = head2;
                head2 = head2->next;
            }
            tail = tail->next;
        }
        if(head1 != NULL)
        {
            while(head1)
            {
                tail->next = head1;
                tail = tail->next;
                head1 = head1->next;
            }
        }
        if(head2 != NULL)
        {
            while(head2)
            {
                tail->next = head2;
                tail = tail->next;
                head2 = head2->next;
            }
        }
        return cur;
    }
*/

