//collection_____example of set
import java.util.*;
class setdemo
{
	void func()
	{
		Set a=new HashSet();
		a.add("Coke");
		a.add("perk");
		a.add("800");
		a.add("zeher");
		a.add("zeher");

		if(a.Contains("apoorv"))
		{
			System.out.println("array blank");
			System.out.println(a);
		}
		else
		{
		System.out.println(a);
		System.out.println("no of items "+a.size());
		}
	}
	public static void main(String args[])
	{
		setdemo obj=new setdemo();
		obj.func();
	}
}
		