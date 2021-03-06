package moncommerce.web.controller;

import moncommerce.domain.model.LigneCommandeClient;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import moncommerce.service.LigneCommandeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@ManagedBean(name = "ligneCommandeClientController")
@ViewScoped
public class LigneCommandeClientController extends AbstractController<LigneCommandeClient> implements Serializable {

    @Autowired
    private LigneCommandeClientService ejbFacade;

    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public LigneCommandeClientController() {
        super(LigneCommandeClient.class);
    }

    @Override
    protected void setEmbeddableKeys() {
        this.getSelected().getLigneCommandeClientPK().setIDCommandeClient(this.getSelected().getCommandeClient().getIDCommandeClient());
        this.getSelected().getLigneCommandeClientPK().setIDProduit(this.getSelected().getProduit().getIDProduit());
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setLigneCommandeClientPK(new moncommerce.domain.model.LigneCommandeClientPK());
    }

}
