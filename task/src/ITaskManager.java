public interface ITaskManager {

    void Create(String name, String description, String data, int time, int priority);
    void Delete(int index);
    void IsDone(int index);
    void AllTasks();
}
