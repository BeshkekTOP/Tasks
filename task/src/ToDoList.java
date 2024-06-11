import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public  class ToDoList implements ITaskManager {
    private final List<Task> tasks;


    public ToDoList() {
        this.tasks = new ArrayList<>();
    }
    @Override
    public void Create(String name, String description, String data, int time, int priority) {
        Task newtask = new Task(name, description, data, time, priority);
        tasks.add(newtask);
    }

    public void Delete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Недопустимый индекс задачи");
        }
    }

    @Override
    public void IsDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsDone();
        } else {
            System.out.println("Недопустимый индекс задачи");
        }
    }

    public void AllTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Задача #" + i + ": " + tasks.get(i).getName() + " - " + (tasks.get(i).getIsDone() ? "Завершена" : "Не завершена"));
        }
    }
    public void sortTasksByPriority(){
        tasks.sort(Comparator.comparingInt(Task::getPriority));
    }
}
