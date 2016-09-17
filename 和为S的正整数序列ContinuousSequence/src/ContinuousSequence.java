import java.util.Scanner;


/*
 * 文件名称：《剑指Offer：名企面试官精讲典型编程题(纪念版)》面试题41：和为S的连续正数序列
 * 时间：2016-8-23 11:06
 * 说明：1、题目：输入一个正数S，打印出所有和为S的连续正数序列（至少含两个数）。
 * 
 * */
public class ContinuousSequence {
	
	public static void FindContinuousSequence(int n){
		if(n<3){
			return;
		}
		int small=1,big=2;
		int currentSum=small+big;
		int middle=(1+n)/2;
		boolean isFind=false;
		
		while(small<middle){
			if(currentSum==n){
				isFind=true;
				PrintContinuousSequence(small,big);
			}
			
			while(currentSum>n){
				currentSum-=small;
				small++;
				if(currentSum==n){
					isFind=true;
					PrintContinuousSequence(small, big);
				}
			}
			big++;
			currentSum+=big;
		}
		
		if((small>=middle)&&(!isFind)){
			System.out.println("没有找到合适的连续正数序列!");
			return;
		}
	} 
	
	private static void PrintContinuousSequence(int small, int big) {
		// TODO Auto-generated method stub
		for(int i=small;i<=big;i++){
			System.out.print(i+" ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=15;
//		FindContinuousSequence(n);
		
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			FindContinuousSequence(n);
		}
	}

}
