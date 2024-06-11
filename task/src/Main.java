//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.Create("Сделать практос", "Прочитать лекцию по практосу", "2022-12-31 18:00", 2, 1);
        toDoList.Create("Поиграть в компик", "Апнуть ранг в кс", "2022-12-30 10:00", 1, 2);
        toDoList.Create("Сходить в магазин", "Купить продукты", "2022-12-30 16:00", 3, 3);
        toDoList.Create("Встретиться с друзьями", "Выпить пива", "2022-12-30 16:00", 3, 1);

        System.out.println("Все задачи:");
        toDoList.AllTasks();

        toDoList.IsDone(2);

        toDoList.sortTasksByPriority();
        System.out.println("Задачи после сортировки по приоритету:");
        toDoList.AllTasks();




    }
}
