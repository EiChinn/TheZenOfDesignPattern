package com.eichinn.flyweight_pattern;

/**
 * Created by ei_chinn on 2016/11/24.
 */
public abstract class Flyweight {
    //内部状态
    private String intrinsic;
    //外部状态
    private final String extrinsic;
    //要求享元角色必须接受外部状态

    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    //定义业务操作
    public abstract void operate();

    //内部状态的getter／setter

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
