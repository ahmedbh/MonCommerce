package moncommerce.web.controller;

import moncommerce.domain.model.Fournisseur;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import moncommerce.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@ManagedBean(name = "fournisseurController")
@ViewScoped
public class FournisseurController extends AbstractController<Fournisseur> implements Serializable {

    @Autowired
    private FournisseurService ejbFacade;

    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public FournisseurController() {
        super(Fournisseur.class);
    }

}
