package com.dungeonclicker.model;

import com.dungeonclicker.model.enums.BackpackSpaceType;

public class Backpack {

    private BackpackSpaceType[][] backpack = new BackpackSpaceType[2][8];

    public Backpack() {
        for (BackpackSpaceType[] row : this.backpack) {
            for (BackpackSpaceType slot : row) {
                slot = BackpackSpaceType.DISABLED;
            }
        }
    }


    public BackpackSpaceType[][] getBackpack() {
        return backpack;
    }

    public void setBackpack(BackpackSpaceType[][] backpack) {
        this.backpack = backpack;
    }
}
