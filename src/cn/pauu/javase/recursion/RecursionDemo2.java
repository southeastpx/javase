package cn.pauu.javase.recursion;

/*
 * ������һ�����ӣ��ӳ������ 3 ������ÿ���¶���һ�����ӣ�
 * 		С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
 * 		���ӵĹ���Ϊ���У�1, 1, 2, 3, 5, 8, 13, 21 ....
 */
public class RecursionDemo2 {
	public static void main(String[] args) {
		// ��һ��ͨ������ʵ��
		int[] arr = new int[20];
		arr[0] = 1;
		arr[1] = 1;
		for (int x = 2; x < 20; x++) {
			arr[x] = arr[x - 2] + arr[x - 1];
		}
		System.out.println(arr[19]);
		System.out.println("--------------------");
		// ������ͨ���ɱ����ʵ��
		/*
		 * ���ɣ�aΪ��һ�ε�b,bΪ��һ�ε�a+b
		 */
		int a = 1;
		int b = 1;
		for (int x = 0; x < 18; x++) {
			int temp = a;
			a = b;
			b = temp + b;
		}
		System.out.println(b);

		System.out.println("----------------");
		// �������ݹ����
		System.out.println(calTuZi(20));
	}

	private static int calTuZi(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return calTuZi(n - 2) + calTuZi(n - 1);
		}
	}
}
