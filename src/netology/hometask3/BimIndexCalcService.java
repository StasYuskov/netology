package netology.hometask3;

public class BimIndexCalcService {
    public double BimIndexCalc (double weight, double height) {
        if (height > 3) {
            height /= 100;
        }
        return weight / (height * height);
    }
}
