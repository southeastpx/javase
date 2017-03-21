package cn.pauu.javase.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.nio.channels.Pipe.SinkChannel;
import java.nio.channels.Pipe.SourceChannel;

import org.junit.Test;

public class TestPipeDemo {
	@Test
	public void test1() throws IOException {
		Pipe pipe = Pipe.open();
		Pipe.SinkChannel sinkChannel = pipe.sink();
		sinkChannel.configureBlocking(false);
		ByteBuffer buf = ByteBuffer.allocate(1024);
		buf.put("单向传输数据".getBytes());
		buf.flip();
		sinkChannel.write(buf);

		Pipe.SourceChannel sourceChannel = pipe.source();
		sourceChannel.configureBlocking(false);
		buf.flip();
		int len = sourceChannel.read(buf);
		System.out.println(new String(buf.array(), 0, len));
		sourceChannel.close();
		sinkChannel.close();
	}
}
