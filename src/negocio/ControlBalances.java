package negocio;

import java.sql.SQLException;
import java.util.List;
import objetosNegocio.Balance;
import persistencia.BalancesDAO;

public class ControlBalances {

    private final BalancesDAO balancesDAO = new BalancesDAO();

    public void agregarBalance(Balance balance) throws SQLException {
        this.balancesDAO.agregarBalance(balance);
    }

    public boolean actualizarBalance(Balance balance) throws SQLException {
        return this.balancesDAO.actualizarBalance(balance);
    }

    public boolean eliminarBalance(Integer id) throws SQLException {
        return this.balancesDAO.eliminarBalance(id);
    }

    public Balance obtenerBalancePorId(Integer id) throws SQLException {
        return this.balancesDAO.obtenerBalancePorId(id);
    }

    public List<Balance> obtenerBalances() throws SQLException {
        return this.balancesDAO.obtenerBalances();
    }
}
