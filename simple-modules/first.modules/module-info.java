// with 'open' on the module, we explicitly grant full permission for other modules to reflect on our classes
open module first.modules {
    // all directives are optional
    // 'requires' directive, declare module dependencies(runtime and compile time dependency)
    //requires module.name;
    // 'requires static' : optional dependency(compile time dependency)
    // requires static module.name;
    // 'requires transitive' force consumer to read our required dependencies, if  some module requires firstModule, then it requires module.name
    // requires transitive module.name;
    // 'exports': export public members of named package, not any other package within the module
    // exports com.my.package.name;
    // 'exports ... to ...' restrict which modules APIs are exported to
    // exports com.my.package.name to com.specific.package;
    // designate service our module consumes(use interface or abstract class), service actually means the implementation
    // exp: if module A requires module B that implements interface com.c.interface from module C, can just use 'uses com.c.interface' instead of requiring C within A
    // uses class.name;
    // module can be service provider that other modules can consume
    // provides MyInterface with MyInterfaceImpl;
    // 'opens' : used to expose specific packages for reflection
    // opens com.my.package;
    // 'opens ... to ...' : selectively open our packages to a pre approved list of packages
    // opens com.my.package to moduleOne, moduleTwo, etc.;

}