import java.util.ArrayList;
import java.util.List;

public class OrderList {
    public static List<Integer> pizzaAmountList = new ArrayList<>();
    public static List<String> pizzaStatusList = new ArrayList<>();

    public void orderList(){
        pizzaAmountList.add(2);
        pizzaStatusList.add("Ожидает");
        pizzaAmountList.add(1);
        pizzaStatusList.add("Ожидает");
    }
}