# Java Modules - Pitfalls

```
rm -rf out && javac -d out --module-source-path src -m module.starter
```

```
java -Xlog:module*=debug --module-path out -m module.starter/pbouda.module.starter.Application
```

Extensive logging:
(\* because of ZSH)
```
java --module-path out -Xlog:module\*=debug -m module.starter/pbouda.module.starter.Application
java --module-path out --show-module-resolution -m module.starter/pbouda.module.starter.Application
```

```
You can verify that by printing the thread ID with -Xlog:module*=debug:stdout:tid, 
which shows the same ID for all module related operations.
```


## Don't use a dash in the module packages

- the module folder has to have the same name as a name of the module in module-info

This won't be compiled:
`src/module-alfa/...`

```
javac -d out --module-source-path src -m module.alfa
error: module module.alfa not found in module source path
```

The correct way:
```
src/module.alfa/...
```

## Return internal type

I can use function which returns an internal type until I assign this type or create an import.

Once you call the method on the return internal object then it fails, even if you don't use the type explicitly.
Example:

```
Executes.getInternalObject().toString();

src/module.starter/pbouda/module/starter/Application.java:13: error: Object.toString() is defined in an inaccessible class or interface
        Executes.getInternalObject().toString();
```

