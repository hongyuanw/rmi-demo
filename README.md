# rmi-demo
RMI means Java Remote Method Invocation. This project is a 
demo to show how RMI works.

## RMI Architecture

RMI contains three parts :
- client
- server 
- registry

A RMI server provides some services which can be registered into 
a RMI registry. Then, a RMI client finds the service it want by 
asking registry , and use the service if it exists.

![RMI Architecture](./rmi.png)

## Registry & Server

We can create a RMI registry by calling method `createRegistry`, or using 
`rmiregistry` command. However, you will get `ClassNotFound` error if you 
use `rmiregistry` command directly, because a rmi registry must load the classes
which is declared remoting. `java.rmi.server.codebase` property can be used to solve
the problem. (Unfortunately, I never do it successfully.🙃)

Actually, some applications create registry on the server machine. That is, registry 
and server are usually running in a same JVM.

## Client

Client program must use remoting interface by adding a dependency of the jar file.
IP and port are used to recognized the service's address. So, client invokes the 
remoting service by indicating IP and port.

## References

[Java RMI](https://docs.oracle.com/javase/tutorial/rmi/index.html)

[rmi.codebase](https://docs.oracle.com/javase/8/docs/technotes/guides/rmi/codebase.html)


