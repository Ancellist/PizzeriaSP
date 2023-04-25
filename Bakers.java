import java.util.ArrayList;
import java.util.List;

public class Bakers extends Workers{
    private int work_exp;
    private static List<Bakers> bakers = new ArrayList<>();
    public Bakers(String name_worker,int year_born,int work_exp,String status){
        super(name_worker,year_born,status);
        this.work_exp = work_exp;
    }

    public int getWork_exp(){
        return work_exp;
    }
    static Bakers baker1 = new Bakers("Пекарь1",2000,3,"Ожидает");
    static Bakers baker2 = new Bakers("Пекарь2",2000,2,"Ожидает");
    static Bakers baker3 = new Bakers("Пекарь3",2000,1,"Ожидает");
    static Bakers baker4 = new Bakers("Пекарь4",2000,6,"Ожидает");



    public static void completionBakersArrList(){
        bakers.add(baker1);
        bakers.add(baker2);
        bakers.add(baker3);
        bakers.add(baker4);
    }


    public static void getOrder(){


    }

}