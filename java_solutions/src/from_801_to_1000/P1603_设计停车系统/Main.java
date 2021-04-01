package from_801_to_1000.P1603_设计停车系统;


class ParkingSystem {

    private final int[] arr;

    public ParkingSystem(int big, int medium, int small) {
        arr = new int[4];
        arr[1] = big;
        arr[2] = medium;
        arr[3] = small;
    }

    public boolean addCar(int carType) {
        if (arr[carType] >= 1){
            arr[carType]--;
            return true;
        }else{
            return false;
        }
    }
}



public class Main {
    public static void main(String[] args) {

    }
}
