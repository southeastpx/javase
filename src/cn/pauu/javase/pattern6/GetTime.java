package cn.pauu.javase.pattern6;

/**
 * ���󣺼���һ�γ����ִ��ʱ��(ʹ��ģ�����ģʽ)
 * 
 * @author peng.xing
 *
 */
public abstract class GetTime {
	public long execute() {
		long startTime = System.currentTimeMillis();
		code();
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

	public abstract void code();
}
