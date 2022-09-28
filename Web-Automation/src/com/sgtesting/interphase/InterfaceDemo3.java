package com.sgtesting.interphase;
interface Demo1
{
	default void display()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
interface Demo2
{
	default void display()
	{
		for(int i=0;i<=20;i++)
		{
			System.out.println(i);
		}
	}
}
class Sample implements Demo1,Demo2

{
	public void display()
	{
		for(int i=0;i<=20;i++)
		{
			System.out.println(i);
		}
	}
}

public class InterfaceDemo3 {

	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.display();
        
	}

}
