#include<iostream>
using namespace std;
int main()
{
  int sum =0,num,rem;
  cin>>num;
  int n=num;
  while(n)
  {
    rem=n%10;
    sum=sum+rem;
    n=n/10;
  }
  int res=num%sum;
  if(res == 0)
    cout<<"Harshad Number";
  else
     cout<<"Not Harshad Number";
   return 0; 
}
