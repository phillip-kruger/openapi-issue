package org.cristian.resources.v1.results;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.quarkus.runtime.annotations.RegisterForReflection;
import org.cristian.models.BaseModel;

import java.util.List;

@RegisterForReflection
@JsonPropertyOrder({ "result", "status", "error" })
public class ResultList<T extends BaseModel> {
    private List<T> result;
    private Message error;
    private Integer status;

    public List<T> getResult() {
        return result;
    }

    public Message getError() {
        return error;
    }

    public Integer getStatus() {
        return status;
    }

    public static class ResultBuilder<T extends BaseModel> {
        private Integer status;
        private Message error = new Message();
        private List<T> result;

        public ResultList.ResultBuilder status(Integer status) {
            this.status = status;
            return this;
        }

        public ResultList.ResultBuilder error(String message) {
            this.error = new Message(message);
            return this;
        }

        public ResultList.ResultBuilder error(String message, String description) {
            this.error = new Message(message, description);
            return this;
        }

        public ResultList.ResultBuilder result(List<T> result) {
            this.result = result;
            return this;
        }

        public ResultList<T> build() {
            ResultList response = new ResultList<T>();
            response.status = this.status;
            response.error = this.error;
            response.result = this.result;
            return response;
        }
    }
}
