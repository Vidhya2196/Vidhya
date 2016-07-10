#include<stdio.h>
int main()
{
 int arr[]={1,2,3,4,5,6,7,8,9,10},size,pair;
 int arr1[][2],ctr,ctr1,ctr2;
 size=sizeof(arr)/sizeof(arr[0]);
 printf("no of children:%d",size);
 pair=size/2;
 for(ctr=0;ctr<size;ctr++)
{
 for(ctr1=ctr+1,ctr2=0;ctr1<size;ctr1++)
 {
   arr1[ctr][ctr2]=arr[ctr][ctr1];
 }
}
size=sizeof(arr1)/sizeof(arr1[0]);
for(ctr=0;ctr<size;ctr<size;ctr++)
{
  for(ctr1=0;ctr1<size;ctr1++)
  {
   printf("pair of children:%d",arr1[][])
  }
}getch();
}
