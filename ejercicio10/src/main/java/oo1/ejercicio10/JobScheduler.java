package oo1.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public abstract class JobScheduler {
    protected List<JobDescription> jobs;

    public JobScheduler() {
        this.jobs = new ArrayList<>();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public abstract JobDescription strategy();

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public JobDescription next() {
        return this.strategy();
    }
}
