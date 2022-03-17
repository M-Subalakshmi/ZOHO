2. Program to check whether the given matrix is an upper triangular or lower triangular.
The constraint was each element should be visited only once. 

 Input:
 4 6 1 4
 0 3 5 9
 0 0 6 2
 0 0 0 8
 
 Output: Upper Triangular Matrix 
 
 Input:
 1 0 
 1 1
 Output: Lower Triangular Matrix

#include <stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int a[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&a[i][j]);
        }
    }
    int flag=0;
    for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
            if(a[i][j]!=0) flag=0;
            else flag=1;
        }
    }
    if(flag==0) printf("Lower triangular matrix");
    else printf("Upper triangular matrix");
    return 0;
}
