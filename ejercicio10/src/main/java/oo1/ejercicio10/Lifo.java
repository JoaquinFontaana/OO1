package oo1.ejercicio10;

public class Lifo extends JobScheduler {
	@Override
	public JobDescription strategy(){
		 JobDescription nextJob = jobs.get(jobs.size()-1);
         this.unschedule(nextJob);
         return nextJob;
	}
}
