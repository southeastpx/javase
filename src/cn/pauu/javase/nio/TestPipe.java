package cn.pauu.javase.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.nio.channels.Pipe.SinkChannel;
import java.nio.channels.Pipe.SourceChannel;

import org.junit.Test;

public class TestPipe {
	@Test
	public void test() throws IOException {
		Pipe pipe = Pipe.open();
		SinkChannel sinkChannel = pipe.sink();
		ByteBuffer buf = ByteBuffer.allocate(1024);
		buf.put("通过pipe发送数据".getBytes());
		buf.flip();
		sinkChannel.write(buf);
		SourceChannel sourceChannel = pipe.source();
		buf.flip();
		sourceChannel.read(buf);
		System.out.println(new String(buf.array(), 0, buf.limit()));
		sinkChannel.close();
	}
}
