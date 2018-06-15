package pe.anthony.sidp.presentation.contracts;

import io.realm.RealmList;
import pe.anthony.sidp.data.entities.MarketEntity;

public interface SupermarketContract {

    interface View{
        void showSnackbar(String message);
    }

    interface Presenter{
        void showAlertForCreateSuperMarket();
        RealmList<MarketEntity> init();
        void showAlertForEditSuperMarket(MarketEntity shop);
    }
}
