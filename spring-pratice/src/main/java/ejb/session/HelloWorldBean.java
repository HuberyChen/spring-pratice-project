package ejb.session;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import java.rmi.RemoteException;

/**
 * @author hubery.chen
 */
public class HelloWorldBean implements SessionBean {
    @Override
    public void setSessionContext(SessionContext sessionContext) throws EJBException, RemoteException {

    }

    @Override
    public void ejbRemove() throws EJBException, RemoteException {

    }

    @Override
    public void ejbActivate() throws EJBException, RemoteException {

    }

    public String sayHello() {
        return "Hello World";
    }

    @Override
    public void ejbPassivate() throws EJBException, RemoteException {

    }
}
