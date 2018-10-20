package pbouda.module.starter;

import pbouda.module.beta.exported.Executes;

public class Application {

    public static void main(String[] args) {
        Executes.callExportedObject();
        Executes.getTransitiveObject();
        Executes.callInternalObject();
        Executes.getInternalObject();

//        Executes.getInternalObject().toString();
    }
}
