package com.sgtesting.interphase;
interface College1
{
	static void displayBranches(String branches[])
	{
		System.out.println("Branch Name");
		for(int i=0;i<branches.length;i++)
		{
			System.out.println(branches[i]);
		}
	}
}
class SLNEngg1 implements College1

{
	public void displayCollegeName(String Name)
	{
		System.out.println("Engineering college Name");
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
	SLNEngg1 obj=new SLNEngg1();
	obj.displayCollegeName("MCE");
	String branches[]= {"CSE","EEE","MECH"};
	College1.displayBranches(branches);
	}

}
