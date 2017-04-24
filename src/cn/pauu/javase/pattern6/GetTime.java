package cn.pauu.javase.pattern6;

/**
 * 需求：计算一段程序的执行时间(使用模板设计模式)
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
