package com.co.tevolvers.userinterface.dxhotels;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BuscarHotel extends PageObject {

        public static final Target LOCATION =
            Target.the("Location").locatedBy("//input[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_LocationComboBox_I']");



        public static final Target COMBOLIST =
                Target.the("Location").locatedBy("//img[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_RoomsComboBox_B-1Img']");

        public static final Target SPIN =
                Target.the("Location").locatedBy("//td[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_AdultsSpinEdit_B-4']");

        public static final Target CHECK_IN =
            Target.the("Location").locatedBy("//input[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckInDateEdit_I']");


        public static final Target CHECK_OUT =
            Target.the("Location").locatedBy("//input[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckOutDateEdit_I']");

        public static final Target NUMERO_HABITACIONES =
            Target.the("Location").locatedBy("//input[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_RoomsComboBox_I']");


        public static final Target NUMERO_ADULTOS =
            Target.the("Location").locatedBy("//input[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_AdultsSpinEdit_I']");

        public static final Target NUMERO_NINOS =

                Target.the("Location").locatedBy("//input[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_ChildrenSpinEdit_I']");

        public static final Target BTN_SEARCH =
            Target.the("Location").locatedBy("//div[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_SearchButton_CD']");




}
