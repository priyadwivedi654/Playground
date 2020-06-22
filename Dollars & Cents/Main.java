#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int e=a+c;
  int f=b+d;
  while (f>100)
  {
   f=f-100;
    e=e+1;
    break;
  }
  cout<<e<<"\n"<<f;
  return 0;
}
  