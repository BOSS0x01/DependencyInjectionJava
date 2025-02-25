package Metier;

import Dao.DaoImpl;
import Dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao = null;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getData() * 0.5;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
