class GoodDog
{
private int size;
public void setsize(int n)
{
size=n;
}
public int getsize()
{
return size;
}
void bark()
{
if(size>60)
{
System.out.println("bark");
}
else if(size>30)
{
System.out.println("bark bark");
}
else
{
System.out.println("bark bark bark");
}
}
}
class GoodDogTest
{
public static void main(String[] args)
{
GoodDog d1=new GoodDog();
d1.setsize(29);
System.out.println("dog one:" + d1.getsize());
d1.bark();
}
}