package com.training.turkcell.structure.tests.composite;

import java.util.ArrayList;
import java.util.List;

public class Error {

    private List<Error> subErrors;
    private String      boundedContext;
    private String      microservice;
    private String      errorDesc;
    private int         errorCause;

    public Error addSubError(final Error subErrorParam) {
        if (this.subErrors == null) {
            this.subErrors = new ArrayList<>();
        }
        this.subErrors.add(subErrorParam);
        return this;
    }

    public String getBoundedContext() {
        return this.boundedContext;
    }

    public Error setBoundedContext(final String boundedContextParam) {
        this.boundedContext = boundedContextParam;
        return this;
    }

    public String getMicroservice() {
        return this.microservice;
    }

    public Error setMicroservice(final String microserviceParam) {
        this.microservice = microserviceParam;
        return this;
    }

    public String getErrorDesc() {
        return this.errorDesc;
    }

    public Error setErrorDesc(final String errorDescParam) {
        this.errorDesc = errorDescParam;
        return this;
    }

    public int getErrorCause() {
        return this.errorCause;
    }

    public Error setErrorCause(final int errorCauseParam) {
        this.errorCause = errorCauseParam;
        return this;
    }

    public List<Error> getSubErrors() {
        return this.subErrors;
    }

    public String toFormattedStr(final String prefix) {
        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append(prefix);
        builderLoc.append("Error [boundedContext=");
        builderLoc.append(this.boundedContext);
        builderLoc.append(", microservice=");
        builderLoc.append(this.microservice);
        builderLoc.append(", errorDesc=");
        builderLoc.append(this.errorDesc);
        builderLoc.append(", errorCause=");
        builderLoc.append(this.errorCause);
        builderLoc.append("\n");
        builderLoc.append(prefix);
        builderLoc.append("\t");
        builderLoc.append("subErrors=\n");
        if (this.subErrors != null) {
            String nextPrefix = prefix + "\t";
            for (Error errorLoc : this.subErrors) {
                builderLoc.append("\t");
                builderLoc.append(errorLoc.toFormattedStr(nextPrefix));
                builderLoc.append("\n");
            }
        }
        builderLoc.append("]");
        return builderLoc.toString();
    }

    @Override
    public String toString() {
        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append("Error [boundedContext=");
        builderLoc.append(this.boundedContext);
        builderLoc.append(", microservice=");
        builderLoc.append(this.microservice);
        builderLoc.append(", errorDesc=");
        builderLoc.append(this.errorDesc);
        builderLoc.append(", errorCause=");
        builderLoc.append(this.errorCause);
        builderLoc.append("\n subErrors=\n");
        if (this.subErrors != null) {
            for (Error errorLoc : this.subErrors) {
                builderLoc.append("\t");
                builderLoc.append(errorLoc);
                builderLoc.append("\n");
            }
        }
        builderLoc.append("\n]");
        return builderLoc.toString();
    }

}
