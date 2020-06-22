#include<iostream>
using namespace std;
int main()
{
  int a=11,x=4,i=0,num,n;
  cin>>n;
  for(i=0;i<n;i++)
  {
    num=a*a;
    cout<<num<<" ";
    a=a+4;
  }
  return 0;
}