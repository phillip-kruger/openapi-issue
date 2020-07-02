package org.cristian.models;

import java.util.Date;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbDateFormat;

@RegisterForReflection
public class KingCrimson extends BaseModel {

    public enum Status {
        unknown,
        success,
        failure
    }

    @JsonbDateFormat("yyyy-MM-dd'T'HH:mm:ss[.SSS]X")
    @Schema(implementation = String.class, format = "date-time")
    private Date timestamp;
    private Magma environment;
    private Status status;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Magma getEnvironment() {
        return environment;
    }

    public void setEnvironment(Magma environment) {
        this.environment = environment;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
