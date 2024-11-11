package oo1.ejercicio10;

public class Fifo extends JobScheduler {
	@Override
	public JobDescription strategy() {
		JobDescription nextJob = jobs.get(0);
        this.unschedule(nextJob);
        return nextJob;
	}
}
