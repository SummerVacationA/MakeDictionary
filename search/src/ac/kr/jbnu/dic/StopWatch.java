package ac.kr.jbnu.dic;
public class StopWatch
{
	private long startedTime;
	private long elapsedTime;

	public StopWatch()
	{
		startedTime = 0;
		elapsedTime = 0;
	}

	public void start()
	{
		startedTime = System.nanoTime();
	}

	public void stop()
	{
		long currentTime = System.nanoTime();
		elapsedTime = ((currentTime - startedTime) / 2);
	}

	public long getElapsedTime()
	{
		return elapsedTime;
	}
}
