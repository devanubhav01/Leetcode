bool isValid(char* s) {
    #include <stdbool.h>
#include <stdlib.h>
#include <string.h>

struct stack{
    int size;
    int top;
    char *arr;
};

int match(char a, char b){
    if(a=='{'&&b=='}'){
        return 1;
    }
    if(a=='('&&b==')'){
        return 1;
    }
    if(a=='['&&b==']'){
        return 1;
    }
    return 0;
}

int isEmpty(struct stack *ptr)
{
    if (ptr->top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int isFull(struct stack *ptr)
{
    if (ptr->top == ptr->size - 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void push(struct stack *ptr, int data)
{
    ptr->top++;
    ptr->arr[ptr->top] = data;
}

char pop(struct stack *ptr)
{
    char value = ptr->arr[ptr->top];
    ptr->top--;
    return value;
}

char stackTop(struct stack* z){
    return z->arr[z->top];
}

 
    struct stack *z = (struct stack *)malloc(sizeof(struct stack));
    z->size = strlen(s) + 1;
    z->top = -1;
    z->arr = (char *)malloc(z->size * sizeof(char));
    char popped_ch;

    for (int i = 0; s[i] != '\0'; i++){
        if(s[i]=='('||s[i]=='{'||s[i]=='['){
            push(z, s[i]);
        }
        else{
            if (isEmpty(z))
            {
                free(z->arr);
                free(z);
                return false;
            }
            popped_ch = pop(z);
            if (!match(popped_ch, s[i]))
            {
                free(z->arr);
                free(z);
                return false;
            }
        }
    }

    bool result = isEmpty(z);
    free(z->arr);
    free(z);
    return result;

}