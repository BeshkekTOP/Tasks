public class Task {
    private String name;
    private String description;
    private String data;
    private int time;
    private int pri;
    private boolean isDone;

    public Task(String name, String description, String data, int time, int pri) {
        this.name = name;
        this.description = description;
        this.data = data;
        this.time = time;
        this.pri = pri;
        this.isDone = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDatetime() {
        return data;
    }

    public int getPriority() {
        return pri;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void markAsDone() {
        isDone = true;
    }


}
