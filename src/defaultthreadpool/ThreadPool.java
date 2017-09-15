package defaultthreadpool;

public interface ThreadPool<Job extends Runnable> {
    void execute(Job job);
    void shutdown();
    void addWorks(int num);
    void removeWork(int num);
    int getJobSize();
}
