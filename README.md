
# command
gradle web:jettyRun

gradle build

gradle compareGradleBuilds

gradle fetchExternalJs

gradle build -PjsOptimize

gradle web:jsHint

gradle web:jettyRun


java -cp /Users/shuaijie/.gradle/caches/modules-2/files-2.1/org.mozilla/rhino/1.7.11/cf04bfb7dcf7bacbf93ab7727d842f3ab5a66f0d/rhino-1.7.11.jar  org.mozilla.javascript.tools.shell.Main /Users/shuaijie/document/java_frameworks/gradle/mycode/jslib/jshint-2.6.3/dist/jshint-rhino.js /Users/shuaijie/document/java_frameworks/gradle/mycode/ch11/listing_11_06-07-todo-js-code-quality/web/src/main/webapp/js/app/edit-action.js

this verison only works with gradle 5.1:


------------------------------------------------------------
Gradle 5.1
------------------------------------------------------------

Build time:   2019-01-02 18:57:47 UTC
Revision:     d09c2e354576ac41078c322815cc6db2b66d976e

Kotlin DSL:   1.1.0
Kotlin:       1.3.11
Groovy:       2.5.4
Ant:          Apache Ant(TM) version 1.9.13 compiled on July 10 2018
JVM:          1.8.0_231 (Oracle Corporation 25.231-b11)
OS:           Mac OS X 10.14.6 x86_64
