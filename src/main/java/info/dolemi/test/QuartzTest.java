package info.dolemi.test;

import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.scheduling.concurrent.ScheduledExecutorFactoryBean;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;

import junit.framework.TestCase;

public class QuartzTest extends TestCase {
	
	
	public void test1() throws SchedulerException {
		StdSchedulerFactory factory = new StdSchedulerFactory();
		
		Scheduler scheduler = factory.getScheduler();
		
		scheduler.start();
		
		JobDetail newJob = JobBuilder.newJob(HelloJOb.class).build();
		
		CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
		
		
		CronTrigger newTrigger = cronTriggerFactoryBean.getObject();
		
		scheduler.scheduleJob(newJob, newTrigger);
	
	}
	
}
