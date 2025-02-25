package Pres;

import Dao.DaoImpl;
import Metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
//        metier.setDao(dao);
        System.out.println("results " + metier.calcul());
    }
}
