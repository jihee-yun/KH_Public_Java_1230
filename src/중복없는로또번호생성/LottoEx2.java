package 중복없는로또번호생성;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class LottoEx2 {
    public static void main(String[] args) {
        List<Integer> list = new Vector<>();
        int tmp;

        while(true) {
            tmp = (int)(Math.random() * 45) + 1;
//            for (int i = 0; i < 6; i++) {
            if(list.contains(tmp) == false) list.add(tmp);
            if(list.size() == 6) break;
            }
            System.out.println(list);
        }
    }

