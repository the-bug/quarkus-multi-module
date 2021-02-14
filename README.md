# Quarkus with modules(jigsaw)
This PoC-project was created to verify how java modules interact with quarkus.

I do not know if there is a good real world use case for this technical approach because two distinct micro services would be a more convenient approach.
But I have the use case that `module-b` and only `module-b` needs a service exposed by `module-a` and this service is very _heavy_ communication.
With this approach the REST-overhead is saved and encapsulation is achieved as like with pute microservices.

## Conclusion
It is possible to have different business-modules and use exposed packages in another. 
These business modules can be integrated in the quarkus module, which builds the runner jar.

### What to consider?
- Use a rather new version of `maven-compiler-plugin` everywhere in order to get modules to compile!
- Do not forget the `META-INF/beans.xml` in order to have working CDI.
- There are unnamed modules used. To use unnamed modules make this: http://tutorials.jenkov.com/java/modules.html#automatic-modules

### Verified APIs
Following APIs supported by Quarkus are verified to work in modules as well:
- ARC(CDI) (`@ApplicationScoped`, `@Inject`, ...)
- JAX-RS (`@PATH`, `@GET`)

## Drawbacks
Integration have to placed in the quarkus module.
Somehow the integration test do not work if started from eclipse...

## How can I verify that this stuff is working?
`mvn clean install` -> test from `quarkus-module` is run and this verifies that the modules `business-a/b` works

## Open questions
- How does JPA work?
- How does configuration work?
- Does the native build work?
- Find how the integration tests are started from eclipse!