package more_than_1001.P5515;

class ParkingSystem {

    private int bigNum;
    private int mediumNum;
    private int smallNum;

    public ParkingSystem(int big, int medium, int small) {
        this.bigNum = big;
        this.mediumNum = medium;
        this.smallNum = small;
    }

    public boolean addCar(int carType) {
        if(carType == 1){
            if(this.bigNum==0){
                return false;
            }else{
                this.bigNum--;
            }
        }


        if(carType == 2){
            if(this.mediumNum==0){
                return false;
            }else{
                this.mediumNum--;
            }
        }

        if(carType == 3){
            if(this.smallNum==0){
                return false;
            }else{
                this.smallNum--;
            }
        }

        return true;
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
    }
}
