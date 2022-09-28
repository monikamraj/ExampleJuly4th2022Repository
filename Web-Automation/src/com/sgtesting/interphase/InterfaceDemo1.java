package com.sgtesting.interphase;
interface College
{
	default void displayBranches(String branches[])
	{
		System.out.println("Branch Name");
		for(int i=0;i<branches.length;i++)
		{
			System.out.println(branches[i]);
		}
	}
	
}
class SLNEngg implements College
{
	public void displayCollegeName(String name)
	{
		System.out.println("College Name:"+name);
	}
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		SLNEngg obj=new SLNEngg();
		obj.displayCollegeName("MCE");
		String s[]= {"CSE","EEE","Mech"};
		obj.displayBranches(s);

	}

}
