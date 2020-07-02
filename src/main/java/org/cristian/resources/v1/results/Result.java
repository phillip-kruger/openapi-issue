package org.cristian.resources.v1.results;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.quarkus.runtime.annotations.RegisterForReflection;
import org.cristian.models.BaseModel;

@RegisterForReflection
@JsonPropertyOrder({ "result", "status", "error" })
public class Result<T extends BaseModel> {
    private T result;
    private Message error;
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public Message getError() {
        return error;
    }

    public T getResult() {
        return result;
    }

    public static class ResultBuilder<T extends BaseModel> {
        private Integer status;
        private Message error = new Message();
        private T result;

        public ResultBuilder status(Integer status) {
            this.status = status;
            return this;
        }

        public ResultBuilder error(String message) {
            this.error = new Message(message);
            return this;
        }

        public ResultBuilder error(String message, String description) {
            this.error = new Message(message, description);
            return this;
        }

        public ResultBuilder result(T result) {
            this.result = result;
            return this;
        }

        public Result<T> build() {
            Result response = new Result<T>();
            response.status = this.status;
            response.error = this.error;
            response.result = this.result;
            return response;
        }
    }
}