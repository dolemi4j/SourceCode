package info.dolemi.test;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJOb implements Job {

	
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("hello world -------------");
	}

}
