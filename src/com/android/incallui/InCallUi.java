package com.android.incallui;

import com.android.internal.telephony.TelephonyConstants;

public class InCallUi {
    private static InCallUi sMe;
    private int mActiveSimId = TelephonyConstants.DSDS_SLOT_1_ID;

    public static synchronized InCallUi getInstance() {
        if (sMe == null) {
            sMe = new InCallUi();
        }
        return sMe;
    }

    void setActiveSimId(int simId) {
        android.util.Log.d("InCallUi", "setActiveSimId: "+simId);
        mActiveSimId = simId;
    }

    boolean isSlotOne() {
        return mActiveSimId == TelephonyConstants.DSDS_SLOT_1_ID;
    }


}
