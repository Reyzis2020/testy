package homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zoo {


    private int bearsCount;
    private int giraffesCount;
    private int elephantsCount;
    private int tigersCount;
    private int parotsCount;
    private int raccoonsCount;


    public static void main(String[] args) throws IOException {

        //Ввод с клавиатуры

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //Создаём объект типа Zoo, для обращения к сеттерам и геттерам.

        Zoo zoo = new Zoo();

        // Вводим с клавиатуры количество каждого вида животных и записываем значения в переменную через сеттер.

        System.out.println("Введите изначальное количество медведей.");
        zoo.setBearsCount(Integer.parseInt(bf.readLine()));
        System.out.println("Введите изначальное количество жирафов.");
        zoo.setGiraffesCount(Integer.parseInt(bf.readLine()));
        System.out.println("Введите изначальное количество cлонов.");
        zoo.setElephantsCount(Integer.parseInt(bf.readLine()));
        System.out.println("Введите изначальное количество тигров.");
        zoo.setTigersCount(Integer.parseInt(bf.readLine()));
        System.out.println("Введите изначальное количество попугаев.");
        zoo.setParotsCount(Integer.parseInt(bf.readLine()));
        System.out.println("Введите изначальное количество енотов.");
        zoo.setRaccoonsCount(Integer.parseInt(bf.readLine()));


        // Здесь выполняется само задание, выводим на экран результаты работы 3х методов, по условию задачи

        System.out.println("Изначальное количество всех животных в зоопарке в первый год без учёта енотов "
                +countAnimals(zoo.getBearsCount(), zoo.getGiraffesCount(), zoo.getElephantsCount(), zoo.getTigersCount(),
                zoo.getParotsCount()));

        System.out.println("Количество всех животных в зоопарке через один год без учёта енотов "
                +countAnimalsNextYear(zoo.getBearsCount(), zoo.getGiraffesCount(), zoo.getElephantsCount(),
                zoo.getTigersCount(), zoo.getParotsCount()));

        System.out.println("Количество всех животных в зоопарке через один год c учётом енотов "
                +countAnimalsNextYear(zoo.getBearsCount(), zoo.getGiraffesCount(), zoo.getElephantsCount(),
                zoo.getTigersCount(), zoo.getParotsCount(), zoo.getRaccoonsCount()));



    }

    //Первый метод без учёта процентов прироста, считает изначальное количество животных без учёта енотов

    public static double countAnimals(int bearsCount, int giraffesCount,int elephantsCount,
                                   int tigersCount, int parotsCount){
        return bearsCount + giraffesCount + elephantsCount + tigersCount+parotsCount;

    }
    // Второй метод с учётом годового прироста, считает количество животных через год без учёта енотов

    public static double countAnimalsNextYear(int bearsCount, int giraffesCount,int elephantsCount,
                                   int tigersCount, int parotsCount){

        double countAnimal = animalIncrease(bearsCount, 50) + animalIncrease(giraffesCount,70)
                + animalIncrease(elephantsCount, 40) + animalIncrease(tigersCount,30)+ animalIncrease(parotsCount,120);
        return countAnimal;

    }

    // Третий метод является перегруженным, его логика состоит в добавлении прироста енотов к подсчёту общей суммы животных

    public static double countAnimalsNextYear(int bearsCount, int giraffesCount,int elephantsCount,
                                              int tigersCount, int parotsCount, int raccoonsCount){

        double countAnimal = animalIncrease(bearsCount, 50) + animalIncrease(giraffesCount,70)
                + animalIncrease(elephantsCount, 40) + animalIncrease(tigersCount,30)
                + animalIncrease(parotsCount,120) + animalIncrease(raccoonsCount,25);
        return countAnimal;

    }
    // Метод реализующий логику подсчёта прироста всех типов животных, проценты можно менять по пожеланию

    public static double animalIncrease(double animal, double percent){
        double increase = animal * percent/100;
        double count = animal + increase;
        return count;
    }





    //Cеттеры и геттеры всех полей экземпляра класса

    public int getBearsCount() {
        return bearsCount;
    }

    public int getRaccoonsCount() {
        return raccoonsCount;
    }

    public void setRaccoonsCount(int raccoonsCount) {
        this.raccoonsCount = raccoonsCount;
    }

    public int getParotsCount() {
        return parotsCount;
    }

    public void setParotsCount(int parotsCount) {
        this.parotsCount = parotsCount;
    }

    public int getElephantsCount() {
        return elephantsCount;
    }

    public void setElephantsCount(int elephantsCount) {
        this.elephantsCount = elephantsCount;
    }

    public int getTigersCount() {
        return tigersCount;
    }

    public void setTigersCount(int tigersCount) {
        this.tigersCount = tigersCount;
    }

    public int getGiraffesCount() {
        return giraffesCount;
    }

    public void setGiraffesCount(int giraffesCount) {
        this.giraffesCount = giraffesCount;
    }

    public void setBearsCount(int bearsCount) {
        this.bearsCount = bearsCount;
    }
}
