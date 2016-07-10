import java.io.*;
class Des
{
public static void main(String arg[])
{
int []a=new int[5];
int []b=new int[5];
int []c=new int[5];
int i=0,j=0;
DataInputStream inp=new DataInputStream(System.in);
System.out.print("Enter the array values");
for(i=0;i<5;i++)
{
a[i]=inp.readLine();
}
for(i=0;i<5;i++)
{
while(a[i]>0)
{
b[j++]=a[i]%2;
a[i]=a[i]/2;
}
for(j=0;j<5;j++)
{
System.out.print(" +b[j]+ ");
}
}
for(j=0;j<5;j++)
{
int c[k]=b[j].split("0");
System.out.print("After Splitting:"+c[k]);
}
for(k=0;k<5;k++)
{
int length[]=new int[20];
length[k]=c[k].length();
System.out.print("Length is:"+length[k]);
}
for(int e=0;e<5;e++)
{
for (int f=0;f<5;f++)
{
if(length[e]>length[f])
{
int temp;
temp=length[e];
length[e]=length[f];
length[f]=temp;
}
}
}
System.out.print("The array in descending order i"+length[f]);
}
}








