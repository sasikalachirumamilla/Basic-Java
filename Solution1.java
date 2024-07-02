//Majority Element

import java.util.Arrays;
import java.util.Scanner;

class Solution1 {

int majorityElement(int[] nums)
{
Scanner s=new Scanner(System.in);
System.out.println("enter array");
int s1=s.nextInt();

for(int i=0;i<s1;i++)
{
int c;
Arrays.sort(nums);
int n=nums.length;
c=nums[n/2];
System.out.println("Majority element is:"+nums);
return c;
}
return 0;
}

public static void main(String[]args)
{
Solution1 s1=new Solution1();
int[] nums={1,2,1,3,4,2,4,2};
s1.majorityElement(nums);
}
}
