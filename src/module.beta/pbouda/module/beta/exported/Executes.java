package pbouda.module.beta.exported;

import pbouda.module.alfa.exported.ExportedObject;
import pbouda.module.beta.internal.InternalObject;

public class Executes {

    public static ExportedObject getTransitiveObject() {
        System.out.println("Return Transitive ExportedObject");
        return new ExportedObject();
    }

    public static void callExportedObject() {
        System.out.println("Call ExportedObject");
        new ExportedObject();
    }

    public static void callInternalObject() {
        System.out.println("Call Internal Object");
        new InternalObject();
    }

    public static InternalObject getInternalObject() {
        System.out.println("Return Internal Object");
        return new InternalObject();
    }
}
