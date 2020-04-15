package com.kk.build2;

/*
@author kzj
@date 2020/4/15 - 14:32
*/

import java.util.Properties;

public abstract class Builder {

    public abstract Builder builderX(String msg);
    public abstract Builder builderY(String msg);
    public abstract Builder builderZ(String msg);

    abstract Product getProduct();


}
