3. Find the longest increasing sub-sequence in Array.
Input : {1,5,3,7}
Output: {1,5,7} or {1,3,7}

Input : {10,22,9,33,21,50,41}
Output: {10,22,33,50}

#include <stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int a[n],curr=0;
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
        if(a[i]>curr){
            printf("%d ",a[i]);
            curr=a[i];
        }
    }
    return 0;
}
