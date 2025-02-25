package Pres;

import Dao.DaoImpl;
import Dao.IDao;
import Metier.IMetier;
import Metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("config.txt"));
            String doaClassName = sc.nextLine();
            Class cDao = Class.forName(doaClassName);
            IDao dao = (IDao) cDao.getConstructor().newInstance();

//            MetierImpl metier = new MetierImpl(dao);
            String metierClassName = sc.nextLine();
            Class cMetier =Class.forName(metierClassName);
            MetierImpl  metier = (MetierImpl ) cDao.getConstructor().newInstance();

//            metier.setDao(dao);
            Method setDao = cMetier.getMethod("setDao",IDao.class);
            setDao.invoke(metier,dao);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
