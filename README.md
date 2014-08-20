#Maalr - Modern Approach to Aggregate Lexical Resources

##Quickstart

To run a demo version of [Maalr] (http://spinfo.phil-fak.uni-koeln.de/maalr.html), e.g. a german-russian dictionary version (see [russian demo](https://github.com/spinfo/maalr-core/tree/master/maalr.russian.demo)), you need first to execute the following commands:


1. Within the [maalr.parent](https://github.com/spinfo/maalr-core/tree/master/maalr.parent) project:  
``` mvm clean install -P gwt-dev -DskipTests ```
2. Within the [maalr.russian.demo](https://github.com/spinfo/maalr-core/tree/master/maalr.russian.demo) project :  
``` mvn clean install embedmongo:start jetty:run -DskipTests -Dmaalr.import ```  

