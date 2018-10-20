# Java Modules - Pitfalls

```
rm -rf out && javac -d out --module-source-path src -m module.starter
```

```
java --module-path out -m module.starter/pbouda.module.starter.Application
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