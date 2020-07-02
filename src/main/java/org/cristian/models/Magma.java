package org.cristian.models;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.UUID;

@RegisterForReflection
public class Magma extends BaseModel {

    private String codename;
    private String tier;
    private KingCrimson deployment;

    public Magma() {
    }

    public Magma(UUID id) {
        super(id);
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public KingCrimson getDeployment() {
        return deployment;
    }

    public void setDeployment(KingCrimson deployment) {
        this.deployment = deployment;
    }

}
