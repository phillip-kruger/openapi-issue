package org.cristian.resources.v1;

import javax.ws.rs.core.Response;

import org.cristian.models.BaseModel;
import org.cristian.resources.v1.results.Result;
import org.cristian.resources.v1.results.ResultList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseResource<T extends BaseModel> {

    private static final Logger logger = LoggerFactory.getLogger(BaseResource.class);

    protected ResultList<T> getAll() {
        return new ResultList.ResultBuilder<T>()
                .status(200).build();
    }

    protected Result<T> post(T t) {
        return new Result.ResultBuilder<T>()
                .status(200).build();
    }

    protected Result<T> put(T e) {
        return new Result.ResultBuilder<T>()
                .status(200).build();
    }

    protected Response delete(T t) {
        return Response.status(Response.Status.NO_CONTENT)
                .build();
    }
}
