package com.co.tevolvers.userinterface.dxhotels;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AplicarFiltrosUI extends PageObject {

    public static final Target RANGO_PRECIO =
            Target.the("Rango Precio").locatedBy("//tbody/tr[2]/td[1]/div[1]/div[3]/div[1]");
    public static final Target RANGO_PRECIO_CUSTOM =
            Target.the("Rango Precio").locatedBy("//a[@id='MainContentPlaceHolder_FilterFormLayout_NightlyRateTrackBar_MD']");




    public static final Target ESTRELLA1 =
            Target.the("Estrella 1").locatedBy("//span[@id='MainContentPlaceHolder_FilterFormLayout_OurRatingCheckBoxList_RB0_I_D']");

    public static final Target ESTRELLA2 =
            Target.the("ESTRELLA 2").locatedBy("//span[@id='MainContentPlaceHolder_FilterFormLayout_OurRatingCheckBoxList_RB1_I_D']");

    public static final Target BTN_APPLY =
            Target.the("ESTRELLA 2").locatedBy("//div[@id='MainContentPlaceHolder_FilterFormLayout_ApplyFilterButton_CD']");

}
