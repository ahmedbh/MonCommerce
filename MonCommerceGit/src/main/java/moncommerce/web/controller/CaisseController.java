package moncommerce.web.controller;

import moncommerce.domain.model.Caisse;
import moncommerce.repositroy.CaisseFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "caisseController")
@ViewScoped
public class CaisseController extends AbstractController<Caisse> implements Serializable {

    @EJB
    private CaisseFacade ejbFacade;

    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public CaisseController() {
        super(Caisse.class);
    }

}