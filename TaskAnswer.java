package homework6;

public class TaskAnswer {


    /*
    Задача:
    В офис привезли три автомата с напитками. Первый выдаёт чай, второй кофе, а третий случайным образом чай или кофе.
    Стакан любого напитка стоит одну монету. На каждом автомате есть наклейка с названием продукта, который он выдаёт.
    Так получилось, что на заводе перепутали местами наклейки и на каждом автомате оказалась неправильная.
    Сколько нужно потратить монет, чтобы выяснить, где какой автомат?
     */
    public static void main(String[] args) {
        System.out.println( "\nНачнем с автомата с этикеткой «чай/кофе». " +
                "\nМы знаем, что эта этикетка неправильная, и значит, выдает он что-то одно. " +
                "\nБросив в него одну монетку, мы определим, что он выдает на самом деле - чай или кофе. " +
                "\nПредположим, нам налили чай. Значит, два остальных - это кофе и чай/кофе, а этикетки на них висят «чай» и «кофе», " +
                "\nпри этом обе неправильные. Значит тот. где написано «кофе» выдает чай/кофе, " +
                "\nа тот, который промаркирован «чай», выдает кофе. (Монетки достаточно).");
    }
}