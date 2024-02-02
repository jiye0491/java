package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 25;

        String trf;
        if (distance <= 1) {
            trf = "도보";
        } else if (distance <= 10) {
            trf = "자전거";
        }else if (distance <= 100) {
            trf = "자동차";
        }else {
            trf = "비행기";
        }
        System.out.println(trf + "를 이용하세요.");
    }
}
