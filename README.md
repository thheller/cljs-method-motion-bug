# cljs.spec problem

Cause by cross-chunk method motion partially moving a reify "class" instance and trying to add methods to a class that hasn't been defined yet. Presumably because the Closure Compiler doesn't expect classes to be defined conditionally.

```
clj build.clj
open public/index.html
```

Error happens immediately on load.