import java.util.Scanner;


/*
 * �ļ����ƣ�����ָOffer���������Թپ������ͱ����(�����)��������41����ΪS��������������
 * ʱ�䣺2016-8-23 11:06
 * ˵����1����Ŀ������һ������S����ӡ�����к�ΪS�������������У����ٺ�����������
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
			System.out.println("û���ҵ����ʵ�������������!");
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
